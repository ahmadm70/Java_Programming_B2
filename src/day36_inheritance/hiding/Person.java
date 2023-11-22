package day36_inheritance.hiding;

public class Person {
    String name = "Tom Jerry";
}
class Child extends Person {
    String name = "Mickey Mouse";
}
class Runner {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println();
        Child c1 = new Child();
        System.out.println(c1.name);
        System.out.println();
    }
}