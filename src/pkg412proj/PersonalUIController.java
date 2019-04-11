/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dylan
 */
public class PersonalUIController implements Initializable {
    
    
    private User user; //The logged in user
    private Stage stage;
    private Parent root;
    @FXML
    private Button backButton; //Refers to the back button in the view

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO Write logic to pull-in the user authenticated at login
    }    
    
    /*
    * Enables manual editing of Personal Record
    */
   
    public void enableEditing(){
        //TODO: Write logic to edit personal information.
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    
     public void goHome() {
        URL url = null;
        try {
            url = new File("src/pkg412proj/NavUI.fxml").toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NavUIController.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage = (Stage) backButton.getScene().getWindow();
        try {
            root = FXMLLoader.load(url);
        } catch (IOException ex) {
        }
        NavigationManager.getInstance(stage).showScene(root);
    }


}
