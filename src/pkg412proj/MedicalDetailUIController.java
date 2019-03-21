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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dylan
 */
public class MedicalDetailUIController implements Initializable {

    private String user;
    private Stage stage;
    private Parent root;
    
    @FXML
    private Label nameLabel;
    @FXML
    private Label testLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private Label doctorLabel;
    @FXML
    private Label testRoomLabel;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameLabel.setText(MedicalReportList.get(MedicalReportList.getSelected()).getUser());
        testLabel.setText(MedicalReportList.get(MedicalReportList.getSelected()).getTestType());
        resultLabel.setText(MedicalReportList.get(MedicalReportList.getSelected()).getResult());
        doctorLabel.setText("Dr. Earnhardt"); //Hardcoded as this is a one-off demonstration of list-detail; Therefore I didn't see fit to reformat my models to then only revert them when development resumes. 
        testRoomLabel.setText("Room 4");//Hardcoded as this is a one-off demonstration of list-detail; Therefore I didn't see fit to reformat my models to then only revert them when development resumes. 
    }    

    @FXML
    private void goBack(ActionEvent event) {
        URL url = null;
        try {
            url = new File("src/pkg412proj/MedicalUI.fxml").toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NavUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        stage = (Stage)backButton.getScene().getWindow();
        try{
            root = FXMLLoader.load(url);
        } catch(IOException ex){
        }
        NavigationManager.getInstance(stage).showScene(root);
    }
    
}
