package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] groups = new String [4][];        //Second bracket is optional to declare, but not the first one
        String[][] groups2 = new String [4][3];
        System.out.println(Arrays.deepToString(groups));
        System.out.println(Arrays.deepToString(groups2));
        System.out.println();

        String[] group1 = {"Gular", "Maya", "Parvana"};
        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups));
        String[] group2 = {"Ahmad", "Aslan", "Caglar", "Elturk"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups));
        String[] group3 = {"Nihad", "Ramiz"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));
        String[] group4 = {"Ulvi"};
        groups[3] = group4;
        System.out.println(Arrays.deepToString(groups));
        System.out.println();

        for (String[] each : groups) {
            System.out.println(Arrays.toString(each));
        }
        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));
        }
        System.out.println();

        for (String[] eachArray : groups) {
            for (String eachString : eachArray) {
                System.out.println(eachString);
            }
        }
    }
}