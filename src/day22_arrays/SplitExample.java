package day22_arrays;

import java.util.*;
public class SplitExample {
    public static void main(String[] args) {

        String str = "monday,tuesday,wednesday,thursday,friday";
        String[] strArr = str.split(",");
        for (String each : strArr) {
            System.out.println(each);
        }
        System.out.println();

        String[] day = str.split("day");
        for (String each : day) {
            System.out.println(each);
        }
        System.out.println();

        String months = "jan-feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
        String[] month = months.split("-");
        for (String each : month) {
            System.out.println(each);
        }
        System.out.println();

        String months2 = "jan-feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
        String[] month2 = months.split("jun-jul");
        for (String each : month2) {
            System.out.println(each);
        }
        System.out.println();

        String[] arr2 = months.split("");
        for (String each : arr2) {
            System.out.println(each);
        }
    }
}