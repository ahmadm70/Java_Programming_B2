package day36_inheritance.final_example;

//public class UsingFinalExample extends FinalExample {     //FinalExample is a final class, can't be inherited
public class UsingFinalExample {
    public static void main(String[] args) {
        FinalExample o1 = new FinalExample();
        System.out.println(o1.a);
        //o1.a = 10;        We can't change the value, because "a" is a final instance
        System.out.println(o1.a);
        System.out.println();
        FinalExample o2 = new FinalExample(3);
        System.out.println(o2.a);
        System.out.println(o2.b);
        System.out.println();
        System.out.println(FinalExample.planet);
        //FinalExample.planet = "Mars";     planet is a final constant variable, it can't be changed
        System.out.println(FinalExample.planet);
    }
}