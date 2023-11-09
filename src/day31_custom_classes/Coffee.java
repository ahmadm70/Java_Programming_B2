package day31_custom_classes;

public class Coffee {
    double price;
    byte size;
    String brand;
    String type;
    public String toString() {
        return "Price: $" + price + "\nSize: " + size + "oz\nBrand: " + brand + "\nType: " + type;
    }
    public void drink() {
        System.out.println("Drinking " + type + " coffee.");
        size -= 2;
    }
    public void refill(int oz) {
        if (size + oz <= 12) {
            System.out.println("Refilling " + oz + "oz " + type + " from " + brand + ".");
            size += oz;
        } else {
            System.out.println("You can't have more than 12oz in your cup.");
        }
    }
}