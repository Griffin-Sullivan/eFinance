package views;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.JLabel;

/**
 * Represents the view for the login screen
 *
 * @author Griffin Sullivan
 */
public class LoginView {

    private Button loginButton;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private TextField emailField;
    private TextField passwordField;
    private Button signUpButton;

    /**
     * Authenticates the user when they attempt to login
     *
     * @param email The user's email address
     * @param password The user's password If successful the user will be taken
     * to their dashboard
     */
    private void authenticate(String email, String password) {
        System.out.println(email + "Has been authenticated.");
    }

}
