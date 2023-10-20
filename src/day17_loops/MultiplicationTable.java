package day17_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));    //We put brackets just for better readability
        }
    }
}