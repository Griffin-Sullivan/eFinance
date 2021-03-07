package testharness;

import controllers.Controller;
import models.Customer;
import models.Employee;

public class TestHarness {

    public static void main(String[] args) {
        Customer testUser = new Customer("john", "smith", 35, "johnsmith@gmail.com", "password");
        Employee testEmployee = new Employee("joework", "password", "joework@gmail.com");
    }
}
