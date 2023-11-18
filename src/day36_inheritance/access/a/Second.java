package day36_inheritance.access.a;

public class Second {
    public static void main(String[] args) {
        First o2 = new First();
        System.out.println(o2.one);
        System.out.println(o2.two);
        System.out.println(o2.three);
        //System.out.println(o2.four);
        //This class has access to all instance variables, except private one called "four"
    }
}