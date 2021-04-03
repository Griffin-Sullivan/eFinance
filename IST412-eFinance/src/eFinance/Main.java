package eFinance;

import controllers.DashboardController;
import controllers.LoginRegisterController;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.ATZFinance;

/**
 *
 * @author griffinsully
 */
public class Main extends Application{
    private Stage stage;
    ATZFinance bank = ATZFinance.getInstance();

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            stage = primaryStage;
            stage.setTitle("eFinance");
            goToStart();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }
    
    public void goToStart() 
    {
        try {
            LoginRegisterController login = (LoginRegisterController) replaceSceneContent("../views/LoginView.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goToCustomerDashboard() 
    {
        try {
            DashboardController dashboard = (DashboardController) replaceSceneContent("../views/CustomerDashboard.fxml");
            dashboard.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

}
