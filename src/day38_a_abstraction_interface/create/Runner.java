package day38_a_abstraction_interface.create;

public class Runner {
    public static void main(String[] args) {
        //Create c1 = new Create();     We can't have an interface object as well (like abstract class)
        Book b1 = new Book();
        b1.read();
        b1.write();
    }
}