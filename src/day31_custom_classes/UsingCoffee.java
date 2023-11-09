package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println(myCoffee);
        System.out.println();
        myCoffee.price = 4.99;
        myCoffee.size = 12;
        myCoffee.brand = "Lavazza";
        myCoffee.type = "americano";
        System.out.println(myCoffee);
        System.out.println();
        myCoffee.drink();
        myCoffee.refill(4);
    }
}