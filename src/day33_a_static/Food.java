package day33_a_static;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;
    public Food(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculateTotal();
    }
    public void calculateTotal() {
        totalPrice = quantity * unitPrice;
    }
    @Override
    public String toString() {
        return "Name: " + name +
                "\t\t\tQuantity: " + quantity +
                "\t\t\tUnit price: $" + unitPrice +
                "\t\t\tTotal price: $" + totalPrice;
    }
}