package main221;

public class CommandManeger {
Command hello;

    public CommandManeger(Command hello) {
        this.hello = hello;
    }
    public void setHello(){
       hello.execute();
    }
}
