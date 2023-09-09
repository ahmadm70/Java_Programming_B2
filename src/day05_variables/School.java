package day05_variables;

public class School {
    public static void main (String [] args) {
        int numberOfStudentsInGrade1 = 30,
                numberOfStudentsInGrade2 = 40,
                numberOfStudentsInGrade3 = 25,
                numberOfStudentsInGrade4 = 10,
                numberOfStudentsInGrade5 = 38;

        System.out.println("Number of students in grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of students in grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of students in grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of students in grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of students in grade 5: " + numberOfStudentsInGrade5);

        System.out.print("Total number of students: ");
        System.out.println(numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5);

        int total = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        System.out.println("Total number of students: " + total);

        double numberOfDaysInAYear = 100.5;     //When we are using variable color is white
        double numberOfSnowyDaysInAYear = 10;   //When we aren't using variable color is gray
        double averageGPAInSchool = 3.5;

        System.out.println("Number of days in a year: " + numberOfDaysInAYear);
    }
}
