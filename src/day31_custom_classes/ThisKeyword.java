package day31_custom_classes;

public class ThisKeyword {
    int num = 100;      //Local variable
    public ThisKeyword(int num) {
        num = 400;      //Instance variable
        //this.num = num;     //We're using "this" keyword for differing instance variable from local one
    }
}