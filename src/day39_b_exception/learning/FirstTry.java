package day39_b_exception.learning;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First Line");
        try {
            String word = "java";
            System.out.println(word.charAt(4));
        } catch (Exception e) {
            System.out.println("Exception happened");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Last line");
    }
}