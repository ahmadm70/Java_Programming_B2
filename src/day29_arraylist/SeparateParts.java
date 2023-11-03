package day29_arraylist;

import java.util.*;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABC123!@#$%^456EFG";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);
        ArrayList<String> numList = new ArrayList<>(list);
        numList.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println(numList);
        ArrayList<String> specialList = new ArrayList<>(list);
        specialList.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")"));
        System.out.println(specialList);
        ArrayList<String> letterList = new ArrayList<>(list);
        letterList.removeAll(numList);
        letterList.removeAll(specialList);
        System.out.println(letterList);
    }
}