package day10_if_statements;

public class BiggestNumber {
    public static void main (String [] args) {

        int a = 5,
                b = 5,
                c = 5;

        if (a > b && a > c) {
            System.out.println("Biggest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Biggest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Biggest number is: " + c);
        } else {
            System.out.println("All numbers are equal to each other");
        }
    }
}