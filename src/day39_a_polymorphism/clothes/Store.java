package day39_a_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        //1. Reference itself
        TShirt t1 = new TShirt();
        t1.wear();
        System.out.println();
        //2. Reference super class
        Clothes c1 = new TShirt();
        c1.wear();
        System.out.println();
        //1. Reference itself
        Jacket j1 = new Jacket();
        j1.wear();
        j1.hoodUp();
        System.out.println();
        //2. Reference super class
        Clothes c2 = new Jacket();
        c2.wear();
        //c2.hoodUp();      Clothes reference doesn't have an access
        System.out.println();
        //3. Reference interface
        HasHood h1 = new Jacket();
        //h1.wear();        HasHood reference doesn't have an access
        h1.hoodUp();
        System.out.println();
        //4. Object reference (EXTRA)
        Object o1 = new Jacket();
        //o1.wear();        Object reference doesn't have an access
        //o1.hoodUp();      Object reference doesn't have an access
        buy(t1);
        buy(j1);
        buy(new TShirt());
    }
    public static void buy(Clothes obj) {
        if (obj instanceof TShirt) {
            System.out.println("Bought t-shirt");
        } else if (obj instanceof Jacket){
            System.out.println("Bought jacket");
        }
    }
}