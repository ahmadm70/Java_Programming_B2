package day11_if_statements;

public class TernaryExample {
    public static void main (String [] args) {

        int a = 4;
        String evenOrOdd = "";

        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }
        System.out.println(evenOrOdd);
        /*
        In Java, we have a shorter way of using if-else statements
        It is called ternary operator
         */
        evenOrOdd = (a % 2 == 0)? "Even" : "Odd";
        /*
        ? - means basically if (true or false)
        "Even" - if statement body, always for true
        : - means basically else
        "Odd" - else statement body, always for false
        First and second value (Even and Odd in this case) have to be the same data type
         */
        System.out.println(evenOrOdd);
        System.out.println("**********");

        int num = 4;
        String sign = (num > 0)? "It is a positive number" : (num > 2)? "It is a negative number" : "It is equal to zero";
        System.out.println(sign);

        // This is same as the one above. Ternary works as a nested, not the multibranch one!
        if (num > 0) {
            sign = "It is a positive number";
        } else  {
            if (num < 0 ) {
                sign = "It is a negative number";
            } else {
                sign = "It is equal to zero";
            }
        }
    }
}