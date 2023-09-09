package day05_variables;

public class MyName {
    public static void main (String [] args) {

        char first = 'A',
                second = 'h',
                third = 'm',
                fourth = 'a',
                fifth = 'd';
        //Line after that will print my name
        System.out.println(first + "" + second + third + fourth + fifth);
        //Line after that will add all the decimals, because we don't have a string and that means it won't be concatenation
        System.out.println(first + second + third + fourth + fifth);

        String myName = "" + first + second + third + fourth + fifth;

        System.out.println("My name is: " + myName);
    }
}
