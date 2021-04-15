
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

    public LoanApplication(String firstName, String lastName, double income, String ssn, double desiredLoanAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.ssn = ssn;
        this.desiredLoanAmount = desiredLoanAmount;
        this.isApproved = false;
        this.id = generateID();
    }
    
    public UUID getApplicationId() {
        return this.id;
    }
    
    public void setApproved(boolean approved) {
        this.isApproved = approved;
    }
    
    private UUID generateID() {
        UUID uniqueId = UUID.randomUUID();
        return uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncome() {
        return income;
    }

    public String getSsn() {
        return ssn;
    }

    public double getDesiredLoanAmount() {
        return desiredLoanAmount;
    }

    public boolean isIsApproved() {
        return isApproved;
    }
    
    
    
    
}
