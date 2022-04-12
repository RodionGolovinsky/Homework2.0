
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
//        File name1 = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//10.txt");
//        File name2 = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//11.txt");
        FileReader reader = new FileReader(name1);
        Scanner scanner3 = new Scanner(reader);
        PrintWriter writer = new PrintWriter(name2, "UTF-8");
        String string;
        int max;
        String biggestWord;
        while (scanner3.hasNextLine()) {
            biggestWord = null;
            max = 0;
            string = scanner3.nextLine();
            String[] words = string.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max) {
                    max = words[i].length();
                    biggestWord = words[i];
                }

            }
            writer.println(biggestWord);

        }
        reader.close();
        writer.close();
    }
}

