package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;
    public Phone(String name) {
        this.name = name;
    }
    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }
    public String toString() {
        return "Name: " + name + "\nBrand: " + brand + "\nMemory: " + memory + " GB\nVersion: " + version + "";
    }
}