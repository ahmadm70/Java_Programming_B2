package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main (String [] args) {

        int n = 20;

        System.out.println(n > 5);              //true
        System.out.println(n < 10);             //false
        System.out.println(n > 5 && n < 10);    //true & false = false
        // 20 is more than 5 AND less than 10 --> false
        System.out.println("*************************");

        System.out.println(n > 5 || n < 10);    //true & false = true
        // 20 is more than 5 OR less than 10 ---> true
        System.out.println("*************************");

        System.out.println(4 > 3 || false);     //true
        System.out.println(3 < 4 || false);     //true
        System.out.println(3 > 4 || false);     //false
        System.out.println("*************************");

        System.out.println(!false);             //true
        System.out.println(!true);              //false
        System.out.println(4 != 4);             //false
        System.out.println("*************************");

        System.out.println(4 > 3 || false || 4 > 3 || false);
        /*
                            true || false || true || false
                                true      || true || false
                                true      ||     true
                                         true
         */
    }
}
