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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class DashboardController implements Initializable {
    private Main application;
    
    @FXML
    Button submitButton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setApp(Main application){
        this.application = application;
    }
    
    public void apply() {
        application.goToLoanApplicationView();
    }
}