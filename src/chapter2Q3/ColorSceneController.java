/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Q3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author AHMAD
 */
public class ColorSceneController implements Initializable {

    @FXML
    private ComboBox<?> comboBox;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void comboBoxHandle(ActionEvent event) {
    }

    @FXML
    private void okButtonHandle(ActionEvent event) {
    }

    @FXML
    private void cancelButtonHandle(ActionEvent event) {
    }
    
}
