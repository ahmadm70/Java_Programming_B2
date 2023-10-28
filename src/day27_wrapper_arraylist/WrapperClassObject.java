package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 7;
        Integer a1 = new Integer(10);       //This will make it an object directly ---> DEPRECATED (not in use)
        Integer a2 = 20;        //a2 is an object reference here
        //At the line above, we took integer 20 and AUTOBOXED it to Integer Wrapper class
        int a3 = a2;        //Here we are doing UNBOXING, which means converting Integer to int

        byte b = 5;
        Byte b1 = b;        //Autoboxing
        Byte b2 = 20;       //Autoboxing
    }
}