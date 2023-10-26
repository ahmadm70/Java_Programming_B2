package day25_methods;

public class CreditScore {
    public static int creditScore() {
        return 777;
    }
    public static void main(String[] args) {
        System.out.println("Your credit score is: " + creditScore());
        System.out.println("Is my credit score good?: " + isGood(creditScore()));
    }
    public static boolean isGood(int score) {
        if (score >= 700) {
            return true;
        } else {
            return false;
        }
        //return score >= 700;      This does the same thing as well
    }
}