package day14_string;

public class RecapMethods {
    public static void main(String[] args) {

        String s = "pen";
        String s2 = new String("pen");
        System.out.println(s == s2);                //false
        System.out.println(s.equals("pen"));        //s.equals("s2") is also true
        System.out.println(s.equals("Pen"));        //false

        s = "Pen";
        System.out.println(s.equals("Pen"));        //true
        String ss = "Pen";
        System.out.println(s.equals(ss));           //true

        s = "PEN";
        ss = "pen";
        boolean isSame = s.equalsIgnoreCase(ss);
        System.out.println(isSame);                 //true
        if(isSame) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
        System.out.println(s.length());             //3
        System.out.println(ss.length());            //3

        int a = s.length();
        int b = ss.length();
        System.out.println("Ahmad".length());       //5
        System.out.println("A   d".length());       //5
        System.out.println("".length());            //0
    }
}