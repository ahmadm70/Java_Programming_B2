package day34_c_inheritance.animals;

public class Dog extends Animal {        //It basically means that, Dog class is a child class for Animal class
    boolean isDomestic;
    public void bark () {
        System.out.println("Dog is barking.");
    }
}