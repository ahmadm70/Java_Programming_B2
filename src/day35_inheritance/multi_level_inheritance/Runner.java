package day35_inheritance.multi_level_inheritance;

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        a.a = 1;
        a.b = 2;
        B b = new B();
        b.a = 1;
        b.b = 2;
        b.c = 3;
        b.d = 4;
        C c = new C();
        c.a = 1;
        c.b = 2;
        c.c = 3;
        c.d = 4;
        c.e = 5;
        c.f = 6;
    }
}