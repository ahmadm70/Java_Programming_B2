package day39_a_polymorphism.covariant;

import java.util.*;

public class B extends A {
    public A test() {
        return new B();
    }
    public static void main(String[] args) {
        //We can store different objects under SAME reference
        A[] arr = {new A(), new B()};
        //A o1 = new A();
        //B o2 = new B();
        ArrayList<A> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
    }
}