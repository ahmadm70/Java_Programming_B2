package day37_a_abstraction.cars;

public class Garage {
    public static void main(String[] args) {
        //Car c1 = new Car();       Abstract class can't have an object
        Toyota t1 = new Toyota();
        t1.start();
        System.out.println();
        Honda h1 = new Honda();
        h1.start();
        System.out.println();
        /*
        The first NON-ABSTRACT CHILD classes are called CONCRETE classes
         */
        Tesla tesla = new Tesla();
        tesla.charge();     //Defined in ElectricCar class, implemented in Tesla class
        tesla.start();      //Defines in Car class, implemented in Tesla class
    }
}