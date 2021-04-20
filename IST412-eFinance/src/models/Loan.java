
package models;

import java.util.UUID;

/**
 *
 * @author griffinsully
 */
public class Loan {
    private Double loanAmount;
    private String firstName;
    private String lastName;
    private UUID id;
    private Double interestRate;

    public Loan(Double loanAmount, String firstName, String lastName, UUID id, Double interestRate) {
        this.loanAmount = loanAmount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.interestRate = interestRate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public UUID getId() {
        return id;
    }

    public Double getInterestRate() {
        return interestRate;
    }
    
    public void makePayment(Double amount) {
        this.loanAmount -= amount;
    }
}
