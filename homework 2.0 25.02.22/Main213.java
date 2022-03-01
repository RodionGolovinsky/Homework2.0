

import java.util.Scanner;

public class Main213 {
    public static void main(String[] args) throws ExceptionNotInt {
        System.out.println("Введите строку, затем нажмите Enter и введите целое положительное число:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println(text);
                }
            }
        } else {
            throw new ExceptionNotInt("Вы ввели не целое положительное число");
        }

    }

    public static class ExceptionNotInt extends Exception {
        public ExceptionNotInt(String message) {
            super(message);
        }
    }

}
