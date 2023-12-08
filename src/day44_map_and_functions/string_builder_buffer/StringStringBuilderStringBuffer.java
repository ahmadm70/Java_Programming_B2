package day44_map_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {
        //String class
        String str1 = "Loop";       //Stored in String Pool in Heap
        String str2 = new String("Loopcamp");       //Stored directly in Heap
        str1 = str1 + "Academy";        //IMMUTABLE, we're making new String in memory, not changing first one
        //StringBuilder class
        StringBuilder str3 = new StringBuilder("LoopCamp");     //Stored directly in Heap (new keyword)
        System.out.println(str3);
        System.out.println(str3.append(" classes"));
        /*
        MUTABLE, we can change value without making new StringBuilder in memory (using append())
        Not synchronized (not thread safe)
         */
        //StringBuffer
        StringBuffer str4 = new StringBuffer("LoopAcademy");
        System.out.println(str4);
        System.out.println(str4.reverse());
        /*
        MUTABLE, we can change value without making new StringBuilder in memory
        SYNCHRONIZED (thread safe)
         */
    }
}