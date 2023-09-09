package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main (String [] args) {

        byte b = 40;
        int a = b;                  //The byte value is automatically converted to int, because byte is smaller than int

        int d = 100;
        byte c = (byte) d;          //int is bigger container than byte, that is why it won't let us convert to byte without using --> (byte)

        System.out.println(d);      //Output will be int
        System.out.println(c);      //Output will be byte

        int f = 500;
        long e = f;

        long h = 200;
        int g = (int) h;

        System.out.println(h);      //Output will be long
        System.out.println(g);      //Output will be int

        double j = 50;
        int i = (int) j;

        System.out.println(j);      //Output will be 50.0, because it is double
        System.out.println(i);      //Output will be 50

        double l = 40;
        byte k = (byte) l;

        System.out.println(l);      //Output will be double
        System.out.println(k);      //Output will be byte

        int n = 200;
        byte m = (byte) n;          //With the numbers outside of the range we will hava a DATA LOSS

        System.out.println(n);
        System.out.println(m);

        double p = 45.56;
        int o = (int) p;

        System.out.println(p);
        System.out.println(o);      //We will lose the decimal part
    }
}
