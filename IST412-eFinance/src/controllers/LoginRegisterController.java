package controllers;

public class LoginRegisterController {

    public LoginRegisterController() {
    }

    private void openLoginView() {
    }

    private void openRegistrationView() {
    }

    private void openCustomerDashboard() {
    }

    private void openEmployeeDashboard() {
    }

    public void addNewCustomer(String email, String password, String firstName, String lastName, int age) {
        System.out.println("Registration successful! New customer added. " + firstName + lastName + age + email + password);
    }

    public void authenticate(String email, String password) {
        System.out.println(email + "Has been authenticated.");
    }
}
