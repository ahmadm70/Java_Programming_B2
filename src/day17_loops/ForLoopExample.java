package day17_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        /*
        for (initialization; condition; iteration) {
        1) Initialization: int value, runs only ONCE at the beginning
        2) Condition: boolean value, if it's true loop will run, if it's false loop will stop
        3) Execution: body of for loop will be executed, from top to bottom, left to right
        4) Iteration: updates the number of cycles
        5) End: loop ends
         */
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("**********");
        }
    }
}