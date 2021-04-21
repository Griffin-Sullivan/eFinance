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
    private final UUID id;
    private final Double interestRate;

    // constructor
    public Loan(Double loanAmount, String firstName, String lastName, UUID id, Double interestRate) {
        this.loanAmount = loanAmount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.interestRate = interestRate;
    }

    // get method - returns loan amount
    public Double getLoanAmount() {
        return loanAmount;
    }

    // set method - sets firstname using passed param
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   
    // set method - sets lastname using passed param
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // set method - sets loan amount using passed param
    public int setLoanAmount(int loanAmount) {
        return loanAmount;
    }
    
    // get method - returns id
    public UUID getId() {
        return id;
    }
    
    // get method - returns interest rate
    public Double getInterestRate() {
        return interestRate;
    }
    
    // calculation - deducts double amount from loanAmount total
    public void makePayment(Double amount) {
        this.loanAmount -= amount;
    }
}
