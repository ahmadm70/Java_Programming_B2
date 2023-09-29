package day14_string;

public class StartsAndEnds {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apples"));

        String str2 = "App";
        System.out.println(str.startsWith(str2));

        System.out.println(str.endsWith("les"));
        System.out.println(str.endsWith("Apples"));
    }
}