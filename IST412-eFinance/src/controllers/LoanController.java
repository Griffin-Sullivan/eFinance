/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Customer;
import models.Loan;
import views.LoanApplicationView;
import views.LoanInfoView;
import views.MakePaymentView;

/**
 *
 * @author Jared
 */
public class LoanController {
    private MakePaymentView paymentView;
    private LoanInfoView loanInfoView;
    private LoanApplicationView loanApplicationView;

    public LoanController(MakePaymentView paymentView, LoanInfoView loanInfoView, LoanApplicationView loanApplicationView) {
        this.paymentView = paymentView;
        this.loanInfoView = loanInfoView;
        this.loanApplicationView = loanApplicationView;
    }

    public LoanApplication(Customer customer, Loan loan){

        this.customer = customer;
        this.loan = loan;
    }
    
    public void submitApplication(String firstName, String lastName, String desiredLoanAmount, String desiredInterest, String bankInfo) {
        System.out.println("Application submitted");
    }
    
    public Loan displayLoanInfo(Customer customer, String loanId) {
        return customer.getLoan(loanId);
    }
    
    public void submitPayment(Customer customer, Double amount, String loanId) {
        customer.getLoan(loanId).makePayment(amount);
    }

    public void apply() {
        LoanApplicationView.LoanApplication(customer, loan);

    }
        
}
