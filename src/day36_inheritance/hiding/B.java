package day36_inheritance.hiding;

public class B extends A {
    public static void staticMethod() {     //Can't be overridden, but it can be hidden
        System.out.println("Static from CHILD class");
    }
    public void instanceMethod() {
        System.out.println("Instance from CHILD class");
        staticMethod();
    }
}