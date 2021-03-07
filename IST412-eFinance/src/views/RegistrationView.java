package views;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.JLabel;

public class RegistrationView {

    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel age;
    private TextField emailField;
    private TextField passwordField;
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField ageField;
    private Button registerButton;

    public RegistrationView() {
    }

    /**
     * New user registration page
     *
     * @param email The user's email
     * @param password The user's password
     * @param firstName The user's firstName
     * @param lastName The user's lastName
     * @param age The user's age Creates a new customer and takes them to the
     * customer dashboard
     */
    private void register(String email, String password, String firstName, String lastName, int age) {
        System.out.println("Registration successful! New customer added. " + firstName + lastName + age + email + password);
    }

}
