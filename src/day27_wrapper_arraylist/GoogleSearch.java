package day27_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 7,500,000,000 results (0.77 seconds)";
        String[] resultArray = result.split(" ");
        String numStr = resultArray[1].replace(",", "");
        String timeStr = resultArray[3].substring(1);
        long num = Long.parseLong(numStr);
        double time = Double.parseDouble(timeStr);
        System.out.println(num);
        System.out.println(time);
    }
}