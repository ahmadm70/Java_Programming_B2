package day38_abstraction_interface.shopping;

public class Target extends Shopping {
    public void buyItem() {
        System.out.println("Buying an item from Target");
    }
    public void returnItem() {
        System.out.println("Returning an item to Target");
    }
}