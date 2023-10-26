package day25_methods;

public class CurrencyConverter {
    public static double convert (String currency, double amount) {
        switch (currency.toLowerCase()) {
            case "euro":
                return amount * 0.95;
            case "yen":
                return amount * 150.23;
            case "lira":
                return amount * 28.15;
            case "manat":
                return amount * 1.7;
            case "rupee":
                return amount * 83.17;
            default:
                return amount * 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(convert("manat", 100));
    }
}