package day32_custom_classes;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmad", "SDET");
        System.out.println(e1);
        System.out.println();
        Employee e2 = new Employee("Ahmad", 7070, "SDET", 150_000);
        System.out.println(e2);
        e2.goToMeeting();
    }
}