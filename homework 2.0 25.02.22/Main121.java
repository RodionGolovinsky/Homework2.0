

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main121 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scan = new Scanner(reader);
        TreeSet<String> set = new TreeSet<>();
        while (scan.hasNext()) {
            set.add(scan.nextLine());
        }
        String[] array = (String[]) set.toArray();
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(array[i].length());
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[k].length() == array1[i]) {
                    System.out.println(array[k]);
                }
            }
        }
    }
}



