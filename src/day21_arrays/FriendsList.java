package day21_arrays;

import java.util.*;

public class FriendsList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many friends do you have?: ");
        int numOfFriends = input.nextInt();
        String[] list = new String[numOfFriends];

        for (int i = 0; i < numOfFriends; i++) {
            System.out.print("Enter your friend's name: ");
            String names = input.next();
            list[i] = names;
        }
        System.out.println(Arrays.toString(list));
    }
}