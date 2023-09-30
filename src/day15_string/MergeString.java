package day15_string;

public class MergeString {
    public static void main(String[] args) {

        String a = "abc";
        String b = "xyz";

        String merge = "" + a.charAt(0) + b.charAt(0) + a.charAt(1) + b.charAt(1) + a.charAt(2) + b.charAt(2);
        System.out.println(merge);
    }
}