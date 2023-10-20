package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int a = 2;
        while (a <= 100) {
            System.out.println(a);
            a += 2;
        }
        System.out.println("**********");

        int b = 1;
        while (b <= 100) {
            if (b % 2 == 0) {
                System.out.println(b);
                b++;
            }
            b++;
        }
    }
}