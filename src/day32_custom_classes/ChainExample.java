package day32_custom_classes;

public class ChainExample {
    public ChainExample(int i){
        this();     //This helps us to connect/chain constructors
        System.out.println("Second");
    }
    public ChainExample(String str){
        this(7);
        System.out.println("Third");
    }
    public ChainExample(){
        System.out.println("First");
    }
}