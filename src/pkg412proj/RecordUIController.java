/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author dylanwallach
 */
public class RecordUIController implements Initializable {

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
        
    }    

    @FXML
    private void showNavUI(ActionEvent event) {
    }
    
}
