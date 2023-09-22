package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main (String [] args) {

        System.out.print("Enter a number for choosing language:\n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijani\n\n\tYour choice: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String message;

        if (num == 1) {
            message = "Hello, thanks for your call";
        } else if (num == 2) {
            message = "Hola, gracias para llamar";
        } else if (num == 3) {
            message = "Merhaba, aradiginiz icin tesekkurler";
        } else if (num == 4) {
            message = "Privet, spasibo za vash zvonok";
        } else if (num == 5) {
            message = "Merci, pour votre appel";
        } else if (num == 6) {
            message = "Salam, zeng etdiyiniz ucun minnetdariq";
        } else {
            message = "Invalid number!";
        } //Without using else here, message will give an error, because it doesn't have default value to print if we will input number except 1-6
        System.out.println("\n\t" + message);
    }
}