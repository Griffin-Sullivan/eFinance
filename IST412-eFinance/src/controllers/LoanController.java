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
    private Customer user;

    public LoanController(MakePaymentView paymentView, LoanInfoView loanInfoView, LoanApplicationView loanApplicationView) {
        this.paymentView = paymentView;
        this.loanInfoView = loanInfoView;
        this.loanApplicationView = loanApplicationView;
    }
    
    public void submitApplication(String firstName, String lastName, String desiredLoanAmount, String desiredInterest, String bankInfo) {
        
    }
    
    public Loan displayLoanInfo(String loanId) {
        return user.getLoan(loanId);
    }
    
    public void submitPayment(Double amount, String loanId) {
        user.getLoan(loanId).makePayment(amount);
    }
    
}
