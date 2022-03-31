

import java.util.Scanner;

public class Main213 {
    public static void main(String[] args) throws NotIntException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split(" ");
        if (inputArray[0].equals("repeat") | inputArray[0].equals("repeat ")) {
            int count = 0;
            try {
                count = Integer.parseInt(inputArray[inputArray.length - 1]);
            } catch (NumberFormatException e) {
                System.err.println("Вы ввели не целочисленное значние!");

            }
            for (int k = 0; k < count; k++) {
                for (int i = 1; i < inputArray.length - 1; i++) {
                    System.out.print(inputArray[i]);
                }
                System.out.println("\n");
            }
        }
    }

}


