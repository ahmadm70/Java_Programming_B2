package day08_scanner_logical_operators;

public class OrPractice {
    public static void main (String [] args) {

        int apples = 5,
                oranges = 10;

        System.out.println(apples > 1 || oranges < 5);      //true
        System.out.println(apples > 10 || oranges == 10);   //true
        System.out.println(apples > 10 && oranges == 10);   //false
    }
}
