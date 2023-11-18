package day36_inheritance.shapes;

public class Circle extends Shapes {
    int radius;
    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
    public String toString() {
        return "Shape: " + name + "\nRadius: " + radius;
    }
}