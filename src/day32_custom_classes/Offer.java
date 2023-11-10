package day32_custom_classes;

public class Offer {
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;
    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }
    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString() {
        return "Company: " + company + "\nLocation: " + location + "\nSalary: " + salary + "\nIs it full time?: " + isFullTime + "\nNumber of PTOs: " + numberOfPTO;
    }
}