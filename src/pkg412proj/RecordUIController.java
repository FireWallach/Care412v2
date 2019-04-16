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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dylanwallach
 */
public class RecordUIController implements Initializable {

    private Stage stage;
    private Parent root;
    
    @FXML
    private Button backButton;
    @FXML
    private Text fNameLabel;
    @FXML
    private Text lNameLabel;
    @FXML
    private Text diseasesLabel;
    @FXML
    private Text doctorsLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fNameLabel.setText(MedicalRecord.getInstance().getfName());
        lNameLabel.setText(MedicalRecord.getInstance().getlName());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < MedicalRecord.getInstance().getNoDiseases(); i++){
            sb.append(MedicalRecord.getInstance().getDiseases()[i]);
            if(i != MedicalRecord.getInstance().getNoDiseases() - 1)
                sb.append(", \n");
        }
        diseasesLabel.setText(sb.toString());
        sb.setLength(0);
        for(int i = 0; i < MedicalRecord.getInstance().getNoDoctors(); i++){
            sb.append(MedicalRecord.getInstance().getDoctors()[i]);
            if(i != MedicalRecord.getInstance().getNoDoctors() - 1)
                sb.append(", \n");
        }
        doctorsLabel.setText(sb.toString());
    }    

    @FXML
    private void showNavUI(ActionEvent event) {
        URL url = null;
        try {
            url = new File("src/pkg412proj/NavUI.fxml").toURI().toURL();
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
