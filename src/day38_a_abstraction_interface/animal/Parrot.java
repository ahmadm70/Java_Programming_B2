package day38_a_abstraction_interface.animal;

import day38_a_abstraction_interface.language.Language;

public class Parrot extends Birds implements Flying, Language {
    //We can have one parent class but multiple interfaces
    public void eat() {
        System.out.println("Parrot is eating");
    }
    public void fly() {
        System.out.println("Parrot is flying");
    }
    public void hi() {
        System.out.println("Hiiiii");
    }
    public void bye() {
        System.out.println("Byeeeee");
    }
}