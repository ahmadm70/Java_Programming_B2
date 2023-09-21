package day07_relational_operators;

public class OperatorPractice4 {
    public static void main (String [] args) {

        int t = 100,
                p = -++t * -t-- / t++ + --t;
        /*
        p = -101 * -101 / 100 + 100
        p = 10201 / 100 + 100
        p = 102 + 100
        p = 202
         */

        System.out.println(t);      //100
        System.out.println(p);      //202
    }
}
