package day34_b_encapsulation.pizza;

public class Pizza {
    private String size;
    private int toppings;
    public Pizza(String size, int toppings) {
        setSize(size, toppings);
    }
    public void setSize(String size, int toppings) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        } else {
            System.err.println("You entered a invalid size!");
        }
        if (toppings > 0) {
            this.toppings = toppings;
        } else {
            System.err.println("You have to add at least 1 topping!");
        }
    }
    public String getSize() {
        return size;
    }
    public int getToppings() {
        return toppings;
    }
    public double calculatePrice() {
        double totalPrice;
        if (size.equals("small")) {
            totalPrice = 4;
        } else if (size.equals("medium")) {
            totalPrice = 6;
        } else if (size.equals("large")) {
            totalPrice = 8;
        } else {
            totalPrice = -1;
        }
        return totalPrice + toppings * 0.75;
    }
    public String toString() {
        return "Size: " + size + "\nToppings: " + toppings + "\nTotal price: $" + calculatePrice();
    }
}