package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsidePackage {
    /**
     * Different class, different package
     */
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);      //accessible
        //System.out.println(obj.b);      //not accessible, because it has default access modifier
        //System.out.println(obj.c);      //not accessible, because it has private access modifier
        System.out.println(AccessModifier.x);       //accessible
        //System.out.println(AccessModifier.y);       //not accessible, because it has default access modifier
        //System.out.println(AccessModifier.z);       //not accessible, because it has private access modifier
    }
}