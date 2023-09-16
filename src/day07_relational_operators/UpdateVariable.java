package day07_relational_operators;

public class UpdateVariable {
    public static void main (String [] args) {

        int a = 10;
        /*
        Different ways of adding 1 to the value:
        ++a or a++
        a = 10 + 1
        a = a + 1
        a = 11
         */
        int b = 4;
        /* Different ways of adding 10 to the value:
        b = 4 + 10
        b = b + 10
        b = 14
         */
        a += 1;         //Shorthand operator for adding 1 to the value
        b += 10;        //Shorthand operator for adding 10 to the value

        int count = 0;
        count += 5;     //5
        System.out.println(count);

        count -= 10;    //-5
        System.out.println(count);

        count *= -3;    //15
        System.out.println(count);

        count /= 2;     //7
        System.out.println(count);

        count %= 4;     //3
        System.out.println(count);
    }
}
