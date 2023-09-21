package day10_if_statements;

public class IfWithoutBrackets {
    public static void main (String [] args) {

        if (4 > 5)
            System.out.println("Hello");        //When if statement doesn't have a curly brackets Java will still execute the code, but till the first semicolon (;)
        System.out.println("Goodbye");

        if (4 > 2)
            System.out.println("Hello again");  //If statement without brackets affects only this line, because it has ; at the end of the line
        System.out.println("Goodbye again");
    }
}