package day36_inheritance.app;

public class App {
    String name, version;
    public App(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public void download() {
        System.out.println(name + " is downloading " +
                "version: " + version);
    }
}