package day36_inheritance.app;

public class Instagram extends App {
    public Instagram(String version) {
        super("Instagram", version);
    }
    public void follow() {
        System.out.println("Following my friend.");
    }
}