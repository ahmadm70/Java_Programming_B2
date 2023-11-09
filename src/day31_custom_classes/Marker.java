package day31_custom_classes;

public class Marker {
    String type, brand, color;
    public Marker(String myType, String myBrand, String myColor) {
        type = myType;
        brand = myBrand;
        color = myColor;
    }
    public String toString() {
        return "I have a " + color + " " + type + " marker from " + brand + ".";
    }
}