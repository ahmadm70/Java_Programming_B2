package day07_relational_operators;

public class SalaryCalculator {
    public static void main (String [] args) {

        double salary = 100_000;
        double stateTaxRate = 0.06;     //6%
        double federalTaxRate = 0.22;   //22%
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: " + stateTaxRate + "%, federal tax rate: " + federalTaxRate + "%, base salary: $" + salary + ", state tax amount: $" + stateTax + ", federal tax amount: $" + federalTax + ", in total is: $" + totalTax + " and after tax our salary is: $" + salaryAfterTax;
        System.out.println(taxReport);
    }
}
