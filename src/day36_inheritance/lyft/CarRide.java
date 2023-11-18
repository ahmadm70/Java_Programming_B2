package day36_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {
        Lyft o1 = new Lyft("Tom");
        System.out.println(o1.calculateRate(10));
        LyftXL o2 = new LyftXL("Jerry");
        System.out.println(o2.calculateRate(10));
    }
}