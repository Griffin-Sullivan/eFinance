/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import eFinance.Main;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.UUID;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import models.ATZFinance;
import models.Loan;
import models.LoanApplication;

/**
 *
 * @author griffinsully
 */
public class LoanApproveController implements Initializable {
    private Main application;
    private ArrayList<UUID> applicationIds = new ArrayList<>();
    private Set applicationSet;
    private int currentIndex;
    
    private ATZFinance bank = ATZFinance.getInstance();
    
    @FXML
    private Text title;
    
    @FXML
    private Text firstName;
    
    @FXML
    private Text lastName;
    
    @FXML
    private Text ssn;
    
    @FXML
    private Text income;
    
    @FXML
    private Text amount;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setApp(Main application) {
        this.application = application;
        applicationSet = bank.returnLoanApplications();
        bank.addTestApplications();
        Iterator<UUID> it = applicationSet.iterator();
        while (it.hasNext()){
            applicationIds.add(it.next());
        }       
        this.currentIndex = 0;
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        title.setText("Loan Application for " + loanApplication.getFirstName() + " " + loanApplication.getLastName());
        firstName.setText("First Name: " + loanApplication.getFirstName());
        lastName.setText("Last Name: " + loanApplication.getLastName());
        ssn.setText("SSN: " + loanApplication.getSsn());
        income.setText("Income: $" + loanApplication.getIncome());
        amount.setText("Amount: $" + loanApplication.getDesiredLoanAmount());
    }
    
    @FXML
    public void approve() {
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        Loan loan = new Loan(loanApplication.getDesiredLoanAmount(), loanApplication.getFirstName(), 
                loanApplication.getLastName(), loanApplication.getApplicationId(), 3.50);
        bank.getLoanApplication(loanApplication.getApplicationId()).setApproved(true);
        bank.deleteApplication(loanApplication.getApplicationId());
        applicationIds.remove(this.currentIndex);
        next();
    }
    
    @FXML
    public void decline() {
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        bank.getLoanApplication(loanApplication.getApplicationId()).setApproved(false);
        bank.deleteApplication(loanApplication.getApplicationId());
        applicationIds.remove(this.currentIndex);
        next();
    }
    
    @FXML
    public void next() {
        if (applicationIds.isEmpty()) {
            title.setText("No Current Loans to Review");
            firstName.setText("");
            lastName.setText("");
            ssn.setText("");
            income.setText("");
            amount.setText("");
        } else if ((currentIndex < applicationIds.size() - 1) && (applicationIds.size() > 0)) {
            this.currentIndex++;
        } else {
            this.currentIndex = 0;
        }
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        title.setText("Loan Application for " + loanApplication.getFirstName() + " " + loanApplication.getLastName());
        firstName.setText("First Name: " + loanApplication.getFirstName());
        lastName.setText("Last Name: " + loanApplication.getLastName());
        ssn.setText("SSN: " + loanApplication.getSsn());
        income.setText("Income: $" + loanApplication.getIncome());
        amount.setText("Amount: $" + loanApplication.getDesiredLoanAmount());
    }
}
