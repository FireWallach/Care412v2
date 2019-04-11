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
import javafx.event.ActionEvent;
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
public class PersonalUIController implements Initializable {
    
    
    private User user; //The logged in user
    private Stage stage;
    private Parent root;
    private ArrayList<Payment> payments; //Holds the reports
    private ObservableList<Payment> observablePaymentList;
    @FXML
    private Button backButton; //Refers to the back button in the view
    @FXML
    private Button payButton; //Refers to the "Pay" button in the view
    @FXML
    private Button payAllButton; //Refers to the "Pay All" button in the view
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<Payment, String> paymentColumn;
    @FXML
    private TableColumn<Payment, String> costColumn;
    private PaymentList paymentList = PaymentList.getPaymentListCntl();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        payments = paymentList.getPaymentList();
        if (observablePaymentList == null) {
            observablePaymentList = FXCollections.observableArrayList();
        }
        observablePaymentList.clear();

        for (int i = 0; i < payments.size(); i++) {
            this.observablePaymentList.add(payments.get(i));
        }
        paymentColumn.setCellValueFactory(new PropertyValueFactory<Payment, String>("paymentType"));
        costColumn.setCellValueFactory(new PropertyValueFactory<Payment, String>("paymentValue"));
        tableView.setItems(observablePaymentList);
    }    
    
    /*
    * Enables manual editing of Personal Record
    */
    
    public void paymentButtonAction(ActionEvent ae){
        try{
            int paymentIndex = tableView.getSelectionModel().getSelectedIndex();
            if(paymentIndex != -1){
                observablePaymentList.remove(paymentIndex);
                payments.remove(paymentIndex);
                paymentList.getPaymentList().remove(paymentIndex);
            }
        } catch(Error e){
            
        }
    }
   
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
