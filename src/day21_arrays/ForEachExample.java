package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int[] numbers = {30, 12, 150, 12};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Traditional fori loop: " + numbers[i]);
        }
        System.out.println();

        for (int each: numbers) {
            System.out.println("ForEach Loop: " + each);
        }
        System.out.println();

        String[] classes = {"java", "soft skills", "api", "db", "selenium"};
        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional: " + classes[i]);
        }
        System.out.println();

        for (String each : classes) {
            System.out.println("ForEach: " + each);
        }
        System.out.println();

        double[] prices = {2.3, 45.7, 34, 21.2};
        for (double each : prices) {
            System.out.println("ForEach: $" + each);
        }
    }
}