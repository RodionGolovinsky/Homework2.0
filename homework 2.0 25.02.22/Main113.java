

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main113 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        System.out.println("Введите путь к файлу, в который будут записываться данные");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        PrintWriter writer = new PrintWriter(name2, "UTF-8");
        Scanner scan = new Scanner(reader);
        LinkedList<Integer> list = new LinkedList<>();
        int c;
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                list.add(number);
            }
        }
        while (list.size() != 0) {
            writer.println(list.peekLast());
        }
        writer.close();
    }
}
