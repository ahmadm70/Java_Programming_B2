package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String str = "definition";
        System.out.println("First \"i\" index: " + str.indexOf("i"));
        System.out.println("First \"i\" index: " + str.indexOf('i'));   //We can also do with single quotation, as a char
        System.out.println("Last \"i\" index: " + str.lastIndexOf("i"));

        //How we can find the second "i"?
        System.out.println("Second \"i\" index: " + str.indexOf("it"));
        System.out.println("Second \"i\" index: " + str.indexOf('i', 4));
        System.out.println("Second \"i\" index: " + str.indexOf('i', str.indexOf('i') + 1));
    }
}