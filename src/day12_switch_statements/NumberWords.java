package day12_switch_statements;

public class NumberWords {
    public static void main (String [] args) {

        int n = 10;

        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number!");
        }
        System.out.println("----------");

        //Switch Statement
        switch (n) {    //n can be byte, short, int, char, string - we need EXACT value
            case 1:     //This line means: if (n == 1) {
                System.out.println("One");
                break;  //If body was true, break skips the rest of switch method
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:    //This line means: else {
                System.out.println("Invalid number!");
        }
        //Order of cases and default doesn't matter for switch method, if ALL of them have the break at the end
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number!");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 2:
                System.out.println("Two");
        }
        /*
            We can't set up a range
            We can't use relational operators
            We can't use logical operators
            If there is no break between cases it will print everything till next break
         */

    }
}