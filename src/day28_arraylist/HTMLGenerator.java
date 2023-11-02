package day28_arraylist;

public class HTMLGenerator {
    public static void main(String[] args) {
        System.out.println(generateHTML("div^5"));
        System.out.println(generateHTML("script^3"));
    }
    public static String generateHTML(String str) {
        String result = "";
        String[] parts = str.split("\\^");
        int num = Integer.parseInt(parts[1]);
        for (int i = 0; i < num; i++) {
            result += "<" + parts[0] + "></" + parts[0] + ">";
        }
        return result;
    }
}