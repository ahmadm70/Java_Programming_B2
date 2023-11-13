package day33_a_static;

public class IPhone {
    String model;
    double price;
    static String brand;
    static String os;
    static boolean appleDay;
    static String day;
    static {
        System.out.println("RUNNING STATIC");       //This will run even before the constructor
        brand = "Apple";
        os = "IOS";
        day = "Friday";
        appleDay = day.equalsIgnoreCase("friday");
    }
    /*
    Order of execution:
    1) Static block
    2) Constructor
    3) Instance variables
     */
    public IPhone(String model, double price) {
        System.out.println("RUNNING CONSTRUCTOR");      //These will run at first each time we use constructor
        System.out.println();
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Model: " + model + "\nPrice: $" + price + "\nBrand: " + brand;
    }
}