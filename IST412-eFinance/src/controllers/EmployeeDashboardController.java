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
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author griffinsully
 */
public class EmployeeDashboardController implements Initializable {

    private Main application;

    @FXML
    Button logoutButton;

    @FXML
    Button updateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // sets the application screen to passed value
    public void setApp(Main application) {
        this.application = application;
    }

    // navigation - navigate to update loan view
    public void update() {
        application.goToLoanUpdateView();
    }

    //log out user
    public void logOut() {
        application.goToStart();
    }

    // navigation - navigate to loan approval view
    public void approve() {
        application.goToLoanApproveView();
    }
}
