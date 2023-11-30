package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {
        JavaTextBook book1 = new JavaTextBook();
        book1.name = "Java Tutorial";
        book1.size = 64.48;
        book1.isFun = true;
        book1.download();
        book1.open();
        book1.read();
        System.out.println();
        EBook book2 = new JavaTextBook();
        book2.name = "Java Variables";
        book2.size = 72.28;
        /*
        book2.isFun = false;
        We're limiting access to this instance by using polymorphism
        In these cases, we can use casting for reaching to instances we need
         */
        ((JavaTextBook)book2).isFun = false;
        book2.download();
        book2.open();
        book2.read();
        System.out.println();
        Book book3 = new JavaTextBook();
        book3.name = "Java Utilities";
        ((EBook)book3).size = 121.09;
        ((JavaTextBook)book3).isFun = true;
        ((EBook) book3).download();
        book3.read();
        ((EBook) book3).open();
    }
}