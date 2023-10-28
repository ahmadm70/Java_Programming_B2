package day27_wrapper_arraylist;

public class ParseVsValue {
    public static void main(String[] args) {
        String str = "30";
        int num1 = Integer.parseInt(str);       //Converts String into integer primitive data type
        Integer num2 = Integer.valueOf(str);    //Converts String into integer wrapper class object
        int num3 = Integer.valueOf(str);        //We can use it, but not recommended
        //Because, firstly it takes String and converts into integer wrapper object.
        //Then it takes wrapper class object and converts into integer primitive data type automatically (without parseInt)
        String booleanValue = "true12";     //Converting String into boolean wrapper class objet
        Boolean isValue = Boolean.valueOf(booleanValue);
        System.out.println(isValue);
    }
}