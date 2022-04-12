package main221;

public class helloSimpleCommand implements Command {
    Printer printer;

    public helloSimpleCommand(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.printSimpleHello();
    }

    @Override
    public void execute(String arguments) {

    }
}
