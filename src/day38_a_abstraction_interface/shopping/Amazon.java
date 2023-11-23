package day38_a_abstraction_interface.shopping;

public class Amazon extends OnlineShopping {
    public void buyItem() {
        System.out.println("Buying an item from Amazon");
    }
    public void returnItem() {
        System.out.println("Returning an item to Amazon");
    }
    public void payForShipping(boolean a) {
        System.out.println(a ? "Free shipping" : "$9.99 for shipping");
    }
    public void viewCart() {
        System.out.println("There are 3 items in the cart");
    }
    /*
    class ---> class : extends
    interface ---> interface : extends
    interface ---> class : implements
     */
}