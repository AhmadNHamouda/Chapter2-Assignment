/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Q2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author AHMAD
 */
public class MainSceneController implements Initializable {

    @FXML
    private TextField inputTextField;
    @FXML
    private RadioButton fahRadioButton;
    @FXML
    private RadioButton kelvinRadioButton;
    @FXML
    private Label outputLabel;
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ToggleGroup myToggleGroup = new ToggleGroup();
        kelvinRadioButton.setToggleGroup(myToggleGroup);
        fahRadioButton.setToggleGroup(myToggleGroup);
        // TODO
    }    

    @FXML
    private void fahRadioButtonHandle(ActionEvent event) {
        
        double c = Double.parseDouble(inputTextField.getText());
        double fah = (c * (9/5)) + 32;
        String result = "New Tempreture in Faherenhite is : " + String.valueOf(fah);
        outputLabel.setText(result);
    }

    @FXML
    private void kelvinRadioButtonHandle(ActionEvent event) {
        double c = Double.parseDouble(inputTextField.getText());
        double kel = c + 273.15;
        String result = "New Tempreture in Kelvin is : " + String.valueOf(kel);
        outputLabel.setText(result);
    }
    
}
