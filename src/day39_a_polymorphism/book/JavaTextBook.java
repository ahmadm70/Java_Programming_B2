package day39_a_polymorphism.book;

public class JavaTextBook extends EBook {
    boolean isFun;
    public void read() {
        System.out.println("Reading Java textbook");
    }
    public void download() {
        System.out.println("Downloading Java textbook");
    }
    public void open() {
        System.out.println("Opening Java textbook");
    }
}