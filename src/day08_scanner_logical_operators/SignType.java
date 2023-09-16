package day08_scanner_logical_operators;

public class SignType {
    public static void main (String [] args) {

        int num = 4;
        boolean isPositive = num > 0,
                isNegative = num < 0,
                isZero = num == 0,
                isNotZero = num != 0;

        System.out.println("Our number is positive: " + isPositive);    //true
        System.out.println("Our number is negative: " + isNegative);    //false
        System.out.println("Our number is zero: " + isZero);            //false
        System.out.println("Our number is not zero: " + isNotZero);     //true
    }
}
