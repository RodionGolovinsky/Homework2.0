
package main221;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //System.out.println(text);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        Object[] objects = list.toArray();
        String[] strings = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            strings[i] = (String) objects[i];
        } //converting command arguments to an array of strings
        Printer printer = new Printer();
        CommandManeger cm = new CommandManeger(new helloWorldCommand(printer),new helloSimpleCommand(printer));
        if (text.equals("hello")){
           cm.setHelloWorld();
       }
        else {
            cm.setSimpleHello();
            for (String s : strings) {
                System.out.print(s);
            }
        }
}}

