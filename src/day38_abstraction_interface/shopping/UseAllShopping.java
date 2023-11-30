package day38_abstraction_interface.shopping;

public class UseAllShopping {
    public static void main(String[] args) {
        Amazon a1 = new Amazon();
        a1.price = 49.99;
        a1.buyItem();
        a1.returnItem();
        a1.payForShipping(a1.price > 25);
        a1.viewCart();
    }
}