/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

// @author Slade

import java.util.ArrayList;
import models.Customer;
import models.Employee;
import views.CustomerDashboard;
import views.EmployeeDashboard;


public class DashboardController {
    
    private CustomerDashboard customerDashboard;
    private EmployeeDashboard employeeDashboard;
    
    public DashboardController(CustomerDashboard customerDashboard, EmployeeDashboard employeeDashboard) {
        this.customerDashboard = customerDashboard;
        this.employeeDashboard = employeeDashboard;
}
    
    public void displayCustomerDashboard() {
        
        /* 
         * Displays the customer's dashboard, or main navigation menu.
         * Which would include information such as as important details about loans to know,
         * buttons to navigate towards different windows, such as applying for loans, viewing
         * loan information, and editing personal information.
         * This will all be included in future updates.
         */
        
}
    
    public void displayEmployeeDashboard() {
        
        /*
         * Displays the employee's dashboard, or main navigation menu
         * Which would include information such as the employee's personal information,
         * buttons to navigate towards approving/denying loans, and important details about
         * loans to know as an employee.
         * This will all be included in future updates.
         */
        
    }

    //Creates a welcome message for the Customer when they login.
    public ArrayList<Customer> welcomeCustomerMessage(Customer customer) {
        ArrayList<Customer> customerMessage = new ArrayList();
        customerMessage.add(customer);
        for (int i = 0; i < customerMessage.size(); i++) {
            System.out.println("Hi, " + customer.getFirstName() + customer.getLastName() + "! Welcome to eFinance.");
        }
        
        return customerMessage;
    }
    
    //Creates a welcome message for the Employee when they login.
    public ArrayList<Employee> welcomeEmployeeMessage(Employee employee) {
        ArrayList<Employee> employeeMessage = new ArrayList();
        employeeMessage.add(employee);
        for (int i = 0; i < employeeMessage.size(); i++) {
            System.out.println("Welcome back to eFinance, " + employee.getUsername());
        }
        
        return employeeMessage;
    }
}

