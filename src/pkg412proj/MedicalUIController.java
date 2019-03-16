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
import java.util.ArrayList;
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
 * @author Dylan
 */
public class MedicalUIController implements Initializable {
    
    //The patients that a user has authorization to. If a patient is logged in, this will be one person.
    private ArrayList<User> patients; //Holds the patients
    private ArrayList<MedicalReport> reports; //Holds the reports
    private ObservableList<MedicalReport> observableReportList;
    private Stage stage;
    private Parent root;
    @FXML
    private Button backButton; //Refers to the back button in the view
    @FXML
    private TableView<MedicalReport> viewTable; //Refers to the table in the view
    @FXML
    private TableColumn<MedicalReport, String> userColumn;
    @FXML
    private TableColumn<MedicalReport, String> testColumn;
    @FXML
    private TableColumn<MedicalReport, String> resultColumn;

    /**
     * Initializes the controller class.
     * Populates tables with mock data.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(observableReportList == null){
            observableReportList = FXCollections.observableArrayList();
        }
        observableReportList.clear();
        System.out.println(MedicalReportList.get(0).getUser());
        for(int i = 0; i < MedicalReportList.size(); i++){
            this.observableReportList.add(MedicalReportList.get(i));
        }        
        userColumn.setCellValueFactory(new PropertyValueFactory<MedicalReport,String>("user"));
        testColumn.setCellValueFactory(new PropertyValueFactory<MedicalReport,String>("testType"));
        resultColumn.setCellValueFactory(new PropertyValueFactory<MedicalReport,String>("result"));
        viewTable.setItems(observableReportList);
    }    
    
    /*
    * Enables manual editing of Medical Record, if you have credentials
    */
   
    public void enableEditing(){
        //TODO: Write logic to edit medical information.
    }
    
    public void goHome(){
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
