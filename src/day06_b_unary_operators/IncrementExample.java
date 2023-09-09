package day06_b_unary_operators;

public class IncrementExample {
    public static void main (String [] args) {

        int x = 0;
        System.out.println(x);      //0

        x = x + 1;                  //This means, take the value of x (which is 0) and add 1
        System.out.println(x);      //1

        /*
        In Java, there is a shorter way to write x + 1 in two options:
        1. Post-Increment: x++ --> this will increase the value by 1
        2. Pre-Increment: ++x --> does the same thing
         */

        x++;
        System.out.println(x);      //2

        ++x;
        System.out.println(x);      //3

        System.out.println(++x);    //4 Pre-increment will update the x first and then print
        System.out.println(x++);    //4 Post-increment will print first and then update the x
        System.out.println(x);      //5, because post-increment added 1 on the line above
    }
}
