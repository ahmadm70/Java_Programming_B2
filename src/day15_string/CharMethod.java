package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String s1 = "java";
        //Index ---> 0123
        System.out.println(s1.length());         //4 ---> there is j, a, v, a
        System.out.println(s1.charAt(0));        //j
        System.out.println(s1.charAt(1));        //a
        System.out.println(s1.charAt(2));        //v
        System.out.println(s1.charAt(3));        //a
        //System.out.println(s.charAt(4));      //There is no index 4 ---> RUN TIME EXCEPTION (Error)   //TODO
                                                //If we'll uncomment this line it'll run everything till this line, but nothing after that
        //System.out.println(s.charAt("4"));    //Can't accept String ---> COMPILE TIME EXCEPTION (Error) - Syntax
                                                //If we'll uncomment this line it won't run at all, because we are having issue with compiling
        String s2 = "apple";
        //           01234
        // length ---> 5
        //How you can get the last character?
        System.out.println(s2.charAt(s2.length() - 1));
        //How you can get the last character?
        int lastIndex = s2.length() - 1;
        System.out.println(s2.charAt(lastIndex));
    }
}