package day18_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abcabcabcd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);
    }
}