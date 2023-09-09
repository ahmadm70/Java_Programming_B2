package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main (String [] args) {

        short num1 = 40;
        float num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        float num3 = 100.5F;
        short num4 = (short) num3;

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300;               //We don't have to add "F" at the end of value because it doesn't have decimal part
        byte num6 = (byte) num5;

        System.out.println(num5);
        System.out.println(num6);

        char letter1 = 'A';
        int letter2 = letter1;

        System.out.println(letter1);
        System.out.println(letter2);    //Output will be character's ASCII table number
        System.out.println( (int) letter1);

        int letter3 = 66;
        char letter4 = (char) letter3;
        System.out.println(letter4);
        System.out.println( (char) 66);
    }
}
