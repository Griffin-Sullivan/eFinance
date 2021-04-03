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
import javax.swing.JLabel;
import models.Customer;
import models.Loan;
import views.PersonalInfoView;

public class PersonalInfoProfileController {
    
    private Customer customer;
    private PersonalInfoView profileView;
    
    
    Customer currentUser;
    
    public PersonalInfoProfileController(Customer customer, PersonalInfoView profileView){
        this.customer = customer;
        this.profileView = profileView;
    }

    public void initData(Customer customer) {
        currentUser = customer;

    }

    public void signOut(ActionEvent event) throws IOException {
        /*
            On button click, user sign out
         */
    }

    public ArrayList<Object> viewStatement(Customer customer, Loan loan) {
        ArrayList<Object> statement = new ArrayList();
        for (int i = 0; i < statement.size(); i++) {
            statement.add(customer.getEmail() + customer.getLastName() + loan.getLoanAmount()
                    + loan.getLoanAmount());
        }
        return statement;
    }
    
    public ArrayList<Customer> displayInfo(Customer customer, String loanId){
        ArrayList<Customer> customerInfo = new ArrayList();
        customerInfo.add(customer);
        for(int i = 0; i < customerInfo.size(); i++){
            System.out.println("FirstName: " + customer.getFirstName() 
                               +"\nLast Name: " + customer.getLastName()
                               +"\nEmail: " + customer.getEmail()
                               +"\nSSN: " + customer.getSsn()
                               +"\nIncome: " + customer.getIncome()
                               +"\nLoan: " + customer.getLoan(loanId));
        } 
        return customerInfo;
        // Add styling
    }

    public String updateEmail() {
        System.out.println("Enter New Email.");

        Scanner scanner = new Scanner(System.in);
        customer.setEmail(scanner.nextLine());
        
        return customer.getEmail();
    }

    public String updatePassword() {
        System.out.println("Enter New Password.");

        Scanner scanner = new Scanner(System.in);
        customer.setPassword(scanner.nextLine());
        
        return customer.getPassword();
    }
    
    public int updateSSN(){
        System.out.println("Enter SSN.");

        Scanner scanner = new Scanner(System.in);
        customer.setSsn(scanner.nextInt());
        
        return customer.getSsn();
    }

}
