package day42_maps.collection;

import java.util.*;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5));
        System.out.println(list);
        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);     //Using remove() with for loop will cause issue due to changes in indexes
            }
            //System.out.print(list.get(i));
        }
        System.out.println(list);
         */
        /*
        for (Integer each : list) {
            if (each < 5) {
                list.remove(each);      //We can't change size of the List while we're looping through with for each
            }
        }
        System.out.print(list);
         */
        Iterator<Integer> it = list.iterator();     //Accepts List and returns Iterator
        while (it.hasNext()) {      //Checks if there is an element next to it, if not loop stops
            if (it.next() < 5) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}