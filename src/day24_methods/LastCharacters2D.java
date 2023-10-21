package day24_methods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] words = {
                {"Java", "is", "fun"},
                {"Soft", "skills", "is", "ok"},
                {"Loops", "are", "getting", "easier"}
        };
        System.out.println(words.length);
        System.out.println(words[2].length);
        System.out.println();

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words[j].length; i++) {
                String eachWord = words[j][i];
                System.out.print(eachWord.charAt(eachWord.length() - 1));
            }
            System.out.println();
        }
        System.out.println();

        for (String[] eachArray : words) {
            for (String eachString : eachArray) {
                System.out.print(eachString.charAt(eachString.length() - 1));
            }
            System.out.println();
        }
    }
}