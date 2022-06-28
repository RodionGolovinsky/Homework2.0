package main231.commandManager;

import main231.AbstractCommand;

public class HelloCommand extends AbstractCommand {

    public HelloCommand() {
        super("hello", "name", "здаровается с {name}");
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public String getUsage() {
        return super.getUsage();
    }

    @Override
    public void execute(String[] arguments) {
        if (arguments.length != 0) {
            System.out.print("Hello, ");
            for (String arg : arguments) {
                System.out.print(arg + " ");
            }
            System.out.println("!");
        } else {
            System.err.println("Неправильное количество аргументов!");
        }

    }
}

