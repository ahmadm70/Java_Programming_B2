package day05_variables;

public class CharExample {
    public static void main (String [] args) {

        //Assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        //sout shortcut is for command under this line
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);  //Output will be addition of decimals: 97 + 90

        char letterThree = 65;  //65 is equivalent in ASCII table for "A"

        System.out.println(letterThree);

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);   //97 + 98 + 65 + 57 + 36

        //Concatenation
        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne);
        //Concatenation
        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne);
        //Concatenation happens after first string
        System.out.println(letterOne + letterTwo + " chars: " + letterThree + numberOne + specialOne);
        System.out.println(letterOne + " chars: " + letterTwo + " chars: " + letterThree + numberOne + specialOne);
    }
}
