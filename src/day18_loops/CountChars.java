package day18_loops;

public class CountChars {
    public static void main(String[] args) {

        String msg = "2juMp41EEkd-4s4";
        int uppers = 0,
                lowers = 0,
                numbers = 0,
                specials = 0;

        for (int i = 0; i < msg.length(); i++) {
            char eachLetter = msg.charAt(i);
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                uppers++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowers++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                numbers++;
            } else {
                specials++;
            }
        }
        System.out.println("You have " + uppers + " uppercase letters, " + lowers + " lowercase letters, " + numbers + " numbers and " + specials + " special characters");
    }
}