
package main221;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] userInput = text.split(" ", 2);

        Printer printer = new Printer();
        boolean errorExist = false;
        String arguments = null;
        try {
            arguments = userInput[1];
        } catch (ArrayIndexOutOfBoundsException e) {
           errorExist = true;
        }
        CommandManeger cm = new CommandManeger(new helloWorldCommand(printer), new helloSimpleCommand(printer), new repeatCommand(printer, arguments));
        if (userInput[0].equals("hello") && errorExist ) {
            cm.setHelloWorld();
        } else if (userInput[0].equals("hello") && !errorExist ){
            cm.setSimpleHello();
            System.out.println(arguments);
        }
        if (userInput[0].equals("repeat") && !errorExist) {

            cm.repeatSameWords(arguments);

        }

    }
}

