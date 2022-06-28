package main221;

public class Printer {
    public void printHelloWorld() {
        System.out.print("Hello, world");
    }

    public void printSimpleHello() {
        System.out.print("Hello, ");
    }
    public void printRepeatSmth(String arguments){
        String [] argsForRepeat = arguments.split(" ");
        try{
            int count = Integer.parseInt(argsForRepeat[argsForRepeat.length-1]);
            for (int i = 0; i < count; i++) {
                for (int k = 0; k <argsForRepeat.length-1 ; k++) {
                    System.out.print(argsForRepeat[k] + " ");
                }
                System.out.print("\n");
            }
        }catch (NumberFormatException e){
            System.err.println("НЕ обнаружено целочисленного значения для того, чтобы задать кол-во повторений!");
        }
    }
}
