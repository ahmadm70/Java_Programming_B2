package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.species = "birds";
        animal1.population = 1_000_000_000_000L;
        //If we want to print out object directly, we've to declare toString() method in the class
        System.out.println(animal1);
        //System.out.println(animal1.toString());
    }
}