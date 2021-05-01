/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import eFinance.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
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
    private ArrayList<UUID> applicationIds = new ArrayList<>();
    private Set applicationSet;
    private int currentIndex;

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
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField incomeField;

    @FXML
    private TextField ssnField;

    @FXML
    private TextField loanAmountField;

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

    @FXML
    private Button nextButton;

    @FXML
    private Button saveButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    // sets the application view to passed value
    public void setApp(Main application) {
        this.application = application;
        applicationSet = bank.returnLoanApplications();
        bank.addTestApplications();
        Iterator<UUID> it = applicationSet.iterator();
        while (it.hasNext()) {
            applicationIds.add(it.next());
        }
        this.currentIndex = 0;
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        firstNameField.setText(loanApplication.getFirstName());
        lastNameField.setText(loanApplication.getLastName());
        ssnField.setText(loanApplication.getSsn());
        incomeField.setText("" + loanApplication.getIncome());
        loanAmountField.setText("" + loanApplication.getDesiredLoanAmount());
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
        bank.setCurrentUserTotal(loanAmntA);
        bank.addLoanApplication(newLoan.getApplicationId(), newLoan);
        application.goToCustomerDashboard();
    }

    //next button to cycle through loan applications
    @FXML
    void next(ActionEvent event) throws IOException {
        if (applicationIds.isEmpty()) {
            firstNameField.setText("");
            lastNameField.setText("");
            ssnField.setText("");
            incomeField.setText("");
            loanAmountField.setText("");
        } else if ((currentIndex < applicationIds.size() - 1) && (applicationIds.size() > 0)) {
            this.currentIndex++;
        } else {
            this.currentIndex = 0;
        }
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        firstNameField.setText(loanApplication.getFirstName());
        lastNameField.setText(loanApplication.getLastName());
        ssnField.setText(loanApplication.getSsn());
        incomeField.setText("" + loanApplication.getIncome());
        loanAmountField.setText("" + loanApplication.getDesiredLoanAmount());
    }

    //save button for editing loan information
    @FXML
    void save(ActionEvent event) throws IOException {
        LoanApplication loanApplication = bank.getLoanApplication(applicationIds.get(this.currentIndex));
        loanApplication.setFirstName(firstNameField.getText());
        loanApplication.setLastName(lastNameField.getText());
        loanApplication.setSsn(ssnField.getText());
        loanApplication.setIncome(Double.valueOf(incomeField.getText()));
        loanApplication.setDesiredLoanAmount(Double.valueOf(loanAmountField.getText()));
    }
    
    public void goToEmployeeDashboard() {
        application.goToEmployeeDashboard();
    }
    
    public void goToCustomerDashboard() {
        application.goToCustomerDashboard();
    }
}
