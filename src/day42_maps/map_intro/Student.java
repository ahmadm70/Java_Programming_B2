package day42_maps.map_intro;

public class Student {
    String name;
    int age, id;
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nID: " + id;
    }
}