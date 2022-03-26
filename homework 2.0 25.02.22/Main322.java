
/*
import java.io.*;
import java.util.Scanner;

public class Main322 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
       String name1 = scanner1.nextLine();
        System.out.println("Введите путь к файлу, в который будут записываться данные");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scanner3 = new Scanner(reader);
        PrintWriter writer = new PrintWriter(name2, "UTF-8");
        String word;
        int max;
            while (scanner3.hasNext()) {
                word = scanner3.next();
                int length = word.length();
                if (length > max) {
                    max = length;
                    string = word;
                }
            }
            writer.println(word);

        reader.close();
        writer.close();
    }
}

 */
