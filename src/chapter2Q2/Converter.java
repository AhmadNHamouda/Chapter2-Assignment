/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Q2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author AHMAD
 */
public class Converter extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception  {
       
        Parent parent = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        Scene scene = new Scene(parent);
            
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tempreture Converter");
        primaryStage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
}
