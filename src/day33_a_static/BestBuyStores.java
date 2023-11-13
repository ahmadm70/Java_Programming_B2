package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("Fairfax");
        BestBuy store2 = new BestBuy("McLean");
        System.out.println(store1.location);
        System.out.println(store2.location);
        store1.location = "Alexandria";     //It'll change just store1 location
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println();
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        store1.headquarter = "Houston";     //It'll change for all objects, because static BELONGS TO CLASS not to object
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(BestBuy.headquarter);        //We can call static variables with a class name instead of object
        System.out.println();
        System.out.println(BestBuy.day);
        BestBuy.day = "Sunday";
        System.out.println(BestBuy.day);
        System.out.println();
        //BestBuy.openStore();      We've to use object reference name instead of class name for calling instance method
        store1.openStore();
        store2.openStore();
        System.out.println();
        BestBuy.countStock();
        store1.countStock();        //Can be called like that, but not recommendable
        store2.countStock();
    }
}