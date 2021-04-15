/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
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
    
    public void addTestLoans() {
        //loans.put("123", new Loan(10000.00, "joe", "shmoe", "123", 4.5));
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
}
