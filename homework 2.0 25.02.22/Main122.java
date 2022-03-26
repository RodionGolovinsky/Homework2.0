

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main122 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//7.txt");
        File file2 = new File("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//8.txt");

        FileReader fr = new FileReader(file1);
        PrintWriter pw = new PrintWriter(file2, "UTF-8");
        Scanner sc = new Scanner(fr);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        while (sc.hasNext()) {
            int a = sc.nextInt();
            hashSet.add(a);
        }
        fr.close();

        Object[] objects = hashSet.toArray();
        int[] array = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            array[i] = (int) objects[i];
            pw.println(array[i]);
        }

        pw.close();

    }
}