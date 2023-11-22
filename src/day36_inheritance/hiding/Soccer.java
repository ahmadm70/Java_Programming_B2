package day36_inheritance.hiding;

public class Soccer extends Sports {
    public static void cheer() {        //Static methods can't be overridden
        System.out.println("Cheering from CHILD class");
    }
}