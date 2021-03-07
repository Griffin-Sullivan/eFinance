
package models;

/**
 *
 * @author griffinsully
 */
public class Loan {
    private Double loanAmount;
    private String firstName;
    private String lastName;
    private int id;
    private Double interestRate;

    public Loan(Double loanAmount, String firstName, String lastName, int id, Double interestRate) {
        this.loanAmount = loanAmount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.interestRate = interestRate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public int getId() {
        return id;
    }

    public Double getInterestRate() {
        return interestRate;
    }
    
    public void makePayment(Double amount) {
        this.loanAmount -= amount;
    }
}
