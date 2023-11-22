package day37_a_abstraction.exercise;

public abstract class Exercise {
    String name;
    public Exercise(String name) {
        this.name = name;
    }
    public abstract void performExercise();
    public abstract int caloriesBurnt(int min);
    public void generalInfo() {
        System.out.println("Exercise is good for you!");
    }
    /*
    We can inherit regular method in abstract class to child
    We can override regular method in abstract class to child
     */
}