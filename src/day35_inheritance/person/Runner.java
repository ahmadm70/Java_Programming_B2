package day35_inheritance.person;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 33;
        p1.hobby = "watching movie";
        p1.talk();
        Student s1 = new Student();
        s1.name = "Jerry";
        s1.age = 18;
        s1.hobby = "running";
        s1.grades = 'A';
        s1.talk();
        s1.study();
    }
}