package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw("green");
        Picture.draw(7);
        Picture.draw("green", 7);
    }
}