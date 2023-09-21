package day08_scanner_logical_operators;

public class AgeGroup {
    public static void main (String [] args) {

        int age = 10;
        boolean isKid = age <=13;
        boolean isSenior = age >= 65;

        System.out.println("You're a kid: " + isKid);           //true
        System.out.println("You're a senior: " + isSenior);     //false
    }
}
