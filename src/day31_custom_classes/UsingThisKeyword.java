package day31_custom_classes;

public class UsingThisKeyword {
    public static void main(String[] args) {
        ThisKeyword tk1 = new ThisKeyword(200);
        System.out.println(tk1.num);        //Java prioritizes LOCAL variables over INSTANCE variables when their names are same (just in local body, nowhere else)
    }
}