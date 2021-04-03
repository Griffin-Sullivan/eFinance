
package models;

/**
 *
 * @author griffinsully
 */
public class LoanApplication {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double income;
    private final String ssn;
    private final double desiredLoanAmount;
    private final String id;

    public LoanApplication(String firstName, String lastName, int age, double income, String ssn, double desiredLoanAmount, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
        this.ssn = ssn;
        this.desiredLoanAmount = desiredLoanAmount;
        this.id = id;
    }
    
    public String getApplicationId() {
        return this.id;
    }
    
    
}
