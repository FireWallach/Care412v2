/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Dylan
 */
public class MedicalUIController implements Initializable {
    
    //The patients that a user has authorization to. If a patient is logged in, this will be one person.
    private ArrayList<User> patients; //Holds the patients
    private ArrayList<MedicalReport> reports; //Holds the reports

    /**
     * Initializes the controller class.
     * Populates tables with mock data.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO generate mock users to populate list.
        // TODO generate mock medical reports to populate reports list.
    }    
    
    /*
    * Enables manual editing of Medical Record, if you have credentials
    */
   
    public void enableEditing(){
        //TODO: Write logic to edit medical information.
    }
    
    public void loadData(User user){
        return;
    }
    
}
