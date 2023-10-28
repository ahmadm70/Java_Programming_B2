package day27_wrapper_arraylist;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] arr = {12, 35,77, 155, -5, 0, 128, 1024, -25};
        int num = 77;
        String[] arr2 = {"hello", "world", "java", "is", "fun"};
        String str = "java";
        System.out.println(firstMatchingIndexOfArray(arr, num));
        System.out.println(firstMatchingIndexOfArray(arr2, str));
    }
    public static int firstMatchingIndexOfArray (int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int firstMatchingIndexOfArray (String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}