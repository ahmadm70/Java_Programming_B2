package day44_map_and_functions.functional_interfaces;

public class UsingNumberInterface {
    public static void main(String[] args) {
        NumberInterface evenOrOdd = (a) -> {        //Since our method requires a parameter, we have to pass it in ()
            if (a % 2 == 0) {
                System.out.println(a + " is an even number");
            } else {
                System.out.println(a + " is an odd number");
            }
        };
        evenOrOdd.apply(77);
        evenOrOdd.apply(70);
        //--------------------------------------------------------------------------------------------------------------
        NumberInterface cube = num -> {       //If we have only 1 parameter we don't have to use parenthesis
            System.out.println(Math.pow(num, 3));
            //or: System.out.println(number * number * number);
        };
        cube.apply(5);
        cube.apply(7);
    }
}