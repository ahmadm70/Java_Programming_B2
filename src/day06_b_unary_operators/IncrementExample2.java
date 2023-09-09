package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main (String [] args) {

        int age = 20;
        System.out.println(age);                //20
        System.out.println(age++);              //20 | age = 21
        System.out.println(++age);              //22 | age = 22
        System.out.println(age++ + 2);          //24 | age = 23
        System.out.println(++age + ++age + 2);  //51 | age = 25
        System.out.println(age++ + age++ + 2);  //53 | age = 27
    }
}
