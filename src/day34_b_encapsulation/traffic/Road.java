package day34_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {
        TrafficLight l1 = new TrafficLight("green");
        //System.out.println(l1.color);     It's private, that's why we don't have direct access from outside of class
        System.out.println(l1.getColor());
        //l1.color = "red";
        l1.setColor("yellow");
        System.out.println(l1.getColor());
    }
}