package day33_a_static;

import java.util.Arrays;

public class LoopcampStudents {
    String name;
    int groupNumber;
    static int batchNumber;
    static String[] teachers;
    static String school;
    public LoopcampStudents(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }
    public static void printInfo() {
        System.out.println("SCHOOL INFO:");
        System.out.println("\tSchool name: " + school);
        //System.out.println("Student name: " + name);      //We can't use instance variable inside of static method
        System.out.println("\tBatch number: " + batchNumber);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));       //toString method here is static method, because it is called by class name
        System.out.println();
    }
    static {
        batchNumber = 2;
        teachers = new String[] {"Feyruz", "Nadir"};
        school = "LoopCamp";
        printInfo();
    }
    @Override
    public String toString() {
        return "STUDENT INFO:\n\tName: " + name + "\n\tGroup number: " + groupNumber;
    }
}