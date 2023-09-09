package day06_b_unary_operators;

public class Store {
    public static void main (String [] args) {

        String store = "Target";
        int numOfTv = 100;

        System.out.println("Customer comes into the store and buys a TV");
        System.out.println("Number of TVs in the store now: " + --numOfTv);
        System.out.println("Another customer also bought 1 more TV");
        System.out.println("Number of TVs in the store now: " + --numOfTv);
        System.out.println("In inventory store has a: " + numOfTv + " TVs");
        System.out.println("First customer returned his TV");
        System.out.println("Number of TVs in the store now: " + ++numOfTv);
    }
}
