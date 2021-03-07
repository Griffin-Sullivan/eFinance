/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;
import models.Customer;

/**
 *
 * @author Jared
 * @author Dutt
 */
public class ATZFinance {
 
    private final FederalReserve federalReserve;
    private final HashMap<String, Double> currencyExchange;
    private HashMap<String,Loan> loans;
    private Customer testUser;
    

    public ATZFinance() {
        federalReserve = new FederalReserve();
        currencyExchange = new HashMap<>();
        loans = new HashMap<>();
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
}
