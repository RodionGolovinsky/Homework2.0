package main231;

public class AbstractCommand implements Command {
    String usage;
    String info;
    String name;

    public AbstractCommand(String name, String usage, String info) {
        this.name = name;
        this.usage = usage;
        this.info = info;

    }

    @Override
    public void execute(String[] arguments) {

    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getUsage() {
        return usage;
    }

    @Override
    public String getName() {
        return name;
    }
}
