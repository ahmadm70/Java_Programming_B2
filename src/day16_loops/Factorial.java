package day16_loops;

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int factorial = 1;

        while (num >= 1) {
            System.out.print("Result: " + factorial + " * " + num);
            factorial *= num;
            System.out.println(" = " + factorial);
            num--;
        }
        System.out.println("Final result: " + factorial);
    }
}