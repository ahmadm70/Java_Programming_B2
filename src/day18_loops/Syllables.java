package day18_loops;

public class Syllables {
    public static void main(String[] args) {

        String msg = "ja-va-script";
        int dashes = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == '-') {
                dashes++;
            }
        }
        System.out.println("Number of syllables you have is: " + (dashes + 1));
    }
}