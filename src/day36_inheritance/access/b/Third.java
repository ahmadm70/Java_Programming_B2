package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
import org.w3c.dom.ls.LSOutput;

public class Third {
    public static void main(String[] args) {
        First o3 = new First();     //We've to import it first, because it comes from a different package
        System.out.println(o3.one);
        //System.out.println(o3.two);
        //System.out.println(o3.three);
        //System.out.println(o3.four);
        //This class has access only the public variable called "one"
    }
}