package day44_map_and_functions.functional_interfaces;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface<String> printEachCharacter = word -> {
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };
        printEachCharacter.test("java");
        //--------------------------------------------------------------------------------------------------------------
        DynamicInterface<Integer> square = number -> {
            System.out.println(Math.pow(number, 2));
        };
        square.test(7);
    }
}