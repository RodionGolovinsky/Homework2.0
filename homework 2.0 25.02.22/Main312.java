import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main312 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//10.txt");
        Scanner scanner = new Scanner(file);
        ArrayList <String> strings = new ArrayList<>();
        while (scanner.hasNextLine()){
            strings.add(scanner.nextLine());
        }
        Object [] output = strings.toArray();
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
