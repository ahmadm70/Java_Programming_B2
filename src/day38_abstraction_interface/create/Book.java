package day38_abstraction_interface.create;

public class Book implements Create {
    public void read() {
        System.out.println("Reading a book");
    }
    public void write() {
        System.out.println("Writing a book");
    }
}