/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Map;

/**
 *
 * @author Jared
 * @author Dutt
 */
public class ATZFinance {
 
    private final FederalReserve federalReserve;
    private final Map<String, Double> currencyExchange;

    public ATZFinance(FederalReserve federalReserve, Map<String, Double> currencyExchange) {
        this.federalReserve = federalReserve;
        this.currencyExchange = currencyExchange;
    }
    
    public double getMaximumLoanAmount() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
}
