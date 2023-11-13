package day33_a_static;

public class BestBuy {
    String location;
    static String headquarter = "Minnesota";
    static String day = "Saturday";
    /*
    Every object has its own copy of instance variables, but has the SAME copy of STATIC variable
    Instance variables can't be called by class name, but static variables can
     */
    public BestBuy(String location) {
        this.location = location;
    }
    /*
    Instance methods can't be called by class names, we've to use object reference name for calling them
    Instance methods can accept both: instance and static variables
     */
    public void openStore() {
        System.out.println("Opening " + location);
        System.out.println("Headquarter is at the " + headquarter);
    }
    /*
    Static methods can be called by both: class and object reference names (preferably use class name)
    Static methods can accept ONLY static variables
    Static methods can't accept neither instance variables nor instance methods
     */
    public static void countStock() {
        System.out.println("Counting stock at " + headquarter);
    }
}