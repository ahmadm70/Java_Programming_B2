package day26_methods;

public class Picture {
    public static void draw() {
        System.out.println("Trying to draw...");
    }

    public static void draw(String color) {
        System.out.println("Trying to draw with " + color);
    }

    public static void draw(int size) {
        System.out.println("Trying to draw with brush number " + size);
    }

    public static void draw(String color, int size) {
        System.out.println("Trying to draw with " + color + " and brush number " + size);
    }
}