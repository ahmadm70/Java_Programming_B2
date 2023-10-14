package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String city1 = "Fairfax";
        String city2 = "Baku";
        String city3 = "Houston";
        String city4 = "Seattle";

        String[] cities1 = {"Fairfax", "Baku", "Houston", "Seattle"};
        String[] cities2 = {city1, city2, city3, city4};
        //Indexes ------>      0      1      2      3
        System.out.println(cities2[0]);
        System.out.println(cities2[1] + " is bigger than " + cities2[0]);
        System.out.println(cities2);    //This prints the hashcodes
        System.out.println(Arrays.toString(cities2));   //This method lets us print arrays fully with []
        System.out.println(cities2.length);
        System.out.println(cities2[1].toUpperCase().charAt(0));
        System.out.println("" + Arrays.toString(cities2).charAt(0));
    }
}