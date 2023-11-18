package day36_inheritance.access.a;

public class First {
    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;
    public static void main(String[] args) {
        First o1 = new First();
        System.out.println(o1.one);
        System.out.println(o1.two);
        System.out.println(o1.three);
        System.out.println(o1.four);
    }
    //This class has access to all 4 instance variables
}