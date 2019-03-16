/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Holds some FXML required code to help facilitate the smooth transition between pages
 * @author Dylan
 */
public class NavigationManager {

    private static Parent root;
    private static Scene scene;
    private static Stage stage;
    
    private static NavigationManager instance = null;

    /*
    * Basic singleton constructor
    */
    private NavigationManager (Stage stage) {
        this.stage = stage;
    }

    /*
    * Basic Singleton return function
    */
    public static NavigationManager getInstance(Stage stage) {
        if (instance == null) {
            instance = new NavigationManager(stage);
        }
        return instance;

    }

    /*
    * Uses Current loaded Scene to change displays
    */
    public static void showScene(Parent root) {
        
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
