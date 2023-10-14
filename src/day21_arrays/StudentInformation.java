package day21_arrays;

import java.util.*;

public class StudentInformation {
    public static void main(String[] args) {

        String[] studentOne = {"007", "Ahmad", "Mammadli", "Batch#2"};
        System.out.println(Arrays.toString(studentOne));

        String[] studentTwo = new String[4];        //Using this method just for practicing
        studentTwo[0] = "099";
        studentTwo[1] = "Tom";
        studentTwo[2] = "Jerry";
        studentTwo[3] = "Batch#3";
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.print("Enter your student ID number: ");
        studentThree[0] = input.next();
        System.out.print("Enter your first name: ");
        studentThree[1] = input.next();
        System.out.print("Enter your last name: ");
        studentThree[2] = input.next();
        System.out.print("Enter your Batch# number: ");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));

        String[] questions = {"Enter your student ID number: ", "Enter your first name: ", "Enter your last name: ", "Enter your Batch# number: "};
        String[] studentFour = new String[4];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            studentFour[i] = input.next();
        }
        System.out.println(Arrays.toString(studentFour));
    }
}