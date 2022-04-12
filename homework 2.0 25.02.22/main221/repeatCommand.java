package main221;

public class repeatCommand implements Command {
    private Printer printer;
    private String arguments;

    public repeatCommand(Printer printer, String arguments) {
        this.printer = printer;
        this.arguments = arguments;
    }

    @Override
    public void execute() {

    }

    @Override
    public void execute(String arguments) {
        printer.printRepeatSmth(arguments);
    }
}
