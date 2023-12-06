package day42_maps.collection;

import java.util.*;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.offer(10);        //Does the same thing as "add()"
        queue.add(8);
        queue.offer(1);
        queue.add(1);
        queue.offer(15);
        queue.add(1);
        try {
            queue.add(null);        //Doesn't allow null
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //queue.get(2);     Doesn't work get() method, because it doesn't have indexes
        System.out.println(queue);
        queue.remove(1);        ////Removes first matching object
        System.out.println(queue.remove(1));        //Returns boolean ---> true in this case
        System.out.println(queue);
        queue.remove(3);        //Since there is no matching object, it won't remove anything
        System.out.println(queue.remove(3));        //Returns boolean ---> false in this case
        System.out.println(queue);
        queue.poll();       //Removes element from the beginning
        System.out.println(queue.poll());       //It returns whatever was removed
        System.out.println(queue);
        System.out.println(queue.remove());     //It'll remove element from the end if no parameter used (END means FIRST ELEMENT in here)
        //System.out.println(new PriorityQueue<>().remove());
        //If PriorityQueue is empty and remove() method is used, it'll throw NoSuchElementException
        System.out.println(new PriorityQueue<>().poll());       //It'll return null
    }
}