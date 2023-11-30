package day39_b_exception.learning;

public class FourthTry {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            Thread.sleep(-2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finish");
    }
}