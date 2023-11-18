package day36_inheritance.final_example;

public class Main {
    public static void main(String[] args) {
        new Parent().walk();
        new Child().walk();     //It'll also use the method at the "Parent" class without an issue
        new Child().walk("Tom");
    }
}
class Parent {
    public final void walk() {
        System.out.println("Walking with parent.");
    }
}
class Child extends Parent {
//    public void walk() {
//        System.out.println("Walking with child.");
//    }     This method can't be overridden, because it is final method at the "Parent" class
    public void walk(String name) {
        System.out.println("Walking with child named " + name);     //We are overloading the method here, not overriding
    }
}