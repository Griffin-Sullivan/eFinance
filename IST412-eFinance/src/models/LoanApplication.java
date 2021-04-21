
package models;
import java.util.UUID;

/**
 *
 * @author griffinsully
 */
public class LoanApplication {
    private final String firstName;
    private final String lastName;
    private final double income;
    private final String ssn;
    private final double desiredLoanAmount;
    private UUID id;
    private boolean isApproved;

    // constructor
    public LoanApplication(String firstName, String lastName, double income, String ssn, double desiredLoanAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.ssn = ssn;
        this.desiredLoanAmount = desiredLoanAmount;
        this.isApproved = false;
        this.id = generateID();
    }
    
    // get method - returns id
    public UUID getApplicationId() {
        return this.id;
    }
    
    // set method -  sets approved status using passed params
    public void setApproved(boolean approved) {
        this.isApproved = approved;
    }
    
    // id creation - generates random unique id
    private UUID generateID() {
        UUID uniqueId = UUID.randomUUID();
        return uniqueId;
    }
    
    // get method - returns firstname
    public String getFirstName() {
        return firstName;
    }
    
    // get method - returns lastname
    public String getLastName() {
        return lastName;
    }
    
    // get method - returns income
    public double getIncome() {
        return income;
    }
    
    // get method - returns ssn
    public String getSsn() {
        return ssn;
    }

    // get method - return loan amount
    public double getDesiredLoanAmount() {
        return desiredLoanAmount;
    }

    // get method - returns true/false
    public boolean isIsApproved() {
        return isApproved;
    }
    
    
    
    
}
