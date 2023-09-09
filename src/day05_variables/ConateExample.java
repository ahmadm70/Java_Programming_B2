package day05_variables;

public class ConateExample {
    public static void main (String [] args) {

        System.out.println(4 + 5);              //9, because Java considers it as an int by default: int + int
        System.out.println(4 + 5 + "Hello");    //9Hello, because: int + int + string
        System.out.println("Hello" + 4 + 9);    //Hello49, because: string + int + int --> string + int --> string

    }
}
