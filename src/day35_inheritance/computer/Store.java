package day35_inheritance.computer;

public class Store {
    public static void main(String[] args) {
        Computer c1 = new Computer("Linux", 256);
        System.out.println(c1);
        Windows w1 = new Windows(1024);
        Windows w2 = new Windows(2056);
        System.out.println(w1);
        System.out.println(w2);
        Mac m1 = new Mac(512);
        System.out.println(m1);
    }
}