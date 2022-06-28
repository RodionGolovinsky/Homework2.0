package main231;

public interface Command {
    void execute(String [] arguments);
    String getInfo();
    String getUsage();
    String getName();

}
