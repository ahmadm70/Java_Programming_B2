package day05_variables;

public class NameConven {
    public static void main (String [] args) {

        //int public = 5;           We can't use any Java related words as a variable name
        //double static = 4.5;      These words called "Reserved keywords"
        //boolean class = true;     They are part of Java syntax
        //int int = 6;
        //int abstract = 6;

        int Public = 5;             //We can name like this, because this is not a reserved keyword due to capital letter at the beginning
        int string = 10;
        int String = 15;            //This should be a IntelliJ read issue, we can't name like this

        int number1 = 4;            //Variable name can contain numbers
        int numb3r1 = 5;

        double num_ber = 4.5;       //Variable name can contain "_" and "$" special characters
        short num$ = 2;

        //int name isGood = 5       //Variable name can't contain spaces
        //int 1number = 45          //Variable name can't start with a number

        int _number = 5;
        int $number = 10;
        int Number = 15;            //We can name like this, but camelCase is not followed here, so not recommendable
    }
}
