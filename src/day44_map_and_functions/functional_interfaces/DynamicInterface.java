package day44_map_and_functions.functional_interfaces;

@FunctionalInterface
public interface DynamicInterface <T>{
    void test(T t);     //T is a generic type (it can accept any data type), t is a parameter name
}