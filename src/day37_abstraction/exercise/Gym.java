package day37_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
        Running r1 = new Running();
        System.out.println(r1.name);
        r1.performExercise();
        System.out.println(r1.caloriesBurnt(10));
        r1.generalInfo();
        System.out.println();
        PushUp p1 = new PushUp();
        System.out.println(p1.name);
        p1.performExercise();
        System.out.println(p1.caloriesBurnt(10));
        p1.generalInfo();
        System.out.println();
    }
}