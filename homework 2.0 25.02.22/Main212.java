
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main212 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        if (text.equals("hello")) {
            System.out.print("Hello, ");
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
}

