package day40_exception.throws_keyword;

public class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("You can't assign empty string");
        } else {
            this.name = name;
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }
}