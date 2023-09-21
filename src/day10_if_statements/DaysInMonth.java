package day10_if_statements;

public class DaysInMonth {
    public static void main (String [] args) {

        int month = 11;
        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12,
                has30Days = month == 4 || month == 6 || month == 9 || month == 11,
                has28Days = month == 2;
        if (has31Days) {
            System.out.println("This month has 31 days");
        } else if (has30Days) {
            System.out.println("This month has 30 days");
        } else {
            System.out.println("This month has 28 days");
        }
    }
}