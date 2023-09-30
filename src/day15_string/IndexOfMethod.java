package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String str = "pen";
        //            012
        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));
        System.out.println(str.indexOf("x"));   //It'll always return -1, because we don't have it in our string

        if (str.indexOf("x") == -1) {
            System.out.println("x isn't in our String");
        }   //or, we can also use
        if (!str.contains("x")) {
            System.out.println("x isn't in our String");
        }
        String str2 = "apple";
        //             01234
        System.out.println(str.indexOf("p"));   //It'll always return us index of the FIRSt match
        String str3 = "loopcamp";
        //             01234567
        System.out.println(str3.indexOf("pc"));         //3
        System.out.println(str3.indexOf("camp"));       //4
        System.out.println(str3.indexOf("camping"));    //-1, because we don't have camping in our String
    }
}