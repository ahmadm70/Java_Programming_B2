package day31_custom_classes;

public class UsingTrafficLight {
    public static void main(String[] args) {
        TrafficLight tl1 = new TrafficLight("yellow");
        System.out.println(tl1.light);
        TrafficLight tl2 = new TrafficLight("red");
        System.out.println(tl2.light);
    }
}