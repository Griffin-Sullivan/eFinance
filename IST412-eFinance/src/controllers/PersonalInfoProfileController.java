/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JLabel;
import models.Customer;
import models.Loan;


public class PersonalInfoProfileController {

    private Customer customer;
    

    Customer currentUser;
    
    // constructor
    public PersonalInfoProfileController(Customer customer) {
        this.customer = customer;
        
    }
    
    // initialize customer data - authentication
    public void initData(Customer customer) {
        currentUser = customer;

    }
    
    // takes passed data and creates an arrayList - returns statement
    public ArrayList<Object> viewStatement(Customer customer, Loan loan) {
        ArrayList<Object> statement = new ArrayList();
        for (int i = 0; i < statement.size(); i++) {
            statement.add(customer.getEmail() + customer.getLastName() + loan.getLoanAmount()
                    + loan.getLoanAmount());
        }
        return statement;
    }
    
    // takes passed data and creates an ArrayList - returns customer Info
    public ArrayList<Customer> displayInfo(Customer customer, UUID loanId) {
        ArrayList<Customer> customerInfo = new ArrayList();
        customerInfo.add(customer);
        for (int i = 0; i < customerInfo.size(); i++) {
            System.out.println("FirstName: " + customer.getFirstName()
                    + "\nLast Name: " + customer.getLastName()
                    + "\nEmail: " + customer.getEmail()
                    + "\nSSN: " + customer.getSsn()
                    + "\nIncome: " + customer.getIncome()
                    + "\nLoan: " + customer.getLoan(loanId));
        }
        return customerInfo;
    }
    
    // returns email
    public String updateEmail() {
        System.out.println("Enter New Email.");

        Scanner scanner = new Scanner(System.in);
        customer.setEmail(scanner.nextLine());

        return customer.getEmail();
    }
    
    //update password
    public String updatePassword() {
        System.out.println("Enter New Password.");

        Scanner scanner = new Scanner(System.in);
        customer.setPassword(scanner.nextLine());

        return customer.getPassword();
    }
    
    // update ssn
    public int updateSSN() {
        System.out.println("Enter SSN.");

        Scanner scanner = new Scanner(System.in);
        customer.setSsn(scanner.nextInt());

        return customer.getSsn();
    }

}
