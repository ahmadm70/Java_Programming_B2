package day32_custom_classes;

import java.util.*;

public class MyOffers {
    public static void main(String[] args) {
        Offer o1 = new Offer("Apple", "California", 150_000, true, 21);
        OfferV2 o2 = new OfferV2("Samsung", "Seoul", 200_000, true, 28);
        System.out.println(o1);
        System.out.println();
        System.out.println(o2);
        System.out.println();
        String str = new String("Hello");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Offer> offer = new ArrayList<>();     //Data type for this ArrayList is OfferV2
        ArrayList<OfferV2> offerV2 = new ArrayList<>();
        //offerV2.add(o1);      //We can't, because data type isn't matching
        offerV2.add(o2);
        System.out.println(offerV2);
        System.out.println();
        OfferV2 o3 = new OfferV2("Amazon", "Seattle", 250_000, false, 30);
        offerV2.add(o3);
        System.out.println(offerV2);
        System.out.println();
        for (OfferV2 each : offerV2) {
            System.out.println(each);
            System.out.println();
        }
    }
}