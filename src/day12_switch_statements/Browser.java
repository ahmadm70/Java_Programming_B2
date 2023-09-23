package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your browser: ");
        String browser = input.nextLine();
        System.out.print("Enter your URL: ");
        String url = input.nextLine();

        switch (browser) {
            case "Google Chrome":
            case "GOOGLE CHROME":
            case "google chrome":
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("Opening " + url + " in the \"" + browser + "\" browser");
                System.out.println("Loading ...");
                break;
            case "Safari":
            case "SAFARI":
            case "safari":
                System.out.println("Opening " + url + " in the \"" + browser + "\" browser");
                System.out.println("Loading ...");
                break;
            case "Opera":
            case "OPERA":
            case "opera":
                System.out.println("Opening " + url + " in the \"" + browser + "\" browser");
                System.out.println("Loading ...");
                break;
            case "Mozilla Firefox":
            case "MOZILLA FIREFOX":
            case "mozilla firefox":
            case "Firefox":
            case "FIREFOX":
            case "firefox":
                System.out.println("Opening " + url + " in the \"" + browser + "\" browser");
                System.out.println("Loading ...");
                break;
            default:
                System.out.println(browser + " is not a valid browser!");
        }
    }
}