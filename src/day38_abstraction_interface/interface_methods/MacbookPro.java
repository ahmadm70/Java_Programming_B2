package day38_abstraction_interface.interface_methods;

public class MacbookPro implements Mac {
    public void turnOn() {
        System.out.println("Turning the Macbook Pro on");
    }
}
class Runner {
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);
        /*
        You can call interface public static final variable by class name which implements that interface
        But it's NOT RECOMMENDED
        If those variables belongs to interface, then call them by interface name
         */
        System.out.println();
        MacbookPro m1 = new MacbookPro();
        m1.turnOn();
        m1.facetime();
        //m1.company();
        /*
        This is a static method in interface, can't be inherited
        They can be accessed only by interface name
         */
        Mac.company();
    }
}