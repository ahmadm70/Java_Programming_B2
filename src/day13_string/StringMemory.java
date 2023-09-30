package day13_string;

public class StringMemory {
    public static void main(String[] args) {

        int num = 4;
        byte num2 = 5;
        char letter = 'a';
        boolean isTrue = true;
        String message = "Hello";                           //Creating a String by LITERALS
        String message2 = new String("Hello");      //Creating a String by "new" keyword




        String first = "java";                              //Literal --> stored at Heap-->Pool
        String second = new String("java");         //Object --> stored at Heap itself, not in a Pool
        String third = "java";
        String fourth = "java";
        System.out.println(first == second);                //false, because when we are using == Java comparises the location of values
        System.out.println(first == third);                 //true
        System.out.println(second == fourth);               //false, because they are same values but stored separately
    }
}