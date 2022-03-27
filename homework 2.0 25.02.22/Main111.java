import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main111 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        System.out.println("Введите путь к файлу, в который будут записываться данные");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        PrintWriter writer = new PrintWriter(name2);//"UTF-8"
        Scanner scan = new Scanner(reader);
        Stack<Integer> stack = new Stack<>();
        //int c;
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                stack.push(number);
            }
        }
        reader.close();
        while (stack.size() != 0) {
            Integer a = stack.pop();
            writer.println(a);
        }
        writer.close();
    }
}






