/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

// @author Slade

import eFinance.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class DashboardController implements Initializable {
    private Main application;
    
    @FXML
    Button submitButton;
    
    @FXML
    Button logoutButton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    // sets the application screen to passed value
    public void setApp(Main application){
        this.application = application;
    }
    
    // navigation - navigate to loan application view
    public void apply() {
        application.goToLoanApplicationView();
    }
    
    // log out user
    public void logOut() {
        application.goToStart();
    }
}