package day24_methods;

public class AverageOfEach {
    public static void main(String[] args) {

        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6, 10, 12},
                {10, 20, 30}
        };
        System.out.println(nums.length);
        System.out.println(nums[2].length);
        int sum = 0;
        int totalLength = 0;

        for (int[] eachArray : nums) {
            //int sumEach = 0;
            for (int eachInt : eachArray) {
                sum += eachInt;
                //sumEach += eachInt;
            }
            totalLength += eachArray.length;
            //System.out.println("Average of each cycle is: " + sumEach / eachArray.length());
        }
        System.out.println("Total average is: " + sum / totalLength);
    }
}