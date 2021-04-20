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
    
    private static ATZFinance single_instance=null;
    private final FederalReserve federalReserve;
    private final HashMap<String, Double> currencyExchange;
    private HashMap<UUID,Loan> loans;
    private HashMap<UUID,LoanApplication> applications = new HashMap<UUID,LoanApplication>();
    private Customer testUser;
    

    private ATZFinance() {
        federalReserve = new FederalReserve();
        currencyExchange = new HashMap<>();
        loans = new HashMap<>();
    }
    
    public static ATZFinance getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new ATZFinance(); 
  
        return single_instance; 
    } 
    
    public double getMaximumLoanAmount() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public void addTestApplications() {
        LoanApplication app1 = new LoanApplication("Griffin", "Sullivan", 10000, "123-45-6789", 2000);
        applications.put(app1.getApplicationId(), app1);
        LoanApplication app2 = new LoanApplication("Dylan", "Tellei", 13000, "123-45-6888", 5000);
        applications.put(app2.getApplicationId(), app2);
        LoanApplication app3 = new LoanApplication("Dutt", "Patel", 15000, "111-35-6789", 200);
        applications.put(app3.getApplicationId(), app3);
    }
    
    public void addLoan(UUID id, Loan loan) {
        loans.put(id, loan);
    }
    
    public Loan getLoan(UUID id) {
        return loans.get(id);
    }
    
    public LoanApplication getLoanApplication(UUID id) {
        return applications.get(id);
    }
    
    public void addLoanApplication(UUID applicationId, LoanApplication application) {
        applications.put(applicationId, application);
    }
    
    public Set returnLoanApplications() {
        return applications.keySet();
    }
    
    public void deleteApplication(UUID applicationId) {
        applications.remove(applicationId);
    }
}
