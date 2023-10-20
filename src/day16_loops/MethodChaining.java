package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String str = "     java     ";

        str.trim().toLowerCase().toUpperCase().substring(0).charAt(0);
        //As long as the method returns String, we can keep chaining
    }
}