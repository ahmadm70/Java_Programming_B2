package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {
        IPhone phone1 = new IPhone("13 Mini", 999.99);
        IPhone phone2 = new IPhone("15", 1499.99);
        System.out.println(phone1);
        System.out.println();
        System.out.println(phone2);
        System.out.println();
        System.out.println(IPhone.brand);
        System.out.println(IPhone.os);
        System.out.println(IPhone.day);
        System.out.println(IPhone.appleDay);
    }
}