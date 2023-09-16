package day09_a_scanner;
import java.util.Scanner;
public class Angles {
    public static void main (String [] args) {

        System.out.println("Enter three angle degrees: ");

        Scanner input = new Scanner(System.in);
        double angle1 = input.nextDouble(),
                angle2 = input.nextDouble(),
                angle3 = input.nextDouble(),
                sum = angle1 + angle2 + angle3;
        boolean isTriangle = sum == 180,
                isCircle = sum == 360;

        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}
