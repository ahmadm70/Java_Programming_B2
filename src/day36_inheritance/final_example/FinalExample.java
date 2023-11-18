package day36_inheritance.final_example;

public final class FinalExample {
    final int a = 5;
    //final int b;      Whenever we're making instance final we've to give a value to it
    int b;
    public FinalExample() {
    }
    public FinalExample(int b) {
        this.b = b;
    }
    public static final String planet = "Earth";
}