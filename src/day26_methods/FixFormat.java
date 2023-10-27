package day26_methods;

public class FixFormat {
    public static String fixFormat(String str) {
        return str.toUpperCase().charAt(0) + str.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(fixFormat("AHMAD"));
    }
}