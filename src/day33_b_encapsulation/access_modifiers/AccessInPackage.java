package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {
    /**
     * Different CLASS, in the SAME PACKAGE
     */
    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        System.out.println(object.a);
        System.out.println(object.b);
        //System.out.println(object.c);     //not accessible, because it has private access modifier
        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        //System.out.println(AccessModifier.z);     //not accessible, because it has private access modifier
        /**
         * variables with PRIVATE ACCESS MODIFIER can be accessed inside of class, nowhere else
         * variables with DEFAULT ACCESS MODIFIER can be accessed inside of package, but can't in a different package
         * variables with PUBLIC ACCESS MODIFIER can be accessed inside of whole project, but can't in a different project
         */
    }
}