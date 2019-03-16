/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;



import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    /*
    * Starts the application
    */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginUI.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Health412");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args Arguments passed in for the command line
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
