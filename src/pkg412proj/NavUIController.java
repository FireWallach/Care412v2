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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dylan
 */
    

public class NavUIController implements Initializable {
    
    //Three FXML manipulation elements
    @FXML
    private Scene scene; 
    private Stage stage;
    private Parent root;
    
    @FXML
    private Button personalbutton; //refers to the button for navigation to the personal page
    @FXML
    private Button medicalbutton; // refers to the button for navigation to the medical page

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //Ends the program without error
    @FXML
    private void exitProgram(ActionEvent event) {
        System.exit(0);
    }
    
    /*
    * Displays the medical page
    */
    @FXML
    private void showMedicalPage(ActionEvent event) {
        URL url = null;
        try {
            url = new File("src/pkg412proj/MedicalUI.fxml").toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NavUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        stage = (Stage)medicalbutton.getScene().getWindow();
        try{
            root = FXMLLoader.load(url);
        } catch(IOException ex){
        }
        NavigationManager.getInstance(stage).showScene(root);
    }
    
    /*
    *Displays the personal page
    */
    @FXML
    private void showPersonalPage(ActionEvent event) {
        URL url = null;
        try {
            url = new File("src/pkg412proj/PersonalUI.fxml").toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NavUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        stage = (Stage)personalbutton.getScene().getWindow();
        try{
            root = FXMLLoader.load(url);
        } catch(IOException ex){
        }
        NavigationManager.getInstance(stage).showScene(root);
    }
}
