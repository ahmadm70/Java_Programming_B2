package day38_a_abstraction_interface.interface_methods;

public interface Mac {
    String NAME = "Mac";
    String OS = "MacOS";
    void turnOn();
    //There is 2 methods can have body in interface:
    //First is: "public static" method
    public static void company() {
        System.out.println("Apple");
        System.out.println("HQ is in La");
        System.out.println("New release in November");
    }
    //Second is: "public default" method ---> default isn't an access modifier here
    public default void facetime() {
        System.out.println("Calling friend");
    }
}