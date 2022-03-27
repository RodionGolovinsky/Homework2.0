package main221;

public class CommandManeger {
    Command helloWorld;
    Command simpleHello;

    public CommandManeger(Command helloWorld, Command simpleHello) {
        this.helloWorld = helloWorld;
        this.simpleHello = simpleHello;
    }
    public void setHelloWorld() {
        helloWorld.execute();
    }
    public void setSimpleHello(){
        simpleHello.execute();
    }

}
