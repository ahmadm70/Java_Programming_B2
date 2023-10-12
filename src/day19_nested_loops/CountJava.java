package day19_nested_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is language. java is good. learn java.";
        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String everyFour = str.substring(i, i + 4);

            if (everyFour.equals("java")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}