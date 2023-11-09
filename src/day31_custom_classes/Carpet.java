package day31_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;
    public Carpet(boolean inputIsPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        width = inputWidth;
        length = inputLength;
        isPersian = inputIsPersian;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }
    public void calculatePrice() {
        totalPrice = width * length * unitPrice;
    }
    public String toString() {
        return "Carpet info:\n\tWidth: " + width + "m\n\tLength: " + length + "m\n\tIs it persian?: " + isPersian + "\n\tUnit price: $" + unitPrice + "\n\tTotal price: $" + totalPrice;
    }
}