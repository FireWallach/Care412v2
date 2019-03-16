/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;


// import statements for outside classes/methods/libraries used in this class
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginUIController implements Initializable {
    
    @FXML
    private PasswordField pf; // password field
    @FXML
    private TextField uf; //unsername field
    private UserList ul; //List of users
    private Stage stage; // FXML required
    @FXML
    private Button SubmitButton; //Submit button
    @FXML
    private Label errorLabel; //Error Label
    private Parent root; //FXML Required
    private Scene scene; //FXML Required
    
    
    // Returns true if the user loggin in is in the userlist
    private Boolean checkUsers(UserList ul){
        for(int i = 0; i < ul.getUserList().size(); i++){
            if((uf.getText().equals(ul.get(i).getUsername()))&&(pf.getText().equals(ul.get(i).getPassword()))){
                return true;
            }
        }
        return false;
    }
    
    /*
        Very simple authentication method    
    */
    @FXML
    private void authenticate(ActionEvent event) throws IOException{
        URL url = new File("src/pkg412proj/NavUI.fxml").toURI().toURL();
        
        ul = new UserList();
        ul.add(new User("admin", "password", 0, "", "", 0));
        ul.add(new User("", "", 0 , "", "", 0));
        if(checkUsers(ul)){
            stage = (Stage) pf.getScene().getWindow();
            try{
                    root = FXMLLoader.load(url);
            } catch(IOException ex){
                    System.out.println("Error fetching NavUI.fxml");
            }
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                stage.setResizable(false);
            
        }
        else{
            errorLabel.setText("Incorrect Credentials, please try again.");
        }
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
