package day27_wrapper_arraylist;

import java.util.*;

public class ParseNumbers {
    public static void main(String[] args) {
        String strYear = "2023";
        int year1 = 2023;
        Integer year2 = year1;
        System.out.println(year1 + 1);
        System.out.println(strYear + 1);
        //Converting String number into int
        int numYear = Integer.parseInt(strYear);
        System.out.println(numYear + 1);

        //String strNum = "2023Y";      //We can't convert non-numerical characters into int
        //int intNum = Integer.parseInt(strNum);
        //System.out.println(intNum);
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you?: ");
        String response = input.nextLine();     //example: I am 25 years old
        //String[] strArr = response.split(" ");
        //System.out.println(Arrays.toString(strArr));
        String ageStr = response.split(" ")[2];
        int age = Integer.parseInt(ageStr);
        System.out.println(age);
    }
}