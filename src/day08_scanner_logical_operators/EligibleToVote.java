package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main (String [] args) {

        String name = "Ahmad";
        boolean isCitizen = true,
                isNotCriminal = true;
        int age = 30;

        boolean isEligible = isCitizen && isNotCriminal && (age >= 18);
        System.out.println(name + " is eligible to vote: " + isEligible);
        isEligible = isCitizen && !isNotCriminal && (age >= 18);
        //We can also use: isCitizen && !isNotCriminal && age >= 18, because ">=" operation being run before than "&&"
        System.out.println(name + " is eligible to vote: " + isEligible);
    }
}
