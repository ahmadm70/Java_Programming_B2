package day36_inheritance.lyft;

public class LyftXL extends Lyft {
    public LyftXL(String driver) {
        super(driver);
    }
    protected double calculateRate(int miles) {
        return super.calculateRate(miles) * 1.2;        //It calculates price for XL 20% more than regular one
    }
}