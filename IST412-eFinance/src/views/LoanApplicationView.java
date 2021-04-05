/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.LoanController;
import models.Loan;
import models.Customer;
import models.LoanApplicationObject;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Jared
 */
public class LoanApplicationView {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField desiredLoanAmountField;
    private JTextField desiredInterestField;
    private JTextField bankInfoField;
    private JButton submitButton;
    private LoanController loanController;
    
    public void submitApplication() {
        loanController.submitApplication(firstNameField.getText(), lastNameField.getText(),
                desiredLoanAmountField.getText(), desiredInterestField.getText(), bankInfoField.getText());
 
                LoanApplicationObject(customer, loan);
    }

    public LoanApplication(Customer customer, Loan loan) {

        this.customer = customer;
        this.loan = loan;
    }
    
    
    
    
}
