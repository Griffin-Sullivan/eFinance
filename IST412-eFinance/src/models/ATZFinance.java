/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author Jared
 * @author Dutt
 */
public class ATZFinance {

    private static ATZFinance single_instance = null;
    private final HashMap<String, Double> currencyExchange;
    private HashMap<UUID, Loan> loans;
    private HashMap<UUID, LoanApplication> applications = new HashMap<UUID, LoanApplication>();
    private Customer testUser;
    private double currentUserTotal;

    // constructor
    private ATZFinance() {

        currencyExchange = new HashMap<>();
        loans = new HashMap<>();
    }
    
    // get method - returns instance of atz class
    public static ATZFinance getInstance() {
        if (single_instance == null) {
            single_instance = new ATZFinance();
        }

        return single_instance;
    }
    
    // Test Values to run application for demo
    public void addTestApplications() {
        LoanApplication app1 = new LoanApplication("Griffin", "Sullivan", 10000, "123-45-6789", 2000);
        applications.put(app1.getApplicationId(), app1);
        LoanApplication app2 = new LoanApplication("Dylan", "Tellei", 13000, "123-45-6888", 5000);
        applications.put(app2.getApplicationId(), app2);
        LoanApplication app3 = new LoanApplication("Dutt", "Patel", 15000, "111-35-6789", 200);
        applications.put(app3.getApplicationId(), app3);
    }
    
    // add loan method
    public void addLoan(UUID id, Loan loan) {
        loans.put(id, loan);
    }
    
    // get method - returns loan at id
    public Loan getLoan(UUID id) {
        return loans.get(id);
    }
    
    // get method - returns loan application at id
    public LoanApplication getLoanApplication(UUID id) {
        return applications.get(id);
    }
    
    // add loan application method - creates loan application using passed params
    public void addLoanApplication(UUID applicationId, LoanApplication application) {
        applications.put(applicationId, application);
    }

    // returns key for loan application
    public Set returnLoanApplications() {
        return applications.keySet();
    }
    
    // delete method - deletes loan application
    public void deleteApplication(UUID applicationId) {
        applications.remove(applicationId);
    }
    
    public Double getCurrentUserTotal() {
        return this.currentUserTotal;
    }
    
    public void setCurrentUserTotal(double total) {
        this.currentUserTotal = total;
    }
}
