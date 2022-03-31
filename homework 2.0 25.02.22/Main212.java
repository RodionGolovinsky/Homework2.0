
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main212 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split(" ");
        if (inputArray[0].equals("hello")) {
            System.out.print("Hello, ");
            for (int i = 1; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " ");
            }

        }
    }
}

