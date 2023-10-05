package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("*********************");

        int num = 0;
        while (num <= 4) {
            System.out.println(num + ": Hello World!");
            num++;
        }
        System.out.println("*********************");

        int z = 1;
        while (z <= 9) {
            System.out.println(z + ": Hello Loopcamp");
            ++z;
        }
        System.out.println("********************");
    }
}