package day44_map_and_functions.functional_interfaces;

@FunctionalInterface        //It has to have 1 abstract method (no more, no less)
public interface NumberInterface {
    //apply() & test() are the most common names used in functional interfaces
    void apply(int a);
    //void apply2(int a);
}