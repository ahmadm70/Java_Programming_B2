package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main (String[] args) {
        System.out.println("This is not TABbed");
        System.out.println("\tThis is TABbed");
        System.out.println("\t\tThis TABbed 2 times");
        System.out.println("    This is SPACEd 4 times");
        System.out.println("    \tThis is SPACEd 4 times then TABbed");
        //TAB is equal to 4 spaces in Java
        System.out.println();
        System.out.println("");
        System.out.println("1) Go to the store");
        System.out.println("2) Grab milk");
        System.out.println("3) Pay");
        System.out.println("1) Go to the store\n2) Grab milk\n3) Pay");
        System.out.println("\n1) Go to the store\n2) Grab milk\n3) Pay");
    }
}
