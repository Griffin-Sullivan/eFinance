/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Slade
 */
public class Controller {

    private DashboardController dashboardController;
    private LoanController loanController;
    private LoginRegisterController loginRegisterController;
    private PersonalInfoProfileController personalInfoProfileController;

    // returns the dashboard controller
    public DashboardController getDashboardController() {
        return dashboardController;
    }

    // returns the loan controller
    public LoanController getLoanController() {
        return loanController;
    }

    // returns the login register controller
    public LoginRegisterController getLoginRegisterController() {
        return loginRegisterController;
    }

    // returns the personal info controller
    public PersonalInfoProfileController getPersonalInfoProfileController() {
        return personalInfoProfileController;
    }

    // sets the dashboard screen to the passed value
    public void setDashboardController(DashboardController tempDash) {
        this.dashboardController = tempDash;
    }

    // sets the loan screen to the passed values
    public void setLoanController(LoanController tempLoan) {
        this.loanController = tempLoan;
    }

    //sets the login register screen to the passed value
    public void setLoginRegisterController(LoginRegisterController tempLoginRegister) {
        this.loginRegisterController = tempLoginRegister;
    }

    // sets the personal info profile screen to the passed value
    public void setPersonalInfoProfileController(PersonalInfoProfileController tempPip) {
        this.personalInfoProfileController = tempPip;
    }

}
