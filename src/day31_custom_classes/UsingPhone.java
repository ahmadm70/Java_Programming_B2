package day31_custom_classes;

public class UsingPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("IPhone X");
        System.out.println(phone1);
        System.out.println();
        Phone phone2 = new Phone("IPhone 15", "Apple");
        System.out.println(phone2);
        System.out.println();
        Phone phone3 = new Phone("S6 Edge", "Samsung", 128, 6.1);
        System.out.println(phone3);
    }
}