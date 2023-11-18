package day36_inheritance.shapes;

public class Square extends Shapes {
    private int side;
    public Square(int side) {
        super("Square");
        setSide(side);
    }
    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }
    public double area() {
        return side * side;
    }
    public double perimeter() {
        return 4 * side;
    }
    public String toString() {
        return "Shape: " + name + "\nSide: " + side;
    }
}