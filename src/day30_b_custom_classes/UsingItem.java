package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {
        Item itemOne = new Item();
        itemOne.name = "Airpods";
        itemOne.price = 199.99;
        System.out.println(itemOne);
        System.out.println();
        Item itemTwo = new Item();
        itemTwo.name = "IPhone 13 mini";
        itemTwo.price = 999.99;
        System.out.println(itemTwo);
    }
}