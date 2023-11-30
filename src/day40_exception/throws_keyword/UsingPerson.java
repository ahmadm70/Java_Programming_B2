package day40_exception.throws_keyword;

public class UsingPerson {
    public static void main(String[] args) {
        Person obj = new Person();
        try {
            obj.setName("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            obj.setAge(-25);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}