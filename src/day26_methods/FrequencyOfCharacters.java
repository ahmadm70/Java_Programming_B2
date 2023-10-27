package day26_methods;

public class FrequencyOfCharacters {
    public static int frequencyOfCharacters(String str, char character) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("apple", 'p'));
    }
}