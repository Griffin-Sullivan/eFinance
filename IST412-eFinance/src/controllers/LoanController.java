/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import eFinance.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import models.ATZFinance;
import models.LoanApplication;

/**
 *
 * @author Jared
 */
public class LoanController implements Initializable {

    ATZFinance bank = ATZFinance.getInstance();

    private Main application;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField income;

    @FXML
    private TextField ssn;

    @FXML
    private TextField loanAmnt;

    @FXML
    private Text fNameLabel;

    @FXML
    private Text lNameLabel;

    @FXML
    private Text incomeLabel;

    @FXML
    private Text loanAmntLabel;

    @FXML
    private Button applyBtn;

    @FXML
    private Text ssnLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    // sets the application view to passed value
    public void setApp(Main application) {
        this.application = application;
    }

    // FXML for apply button
    @FXML
    void apply(ActionEvent event) throws IOException {
        // this is when the user hits the apply button
        String fName = firstName.getText();
        String lName = lastName.getText();
        double incomeA = Double.parseDouble(income.getText());
        String ssnA = ssn.getText();
        double loanAmntA = Double.parseDouble(loanAmnt.getText());

        LoanApplication newLoan = new LoanApplication(fName, lName, incomeA, ssnA, loanAmntA);
        bank.addLoanApplication(newLoan.getApplicationId(), newLoan);
        application.goToCustomerDashboard();
    }
}
