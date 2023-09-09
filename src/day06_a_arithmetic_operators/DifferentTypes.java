package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main (String [] args) {

        System.out.println(10 - 5);
        System.out.println(10 * 5);
        //Output for both of them will be int

        System.out.println(10.0 / 5);
        System.out.println(10 / 5.0);
        //Output for both of them will be double

        System.out.println(10.0 / 5.0);
        //Output will be double as well

        System.out.println( (int) 10.0 / 5);
        //Output will be int, because we casted it

        System.out.println( (double) 10 / 5);
        //Output will be double, because we casted it

        byte b1 = 10,
                b2 = 20;
        //byte sum = b1 + b2;   This won't work because values changes to default (int) during the calculation
        int sum = b1 + b2;

        byte sumByte = (byte)(b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);
    }
}
