
package models;

/**
 *
 * @author griffinsully
 */
public class LoanApplication {
    private final String firstName;
    private final String lastName;
    private int age;
    private final double income;
    private final String ssn;
    private final double desiredLoanAmount;
    private String id;

    public LoanApplication(String firstName, String lastName, double income, String ssn, double desiredLoanAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.ssn = ssn;
        this.desiredLoanAmount = desiredLoanAmount;
    }
    
    public String getApplicationId() {
        return this.id;
    }
    
    public String getAll(){
        return "First Name: " + this.firstName + "\nLast Name:" + this.lastName + "\nIncome: $" + this.income + "\nSSN: " + this.ssn + "\nLoan Amount: $" + this.desiredLoanAmount;
    }
    
    
}
