package day04_variables;

public class PrimitiveDataTypes {
    public static void main (String [] args) {
        byte age = 60; //We put 50 earlier
                // We have declared a variable called age which has byte data type and assigned to 50
        System.out.println("50"); //Hardcoded - means you have to change it manually
        System.out.println("age"); //Age is not variable here
        System.out.println(age); //Dynamic - means it will change automatically. And Age is variable here
        //byte age = 95     //In Java, we can't declare same variable more than once
        //byte age2 = 950   //Primitive data type byte can't hold 950 because it is out of range that byte can hold (-128 to 127)
        age = 100; //It will change 60 to 100 for commands after this line
        //We are not declaring again, we are just reassigning the value
        System.out.println(age);

        short year;     //We declared just the variable
        year = 2023;    //We assigned the value for a variable

        int zipcode = 37814;

        long bignumber = 9345345876876876L;     //We have to use L at the end of value for long
        //long year     //We can't use same variable name in the same block of code, even for different data types

    }
}
