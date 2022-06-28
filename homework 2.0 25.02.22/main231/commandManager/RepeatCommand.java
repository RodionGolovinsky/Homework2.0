package main231.commandManager;

import main231.AbstractCommand;

public class RepeatCommand extends AbstractCommand {

    public RepeatCommand() {
        super("repeat", "{count} + {name}", "повторяет введенное нами слово обозначенное кол-во раз");
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
        if (arguments.length == 2) {
            int count = 0;
            try {
                count = Integer.parseInt(arguments[0]);
            } catch (NumberFormatException e) {
                System.err.println("Количество повторений должно быть целочисленным и положительным числом!");
            }
            if (count <= 0) {
                System.err.println("Некорректный ввод аргументов, команда не может быть запущена");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println(arguments[1]);
                }
            }
        } else {
            System.err.println("Неправильное количество аргументов!");
        }

    }
}
