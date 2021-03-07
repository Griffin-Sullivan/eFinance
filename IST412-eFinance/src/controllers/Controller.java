/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.CustomerDashboard;
import views.EmployeeDashboard;
import views.LoginView;

/**
 *
 * @author Slade
 */
public class Controller {
    private final CustomerDashboard customerView;
    private final EmployeeDashboard employeeView;
    private final LoginView loginView;
    
    //More initialization goes here. As of right now, it does not allow us to.
    
    public Controller() {
        customerView = new CustomerDashboard();
        employeeView = new EmployeeDashboard();
        loginView = new LoginView();
        
        //Once they are properly created, the views will be set to visible
    }
    
    //Setting the variables goes here
    
    
}
