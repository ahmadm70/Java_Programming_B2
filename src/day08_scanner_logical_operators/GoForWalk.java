package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main (String [] args) {

        /*
        Task: I want to go for a walk
            if it is not raining,
            if temperate is above 70F
         */

        boolean isRaining = false;
        int temperature = 60;

        System.out.println("Do I need to go for a walk: " + (isRaining && temperature > 70));
    }
}
