package day11_if_statements;

public class NestedExample {

    public static void main (String [] args) {

        boolean a = false,
                b = true,
                c = true;

        if (a) {
            System.out.println(1.1);
            if (b) {
                System.out.println(1.2);
            }
        } else {
            System.out.println(2.1);
            if (c) {
                System.out.println(2.2);
            } else {
                System.out.println(2.3);
            }
        }
    }
}