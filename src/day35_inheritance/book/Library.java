package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Lord of the Rings";
        AudioBook a1 = new AudioBook();
        a1.title = "The Lion";
        a1.duration = 122;
        a1.narrator = new String("Tom Jerry");
        a1.author = new Author("Tom", 25);
        /*
        These two lines above are the same
        String lets us assign values directly without using new keyword as well
        */
        a1.listen();
        EBook e1 = new EBook();
        e1.title = "War & Peace";
        e1.pages = 345;
        e1.read();
        Author author = new Author("Jon", 33);
    }
}