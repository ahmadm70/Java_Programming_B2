package day12_switch_statements;

import java.util.Scanner;

public class FieldTrip {
    public static void main (String [] args) {

        System.out.print("Enter your grade level: ");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        String location,
                teacher,
                message = "";
        int numOfGroups;

        if (grade >= 1 && grade <= 6) {;
            if (grade == 1) {
                location = "Apple orchards";
                teacher = "Mrs. Smith";
                numOfGroups = 2;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            } else if (grade == 2) {
                location = "Zoo";
                teacher = "Mrs. Williams";
                numOfGroups = 3;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            } else if (grade == 3) {
                location = "Douglas lake";
                teacher = "Mr. Brown";
                numOfGroups = 4;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            } else if (grade == 4) {
                location = "Grand Canyons";
                teacher = "Mr. White";
                numOfGroups = 5;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            } else if (grade == 5) {
                location = "Hiking at the Great Smoky Mountains";
                teacher = "Mrs. Smith";
                numOfGroups = 4;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            } else {
                location = "Oak forest";
                teacher = "Mr. Cole";
                numOfGroups = 2;
                message = message + "\n\tGrade: " + grade + "\n\tLocation: " + location + "\n\tTeacher: " + teacher + "\n\tNumber of groups: " + numOfGroups;
            }
        } else {
            message = "\nGrade must be between 1-6 for a field trip!";
        }
        System.out.println("\nField trip information:" + message);
    }
}