package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Fourth extends First {
    public static void main(String[] args) {
        First o4 = new First();
        System.out.println(o4.one);
        //System.out.println(o4.two);
        //System.out.println(o4.three);
        //System.out.println(o4.four);
        System.out.println();
        Fourth o5 = new Fourth();
        System.out.println(o5.one);
        System.out.println(o5.two);     //It works, because protected variables can be accessed from the child class
        //System.out.println(o5.three);
        //System.out.println(o5.four);
    }
}