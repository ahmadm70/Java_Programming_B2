package day05_variables;

public class Cellphone {
    public static void main (String [] args) {

        String brand = "Apple",
                model = "Iphone 15",
                color = "black";
        double price = 1099.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I bought " + model + " from " + brand);
        System.out.println("I ordered " + color + " color and it has a " + storage + " gb storage");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + ", the total price was $" + price);

        String fullMessage = "I bought " + model + " from " + brand + "\nI ordered " + color + " color and it has a " + storage + " gb storage \nFor the sim type " + sim + " with a camera " + hasCamera + ", the total price was $" + price;
        System.out.println();
        System.out.println(fullMessage);
    }
}
