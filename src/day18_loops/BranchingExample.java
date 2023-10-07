package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            break;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 1) {   //for even numbers, we can use == instead of != for edd numbers
                continue;
            }
            System.out.print(i + " ");
        }
    }
}