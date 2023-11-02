package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Monitor");
        list.add("Mouse");
        list.add("Keyboard");
        list.add("Desk");

        String str = list.remove(0);        //remove with index returns String value
        System.out.println(str);
        System.out.println(list);

        str += " " + list.remove("Desk");       //remove with object returns boolean value
        System.out.println(str);
        System.out.println(list);
    }
}