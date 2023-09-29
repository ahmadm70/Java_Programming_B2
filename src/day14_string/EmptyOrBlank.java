package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}