/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Dylan
 */
public class PersonalUIController implements Initializable {
    
    
    private User user; //The logged in user

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
    
}
