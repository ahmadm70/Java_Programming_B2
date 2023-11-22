package day37_a_abstraction.exercise;

public class Running extends Exercise {
    public Running() {
        super("Running");
    }
    public void performExercise() {
        System.out.println("Running on treadmill");
    }
    public int caloriesBurnt(int min) {
        return min * 3;
    }
}