/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;

/**
 *
 * @author Jared
 * @author Dutt
 */
public class ATZFinance {
    
    private static ATZFinance single_instance=null;
    private final FederalReserve federalReserve;
    private final HashMap<String, Double> currencyExchange;
    private HashMap<String,Loan> loans;
    private HashMap<String,LoanApplication> applications;
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
    
    public void addTestLoans() {
        loans.put("123", new Loan(10000.00, "joe", "shmoe", "123", 4.5));
    }
    
    public Loan getLoan(String id) {
        return loans.get(id);
    }
    
    public LoanApplication getLoanApplication(String id) {
        return applications.get(id);
    }
    
    public void addLoanApplication(LoanApplication application) {
        applications.put(application.getApplicationId(), application);
    }
}
