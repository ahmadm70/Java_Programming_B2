package day32_custom_classes;

public class TestChaining {
    public static void main(String[] args) {
        new ChainExample();
        System.out.println();
        new ChainExample(7);
        System.out.println();
        new ChainExample(77);
        System.out.println();
        new ChainExample("Loop");
    }
}