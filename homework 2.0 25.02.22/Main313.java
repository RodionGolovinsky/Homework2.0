

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main313 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//3.txt");
        Scanner scan = new Scanner(reader);
        int max = 0;
        String name = null;
        String ex = null;
       while (scan.hasNext()){
           ex = scan.nextLine();
            if (ex.length()>max){
                max = ex.length();
                name = ex;
            }
        }
        System.out.println(name);
    }
}
