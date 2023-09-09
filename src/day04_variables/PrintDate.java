package day04_variables;

public class PrintDate {
    public static void main (String [] args) {
        int month = 9,
                day = 6,       //If value starts with "0" it won't print out it, we have to use concatination if we need 0 printed out
                year = 2023;
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "." + day + "." + year);
        System.out.println(month + "-" + day + "-" + year);
        System.out.println(month + "|" + day + "|" + year);
    }
}
