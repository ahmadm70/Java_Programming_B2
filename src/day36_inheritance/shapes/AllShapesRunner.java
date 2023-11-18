package day36_inheritance.shapes;

import day35_inheritance.multi_level_inheritance.C;

public class AllShapesRunner {
    public static void main(String[] args) {
        Square o1 = new Square(7);
        System.out.println(o1);
        System.out.println(o1.area());
        System.out.println(o1.perimeter());
        System.out.println();
        Circle o2 = new Circle(5);
        System.out.println(o2);
        System.out.println(o2.area());
        System.out.println(o2.perimeter());
    }
}