package controllers;

import eFinance.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginRegisterController implements Initializable {

    private Main application;

    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    Text usernameHelp;
    @FXML
    Text passwordHelp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    // set the application view to passed value
    public void setApp(Main application) {
        this.application = application;
    }
    
    // take in user input and create new customer
    public void addNewCustomer(String email, String password, String firstName, String lastName, int age) {
        System.out.println("Registration successful! New customer added. " + firstName + lastName + age + email + password);
    }
    
    // authenticates login credentials 
    public void authenticate() {
        if (!username.getText().equals("username")) {
            usernameHelp.setText("Invalid username");
        }
        if (!password.getText().equals("password")) {
            passwordHelp.setText("Invalid password");
        }
        if (password.getText().equals("password") && username.getText().equals("username")) {
            usernameHelp.setText("");
            passwordHelp.setText("");
            application.goToCustomerDashboard();
        }
    }
    
    // navigation - navigate to employee dashboard
    public void goToEmployee() {
        application.goToEmployeeDashboard();
    }
}
