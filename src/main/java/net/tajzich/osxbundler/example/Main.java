package net.tajzich.osxbundler.example;

public class Main {

    public static void main(String[] args) throws Throwable{

        System.out.println("Running....");

        for(String arg : args) {
            System.out.println("System arg: " + arg);
        }

        Thread.sleep(2000);

        System.out.println("....Finished");
    }
}
