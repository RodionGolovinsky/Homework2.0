package main221;

public class helloCommand implements Command {
private Printer printer;

    public helloCommand(Printer printer) {

        this.printer=printer;
    }

    @Override
    public void execute() {
        printer.printHello();
    }
}
