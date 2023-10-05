package day16_loops;

public class Replace {
    public static void main(String[] args) {

        String str = "java is a programming language";
        String first = str.substring(0,str.indexOf(" "));
        String rest = str.substring(str.indexOf(" ") + 1);
        //     rest = str.substring(first.length() + 1); //TODO

        System.out.println(rest + " " + first);
    }
}