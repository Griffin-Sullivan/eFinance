/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import eFinance.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author Jared
 */
public class LoanController implements Initializable{
    private Main application;
    
  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }
      
        public void setApp(Main application){
        this.application = application;
    }
        
    public void apply()
    {
    // this is when the user hits the apply button
    }
}
