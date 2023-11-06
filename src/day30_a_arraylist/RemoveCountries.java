package day30_a_arraylist;

import java.util.*;

public class RemoveCountries {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Azerbaijan", "Japan", "Korea", "United States", "Turkey", "united Kingdom", "Canada"));
        System.out.println(modifiedList(countries));
    }
    public static ArrayList<String> modifiedList(ArrayList<String> list) {
        list.removeIf(each -> each.length() < 7);
        return list;
    }
}