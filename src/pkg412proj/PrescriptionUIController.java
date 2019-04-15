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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author prens
 */
public class PrescriptionUIController implements Initializable {
    
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<Prescription, String> nameColumn; 
    @FXML
    private TableColumn<Prescription, String> dosageColumn; 
    @FXML
    private TableColumn<Prescription, String> frequencyColumn; 
    private User user; //The logged in user
    private Stage stage;
    private Parent root;
    //private ArrayList<Payment> payments = PaymentList.getPaymentListCntl().getPaymentList(); //Holds the payments
    private ObservableList<Prescription> observablePrescriptionList;
    @FXML
    private Button backButton; //Refers to the back button in the view
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (observablePrescriptionList == null) {
            observablePrescriptionList = FXCollections.observableArrayList();
        }
        observablePrescriptionList.clear();

        for (int i = 0; i < PrescriptionList.getPrescriptionListCntl().getPrescriptionList().size(); i++) {
            this.observablePrescriptionList.add(PrescriptionList.getPrescriptionListCntl().getPrescriptionList().get(i));
        }
        nameColumn.setCellValueFactory(new PropertyValueFactory<Prescription, String>("prescriptionName"));
        dosageColumn.setCellValueFactory(new PropertyValueFactory<Prescription, String>("prescriptionDosage"));
        frequencyColumn.setCellValueFactory(new PropertyValueFactory<Prescription, String>("prescriptionFrequency"));
        tableView.setItems(observablePrescriptionList);
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
    

