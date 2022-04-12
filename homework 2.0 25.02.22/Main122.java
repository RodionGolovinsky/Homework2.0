

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main122 {
    public static void main(String[] args) throws IOException {
        File file1 = new File(args[0]);
        File file2 = new File("8.txt");
        FileReader fr = new FileReader(file1);
        PrintWriter pw = new PrintWriter(file2, "UTF-8");
        Scanner sc = new Scanner(fr);
        Set<String> hashSet = new HashSet<>();
        while (sc.hasNext()) {
            String a = sc.nextLine();
            hashSet.add(a);
        }
        fr.close();
        Object[] objects = hashSet.toArray();
        String[] array = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            array[i] = (String) objects[i];
            pw.println(array[i]);
        }
        pw.close();

    }
}