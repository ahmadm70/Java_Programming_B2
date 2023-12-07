package day43_maps.enum_intro;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;
        switch (browser) {
            case EDGE:
                System.out.println("Opening Edge browser");
                break;
            case CHROME:
                System.out.println("Opening Chrome browser");
                break;
            case SAFARI:
                System.out.println("Opening Safari browser");
                break;
            case OPERA:
                System.out.println("Opening Opera browser");
                break;
            case FIREFOX:
                System.out.println("Opening Firefox browser");
                break;
        }
    }
}