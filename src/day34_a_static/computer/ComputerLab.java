package day34_a_static.computer;

public class ComputerLab {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Computer c1 = new Computer("Apple", 1499.99, "silver");
        System.out.println(Computer.hasBattery);
        System.out.println(c1.brand);
        System.out.println(c1.price);
        System.out.println(c1.color);
    }
}