package day07_relational_operators;

public class Pizza {
    public static void main (String [] args) {

        String pizza = "cheese";
        int slices = 10,
                people = 4;

        int slicesPerPerson = slices / people,
                leftover = slices % people;

        System.out.println(people + " people walked in to pizzeria and ordered a " + pizza + " pizza. Each person ate "
                + slicesPerPerson + " slices and " + leftover + " slices left.");
    }
}
