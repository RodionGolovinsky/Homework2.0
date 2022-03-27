package main221;

public class helloWorldCommand implements Command {
private Printer printer;

    public helloWorldCommand(Printer printer) {

        this.printer=printer;
    }

    @Override
    public void execute() {
        printer.printHelloWorld();
    }
}
