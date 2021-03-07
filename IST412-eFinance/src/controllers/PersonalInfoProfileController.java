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

public class PersonalInfoProfileController {

    Customer currentUser;

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

    public void updateEmail(Customer customer) {
        System.out.println("Enter New Email.");

        Scanner scanner = new Scanner(System.in);
        customer.setEmail(scanner.nextLine());

    }

    public void updatePassword(Customer customer) {
        System.out.println("Enter New Password.");

        Scanner scanner = new Scanner(System.in);
        customer.setPassword(scanner.nextLine());

    }
    
    public void updateSSN(Customer customer){
        System.out.println("Enter SSN.");

        Scanner scanner = new Scanner(System.in);
        customer.setSsn(scanner.nextInt());
    }

}
