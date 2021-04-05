package models;

import models.Customer;
import models.Loan;

public class LoanApplication {

    private Customer customer;
    private Loan loan;
    
    public LoanApplication(Customer customer, Loan loan){

        this.customer = customer;
        this.loan = loan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    
}
