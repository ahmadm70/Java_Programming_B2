package day37_abstraction.cars;

public class Tesla extends ElectricCar {
    public void charge() {
        System.out.println("Charging Tesla");
    }
    public void start() {
        System.out.println("Turn on engine remotely");
    }
    //CONCRETE class should override all the abstract methods
}