package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualify {
    public static void main (String [] args) {

        boolean isCitizen,
                isResident,
                hasDiploma;
        int age;
        String message = "";

        System.out.print("Do you have a citizenship? (true or false): ");
        Scanner input = new Scanner(System.in);
        isCitizen = input.nextBoolean();
        System.out.print("Are you a resident? (true or false): ");
        isResident = input.nextBoolean();
        System.out.print("Did you graduate from high school (true or false): ");
        hasDiploma = input.nextBoolean();
        System.out.print("How old are you?: ");
        age = input.nextInt();

        if (isCitizen || isResident) {
            message = "\nYou have met the first requirement.";
            if (age >= 18 && age <= 35) {
                message = message + "\nYou have met the second requirement.";
                if (hasDiploma) {
                    message = message + "\nYou have met the all requirements for joining army.\n\t\t\tWelcome soldier!";
                } else {
                    message = message + "\nYou have to be graduated from high school for joining army!";
                }
            } else {
                message = message + "\nYou have to be 18-35 years old for joining army!";
            }
        } else {
            message = "\nYou have to be a citizen or a resident for joining army!";
        }
        System.out.println(message);
    }
}