package day42_maps;

import java.util.*;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.offer(10);        //Does the same thing as "add()"
        queue.add(8);
        queue.offer(1);
        queue.add(1);
        //queue.add(null);      Doesn't allow null
        System.out.println(queue);
    }
}