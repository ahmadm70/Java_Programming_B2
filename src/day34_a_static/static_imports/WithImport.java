package day34_a_static.static_imports;

import static java.util.Arrays.*;       //Here we're importing all the static methods of this (Arrays) class

import static java.lang.Math.*;
public class WithImport {
    public static void main(String[] args) {
        int[] a = {2, 30, 5, 65 , 7};
        sort(a);
        System.out.println(PI);
    }
}