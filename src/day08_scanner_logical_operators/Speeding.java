package day08_scanner_logical_operators;

public class Speeding {
    public static void main (String [] args) {

        double speed = 40,
                speedLimit = 25;
        boolean isSpeeding = speed > speedLimit;

        System.out.println("You're in school zone. Are you speeding? " + isSpeeding);   //true
    }
}
