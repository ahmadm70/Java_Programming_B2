package day08_scanner_logical_operators;

public class OperatorPractice {
    public static void main (String [] args) {

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        /*
        39 * 2 + 3 - 5 % 5
        78 + 3 - 5 % 5
        78 + 3 - 0
        81 - 0
        81
         */
        System.out.println(w);
        System.out.println("*************************");

        int a = 8,
                b = a--,
                c = a++;
        System.out.println(a);      //8
        System.out.println(b);      //8
        System.out.println(c);      //7
        System.out.println("*************************");

        int l = 50,
                p = --l + l++ + l-- + l++;
        System.out.println(l);      //50
        System.out.println(p);      //197
        System.out.println("*************************");

        int r = 20,
                k = -r-- + r++ + --r * r-- % 2;
        System.out.println(r);      //18
        System.out.println(k);      //0
    }
}
