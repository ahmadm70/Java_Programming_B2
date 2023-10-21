package day24_methods;

public class MyFirstMethod {
    public static void helloWorld() {
        System.out.println("Hello World!");
    }
    public static void helloUniverse() {
        System.out.println("Hello Universe!");
    }
//    public static void main helloWorld() {
//    }     We can't have two same method names and exact parenthesis in the same class
    public static void helloWorld10() {
        for (int i = 0; i < 10; i++) {
            helloWorld();
        }
    }
    public static void main(String[] args) {
        helloUniverse();
        helloWorld();
        helloUniverse();
        System.out.println();
        helloWorld10();
    }
}