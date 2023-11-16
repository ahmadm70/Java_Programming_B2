package day34_a_static.computer;

public class Computer {
    String brand;
    double price;
    String color;
    static boolean hasScreen, hasBattery, hasMemory;
    static {
        System.out.println("Static block runs...");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }
    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}