package day34_c_inheritance.animals;

public class Animal {
    String species;
    int numberOfLegs;
    private String geography;
    public void walk() {
        System.out.println(species + " is walking");
    }
}