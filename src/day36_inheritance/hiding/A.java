package day36_inheritance.hiding;

public class A {
    public static void staticMethod() {
        System.out.println("Static from PARENT class");
    }
    public void instanceMethod() {
        System.out.println("Instance from PARENT class");
        staticMethod();
    }
}