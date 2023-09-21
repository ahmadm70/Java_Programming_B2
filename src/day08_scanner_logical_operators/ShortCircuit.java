package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main (String [] args) {

        /*
        true && true --> true
        true && false --> false
        false && true --> false
        false && false --> false

        true || true --> true
        true || false --> true
        false || true --> true
        false || false --> false
         */

        int a = 10;
        System.out.println(false && (a++ > 11));    //a = 10, because when using &&, if first side is false it won't execute the rest
        System.out.println(a);
        System.out.println(false & (a++ > 11));     //a = 11, because when using &, even if first side is false it will execute the rest
        System.out.println(a);
        //If we need to execute the whole line no matter what, we can use "&", "|", "!"

        System.out.println(true || 5 / 0 == 0);     //It will execute and output will be: true
        System.out.println(true | 5 / 0 == 0);      //It won't execute because whole line will be executed and we can't divide to "0"
    }
}
