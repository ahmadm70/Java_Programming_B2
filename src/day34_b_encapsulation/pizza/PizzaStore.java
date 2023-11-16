package day34_b_encapsulation.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large", 4);
        System.out.println(p1.getSize());
        System.out.println(p1.getToppings());
        System.out.println(p1.calculatePrice());
        System.out.println();
        System.out.println(p1);
    }
}