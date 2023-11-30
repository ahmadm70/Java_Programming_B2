package day38_abstraction_interface.language;

public class Translator {
    public static void main(String[] args) {
        //Language l1 = new Language();
        Spanish s1 = new Spanish();
        s1.hi();
        s1.bye();
        Azerbaijani a1 = new Azerbaijani();
        a1.hi();
        a1.bye();
    }
}