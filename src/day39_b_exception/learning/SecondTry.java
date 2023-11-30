package day39_b_exception.learning;

public class SecondTry {
    public static void main(String[] args) {
        try {
            String s = "java";
            //s = null;
            System.out.println(s.length());
            int[] nums = {2, 5, 7, 10};
            System.out.println(nums[7]);
//        } catch (Exception e) {       Parent exception should be used after child exceptions
//            System.out.println("Parent exception");
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {        //In one try block as soon as code reaches to first exception it jumps to the catch body and skips rest of try body
            System.out.println("Caught a ArrayIndexOutOfBoundsException");
        }
        System.out.println("Done");
    }
}