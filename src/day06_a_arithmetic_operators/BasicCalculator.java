package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main (String [] args) {

        double num1 = 5,
                num2 = 4;

        double addition = num1 + num2,
                subtraction = num1 - num2,
                multiplication = num1 * num2,
                division = num1 / num2,
                modules = num1 % num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modules);

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + modules);

        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        /*
        How we can make the addition happen first?
        2 * 3 + 4 = 10
        2 * (3 + 4) = 14
         */
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
