package main231.commandManager;

import main231.AbstractCommand;
import main231.Command;

import java.util.Map;

public class HelpCommand extends AbstractCommand {
private Map<String, Command> commands;
    public HelpCommand(Map<String, Command> commands) {
        super("help", "нет аргументов", "выводит справку по доступным командам");
        this.commands = commands;
    }

    @Override
    public void execute(String [] arguments) {
        for (Command command : commands.values()) {
            printTable(command.getName(), command.getUsage(), command.getInfo());
        }
    }
    public static void printTable(Object element1, Object element2, Object element3) {
        System.out.printf("%-37s%-1s%n", element1, element2, element3);
    }
}
