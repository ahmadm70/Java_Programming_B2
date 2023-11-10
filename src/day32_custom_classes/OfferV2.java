package day32_custom_classes;

public class OfferV2 {
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;
    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }
    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
//        this.company = company;
//        this.location = location;
        this(company, location);        //With the help of this() we can avoid repeated coding
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString() {
        return "Company: " + company + "\nLocation: " + location + "\nSalary: " + salary + "\nIs it full time?: " + isFullTime + "\nNumber of PTOs: " + numberOfPTO;
    }
}