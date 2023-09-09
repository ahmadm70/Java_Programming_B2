package day03_comments_escape_sequence;

public class Quote {
    public static void main (String [] args) {
        /*
        Q: How can I output the following?
        I like "Java" programming
        A: We can use "Escape Sequence".
         */
        System.out.println("I like Java programming");
        System.out.println("I like \"Java\" programming");
        System.out.println("I like `Java` programming");
        System.out.println("I like \\Java\\ programming");
        // We need to use backward slash (\) before the characters that being used in Java syntax.
        /*
        Q: How can I output 2 backward slashes? (example, \\Java\\)
        A: We need to write 4 backward slashes in each side.
         */
        System.out.println("I like \\\\Java\\\\ programming");
    }
}
