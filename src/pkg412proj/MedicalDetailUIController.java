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
import javafx.scene.control.TextField;
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
    private Button backButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField testField;
    @FXML
    private TextField resultField;
    @FXML
    private TextField doctorField;
    @FXML
    private TextField roomField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameField.setText(MedicalReportList.get(MedicalReportList.getSelected()).getUser());
        testField.setText(MedicalReportList.get(MedicalReportList.getSelected()).getTestType());
        resultField.setText(MedicalReportList.get(MedicalReportList.getSelected()).getResult());
        doctorField.setText(MedicalReportList.get(MedicalReportList.getSelected()).getDoctor()); 
        roomField.setText(MedicalReportList.get(MedicalReportList.getSelected()).getRoom());
    }    

    @FXML
    private void goBack(ActionEvent event) {
        
        saveFields();
        
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

    private void saveFields() {
        MedicalReport mr = MedicalReportList.get(MedicalReportList.getSelected());
        mr.setUser(nameField.getText());
        mr.setTestType(testField.getText());
        mr.setResult(resultField.getText());
        mr.setDoctor(doctorField.getText());
        mr.setRoom(roomField.getText());
    }
    
}
