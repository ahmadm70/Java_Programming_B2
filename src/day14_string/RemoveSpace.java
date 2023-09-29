package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String s = "     Thurs   day     ";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s);

        System.out.println((s.trim()).endsWith("day"));
    }
}