package day16_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String str = "java is a language";
        System.out.println(str);
        str = str.replace('a','e');
        System.out.println(str);

        String day = "Today is Wednesday, we'll learn learn java on Wednesday. It's Wednesday.";
        System.out.println(day);
        day = day.replace("Wednesday","Thursday");
        System.out.println(day);

        String msg = "Today is Wednesday, we'll learn learn java on Wednesday. It's Wednesday.";
        System.out.println(msg);
        msg = msg.replace("Wednesday,","Thursday");
        System.out.println(msg);

        msg = "Today is Wednesday, we'll learn learn java on Wednesday. It's Wednesday.";
        msg = msg.replaceFirst("Wednesday","Saturday");
        System.out.println(msg);
    }
}