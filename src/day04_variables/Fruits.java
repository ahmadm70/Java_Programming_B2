package day04_variables;

public class Fruits {
    public static void main(String [] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;
        //int apples = 50, grapes = 100, bananas = 150;     //We can also assign values same way with this line if all variables have the same data type
        /*
        int apples = 50,
        bananas = 100,
        grapes = 150
        We also can assign values like this, but we have to use "," instead of ";" end of lines
         */
        System.out.println("This is how many apples we have: " + apples);
        //+ sign here is not addition, it is called concatenation

        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        System.out.println("I sold some apples - 20 apples sold");
        apples = 30;
        System.out.println("Apples after I sold: " + apples);

        int price = 150;
        System.out.println("The price of my 30 apple is 150");                      //Hardcoded
        System.out.println("The price of my " + apples + " apple is " + price);       //Dynamic
        System.out.println(50);
    }
}
