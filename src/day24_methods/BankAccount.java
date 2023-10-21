package day24_methods;

import java.util.*;

public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many accounts are there: ");
        String[][] allAccounts = new String[input.nextInt()][4];
        String[] questions = {"Fullname: ", "Account type: ", "Account number: ", "Balance: $"};
        input.nextLine();
        for (int i = 0; i < allAccounts.length; i++) {
            for (int j = 0; j < questions.length; j++) {
                System.out.print(questions[j]);
                allAccounts[i][j] = input.nextLine();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(allAccounts));
    }
}