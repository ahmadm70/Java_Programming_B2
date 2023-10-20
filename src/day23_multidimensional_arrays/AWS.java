package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

        String zones = "us-east1, us-west1, us-west2, us-south1, us-north1";
        String app = "Etsy";
        String[] zonesArr = zones.split(", ");
        for (String each : zonesArr) {
            System.out.println(app + " is deploying on " + each);
        }
    }
}