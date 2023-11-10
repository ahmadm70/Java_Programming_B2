package day32_custom_classes;

public class UsingOffer {
    public static void main(String[] args) {
        Offer o1 = new Offer("Apple", "123 Apple Parkway, CA, 95059");
        System.out.println(o1);
        System.out.println();
        Offer o2 = new Offer("Tesla", "7700 Silicon Valley, CA, 90709", 150_000, true, 45);
        System.out.println(o2);
    }
}