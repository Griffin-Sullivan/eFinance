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



    //Setting the variables goes here
    public DashboardController getDashboardController() {
        return dashboardController;
    }

    public LoanController getLoanController() {
        return loanController;
    }

    public LoginRegisterController getLoginRegisterController() {
        return loginRegisterController;
    }

    public PersonalInfoProfileController getPersonalInfoProfileController() {
        return personalInfoProfileController;
    }

    public void setDashboardController(DashboardController tempDash) {
        this.dashboardController = tempDash;
    }

    public void setLoanController(LoanController tempLoan) {
        this.loanController = tempLoan;
    }

    public void setLoginRegisterController(LoginRegisterController tempLoginRegister) {
        this.loginRegisterController = tempLoginRegister;
    }

    public void setPersonalInfoProfileController(PersonalInfoProfileController tempPip) {
        this.personalInfoProfileController = tempPip;
    }

}
