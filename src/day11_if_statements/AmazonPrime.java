package day11_if_statements;

public class AmazonPrime {
    public static void main (String [] args) {

        double price = 19.99;
        boolean hasPrime = false;
        String message = "";

        if (hasPrime) {
            message = "Eligible for 2 day shipping";
        } else {
            if (price >= 25) {
                message = "Eligible for free shipping";
            } else {
                message = "Not eligible for free shipping. Shipping cost: $3.99";
            }
        }
    }
}