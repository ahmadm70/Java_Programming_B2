package day14_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today we had a Java class";
        System.out.println(day.contains("we had"));
        System.out.println(day.contains("wehad"));
        System.out.println(day.contains("a J"));

        String str = "Java class";
        System.out.println(day.contains(str));

        System.out.println(day + " or not?");
        System.out.println(day.contains(" or not?"));
        System.out.println((day + " or not?").contains(" or not?"));
    }
}