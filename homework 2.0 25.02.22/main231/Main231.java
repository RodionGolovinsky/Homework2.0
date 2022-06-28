package main231;

import main231.commandManager.CommandManager;

import java.util.Scanner;

public class Main231 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        CommandManager manager = new CommandManager();
        while (true){
            System.out.println("Введите команду");
            String [] commandAndArguments = scanner.nextLine().split(" ");

            String command = commandAndArguments[0];
            String []arguments = new String[commandAndArguments.length-1];
            for (int i = 1; i < commandAndArguments.length; i++) {
                arguments[i-1] = commandAndArguments[i];
            }
            manager.execute(command,arguments);
        }
    }
}
