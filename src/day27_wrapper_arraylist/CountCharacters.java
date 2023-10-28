package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "sef23LENF#$234sdf";
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int othersCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (Character.isUpperCase(eachLetter)) {
                upperCount++;
            } else if (Character.isLowerCase(eachLetter)) {
                lowerCount++;
            } else if (Character.isDigit(eachLetter)) {
                digitCount++;
            } else {
                othersCount++;
            }
        }
        System.out.println("Uppercases: " + upperCount);
        System.out.println("Lowercases: " + lowerCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Others: " + othersCount);
    }
}