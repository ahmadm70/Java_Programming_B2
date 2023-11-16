package day34_c_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.species = "Generic Animal";
        a1.numberOfLegs = 0;
        a1.walk();
        System.out.println();
        Dog d1 = new Dog();
        d1.species = "Golden Retriever";
        d1.numberOfLegs = 4;
        d1.bark();
        d1.walk();
        System.out.println();
        Lion l1 = new Lion();
        l1.species = "White Lion";
        l1.numberOfLegs = 4;
        l1.roar();
        l1.walk();
        //l1.bark();        Even they're inheriting from same parent class, they aren't related with each other
        //l1.geography;     Private variables and methods can't be inherited
    }
}