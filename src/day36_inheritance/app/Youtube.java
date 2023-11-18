package day36_inheritance.app;

public class Youtube extends App {
    public Youtube(String version) {
        super("Youtube", version);
    }
    public void subscribe() {
        System.out.println("Subscribing to channel.");
    }
}