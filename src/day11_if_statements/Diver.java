package day11_if_statements;

public class Diver {
    public static void main (String [] args) {

        int level = 100;
        String message;

        if (level > 90 && level <= 100) {
            message = "Your tank is full";
        } else if (level > 80 && level <= 90) {
            message = "Still okay";
        } else if (level > 70 && level <= 80) {
            message = "Don't go too far";
        } else if (level > 60 && level <= 70) {
            message = "Start to head back";
        } else if (level > 50 && level <= 60) {
            message = "Be careful, now you are at %" + level;
        } else {
            message = "You were a good guy!";
        }
        System.out.println(message);
    }
}