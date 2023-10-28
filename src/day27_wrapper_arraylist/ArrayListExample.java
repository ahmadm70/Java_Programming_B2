package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //All collection classes works only with OBJECT data type
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.add(100);       //.add(int) ---> adds element to the end of the list
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));     //.get(index) ---> gets the character at the given index
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        //System.out.println(numbers.get(4));
    }
}