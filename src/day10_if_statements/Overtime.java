package day10_if_statements;

public class Overtime {
    public static void main (String [] args) {

        double hourlyRate = 20,
                hours = 45,
                netPay;

        if (hours <= 40) {
            netPay = hourlyRate * hours;
        } else {
            netPay = hourlyRate * 40 + (hours - 40) * hourlyRate * 1.5;
        }
        System.out.println("Your net pay for this week is: $" + netPay);
    }
}