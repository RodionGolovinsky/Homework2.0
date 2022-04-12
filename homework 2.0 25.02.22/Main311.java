

import java.io.*;
import java.util.Scanner;

public class Main311 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//10.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();

    }
}
