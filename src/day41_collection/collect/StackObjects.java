package day41_collection.collect;

import java.util.*;

public class StackObjects {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);
        System.out.println("Top of the stack: " + stack.peek());
        System.out.println(stack.pop());        //It'll remove the element at the top of the stack and return it
        System.out.println(stack);
    }
}