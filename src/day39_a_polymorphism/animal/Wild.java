package day39_a_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        //Reference is itself ---> same class
        //It has access to 3 instance variables and 1 instance method
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Loly";
        l1.numberOfClaws = 16;
        l1.skinColor = "brown";
        System.out.println();
        //Reference is super class ---> parent class
        //It has access to 2 instance variables and 1 instance method
        Reptile r1 = new Lizard();
        r1.eat();
        r1.name = "Fury";
        r1.numberOfClaws = 12;
        //r1.skinColor = "black";       Reptile reference doesn't have an access
        System.out.println();
        //
        Animal a1 = new Lizard();
        a1.eat();
        a1.name = "Grunt";
        //a1.numberofClaws = 8;     Animal reference doesn't have an access
        //a1.skinColor = "dark yellow";     Animal reference doesn't have an access
        System.out.println();

    }
}