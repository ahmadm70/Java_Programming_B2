package day06_a_arithmetic_operators;

public class House {
    public static void main (String [] args) {

        String houseType = "single house";
        int numberOfBedrooms = 5,
                numberOfBathroom = 3,
                numberOfKitchen = 2;
        boolean hasBasement = true,
                hasAttic = false,
                isOnSale = false;
        double price = 9_999_999.99;         //In Java we can use "_" for making numbers more readeble, "," not allowed by Java.
        //9,999,999 --> Not allowed         //9_999_999 --> Allowed
        String address = "123 Central Park, NY";
        int zipcode = 12321;
        boolean hasPark = true;
        double rating = 4.9;

        String result = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + price + ".\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathroom + " bathrooms and " + numberOfKitchen + " kitchens.\nIt also includes a basement " + hasBasement + ", has an attic: " + hasAttic + " and has a park located nearby: " + hasPark + ", is on sale: " + isOnSale + "\nThe rating of the schools in the area is " + rating + " out of 5";

        System.out.println(result);
    }
}
