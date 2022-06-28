package main231.commandManager;

import main231.Command;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommandManager {
    Map<String, Command> commands = new LinkedHashMap<>();

    public CommandManager() {
        commands.put("hello", new HelloCommand());
        commands.put("repeat", new RepeatCommand());
        commands.put("help", new HelpCommand(commands));
    }

    public void execute(String commandName, String [] arguments) {
        try {
            Command command = commands.get(commandName);
            command.execute(arguments);
        } catch (NullPointerException exp) {
            System.out.println("Команда < " + commandName + " > не найдена.");
        }
    }
}
