package day25_methods;

public class MethodWithOthers {
    public static String dayInWords(int num) {
        switch (num) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid data for a day of the week";
                //We don't have to use break while we using return, because return ends the method
        }
    }
    public static void main(String[] args) {
        System.out.println(dayInWords(7));
    }
}