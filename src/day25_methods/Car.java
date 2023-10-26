package day25_methods;

public class Car {
    public static void unlockCar() {
        System.out.println("Unlocking the car.");
    }
    public static void openDoor() {
        System.out.println("Opening the door.");
    }
    public static void sitAndClose() {
        System.out.println("Sitting in the car.");
        System.out.println("Closing the door.");
    }
    public static void prepareAndDrive() {
        System.out.println("Putting the seatbelt on.");
        System.out.println("Turning the engine on.");
        System.out.println("Changing gear to drive.");
        System.out.println("Starting to drive.");
    }
    public static void main(String[] args) {
        unlockCar();
        openDoor();
        sitAndClose();
        prepareAndDrive();
    }
}