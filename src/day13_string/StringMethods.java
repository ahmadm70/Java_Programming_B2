package day13_string;

import java.lang.String;    //We don't have to import it, because Java imports this PACKAGE by default
public class StringMethods {
    public static void main(String[] args) {

        String str = "loopcamp";                    //String are IMMUTABLE, that means it will stay on memory even if we will change it
        str = str + " is nice.";

        String name = "Ahmad";
        System.out.println(name == "ahmad");        //false, never use relational operator for comparing Strings
        System.out.println(name.equals("Ahmad"));   //true, we are comparing values, not the location of them at the memory

        System.out.println(name.equalsIgnoreCase("ahmad")); //true, because we are ignoring case sensitivity with this method
        System.out.println("***************");

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);                 //false, because they are stored separately inside of Heap
        System.out.println(a.equals(b));            //true, because values are the same
        System.out.println("***************");

        System.out.println(a.length());             //5, this method counts the number of symbols in our String
        System.out.println(a.toUpperCase());        //HELLO, this method converts our letters to uppercase
        System.out.println(a.toLowerCase());        //hello, this method converts our letters to lowercase
    }
}