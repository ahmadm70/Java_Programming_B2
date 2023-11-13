package day33_b_encapsulation.access_modifiers;

public class AccessModifier {
    public int a;       //public access modifier
    int b;      //default access modifier
    private int c;      //private access modifier
    public static int x;
    static int y;
    private static int z;

    /**
     * In the SAME CLASS
     */
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);      //accessible
        System.out.println(obj.b);      //accessible
        System.out.println(obj.c);      //accessible
        System.out.println(AccessModifier.x);       //accessible
        System.out.println(AccessModifier.y);       //accessible
        System.out.println(AccessModifier.z);       //accessible
    }
}