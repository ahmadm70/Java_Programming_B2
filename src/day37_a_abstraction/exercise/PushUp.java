package day37_a_abstraction.exercise;

public class PushUp extends Exercise {
    public PushUp() {
        super("PushUp");
    }
    public void performExercise() {
        System.out.println("Doing push ups on the floor");
    }
    public int caloriesBurnt(int min) {
        return min * 5;
    }
}