package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 10);

        int b = 0;
        do {
            System.out.println(b);
            ++b;
        } while (b == 10);

        int c = 0;
        while (c == 10);
        System.out.println(c);
        c++;
    }
}