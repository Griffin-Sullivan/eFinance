/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import eFinance.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import models.ATZFinance;

/**
 *
 * @author griffinsully
 */
public class PayLoanController implements Initializable {
    private Main application;
    private ATZFinance bank = ATZFinance.getInstance();
    private double loanTotal;
    
    @FXML
    private Text total;
    
    @FXML
    private TextField payment;
    
    
    // sets the application view to passed values
    public void setApp(Main application) {
        this.application = application;
        loanTotal = bank.getCurrentUserTotal();
        total.setText("TOTAL:  $" + loanTotal);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    public void goToDashboard() {
        application.goToCustomerDashboard();
    }
    
    public void makePayment() {
        double amountPaid = Double.valueOf(payment.getText());
        loanTotal = loanTotal - amountPaid;
        bank.setCurrentUserTotal(loanTotal);
        total.setText("TOTAL:  $" + loanTotal);
    }
}
