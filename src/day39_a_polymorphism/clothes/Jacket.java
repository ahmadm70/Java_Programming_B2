package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {
    public void wear() {
        System.out.println("Wearing jacket");
    }
    public void hoodUp() {
        System.out.println("Putting hoodie up");
    }
}