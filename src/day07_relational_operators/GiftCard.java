package day07_relational_operators;

public class GiftCard {
    public static void main (String [] args) {

        double giftCard = 200;
        double secondItem = 50;
        System.out.println("Buy item 1 for $100");
        giftCard -= 100;
        System.out.println("Buy item 2 for $" + secondItem);
        giftCard -= secondItem;
        System.out.println("Your gift card balance is now: $" + giftCard);
    }
}
