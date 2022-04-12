package main221;

public class CommandManeger {
    Command helloWorld;
    Command simpleHello;
    Command repeatCommand;

    public CommandManeger(Command helloWorld, Command simpleHello, Command repeatCommand) {
        this.helloWorld = helloWorld;
        this.simpleHello = simpleHello;
        this.repeatCommand = repeatCommand;
    }
    public void setHelloWorld() {
        helloWorld.execute();
    }
    public void setSimpleHello(){
        simpleHello.execute();
    }
    public void repeatSameWords(String arguments){
        repeatCommand.execute(arguments);
    }

}
