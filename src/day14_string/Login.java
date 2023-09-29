package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.next();
        System.out.print("Enter your password: ");
        String password = input.next();

        String sysPassword = "loopcamp2023";
        username = username.toLowerCase();
        if (username.equals("java") && password.length() > 8 && password.equals(sysPassword)) {
            System.out.println("Successful login!");
        } else {
            if (!username.equals("ahmadm70")) {
                System.out.println("Invalid username!");
            } else {
                System.out.println("Invalid password!");
            }
        }
    }
}