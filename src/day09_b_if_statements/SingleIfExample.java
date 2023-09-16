package day09_b_if_statements;

public class SingleIfExample {
    public static void main (String [] args) {

        if(!false) {
            System.out.println("Hello World!");
            //If condition is true, it will be executed
            //If condition is false, it will skip the code block of if statement
        }
        System.out.println("Second line");

        if(true) {
            System.out.println("Today is Saturday");
        }

        int score = 75;
        if(score >= 75) {
            System.out.println("You passed the exam!");
        }

        if(score < 75) {
            System.out.println("You failed the exam!");
        }

        int year = 2023;
        boolean isLockdown = year == 2020 || year == 2021;
        if(isLockdown) {          //false or false --> false
            System.out.println("We are in lockdown because of COVID-19");
            System.out.println("We have to wear mask when we leave the home");
        }

        if(!isLockdown) {
            System.out.println("You don't have to wear a mask anymore");
        }
    }
}
