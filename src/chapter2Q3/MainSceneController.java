/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import java.util.Scanner;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author AHMAD
 */
public class MainSceneController implements Initializable {

    @FXML
    private MenuItem openButton;
    @FXML
    private MenuItem closeButton;
    @FXML
    private MenuItem exitButton;
    @FXML
    private MenuItem fontButton;
    @FXML
    private MenuItem colorButton;
    
    private  int font = 12;
    private  String color = "Black";
    @FXML
    private TextArea mainTextArea;
    
            /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //mainTextArea.setStyle("-fx-font-size:"+font+"");
        //mainTextArea.setStyle("-fx-text-fill:"+color+"");
        mainTextArea.setWrapText(true);
    }    

    @FXML
    private void openButtonHandle(ActionEvent event) throws FileNotFoundException {
        Stage stage = new Stage();
        FileChooser file = new FileChooser();
        File selectedFile = file.showOpenDialog(stage);
        Scanner scanner = new Scanner(selectedFile);
        mainTextArea.appendText(scanner.nextLine());
        
        mainTextArea.setEditable(true);
        
                
    }

    @FXML
    private void closeButtonHandle(ActionEvent event) {
        mainTextArea.setEditable(false);
        mainTextArea.clear();
    }

    @FXML
    private void exitButtonHandle(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void fontButtonHandle(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("12");
        dialog.setTitle("font Input Dialog");
        dialog.setHeaderText("font Input Dialog");
        dialog.setContentText("Please input your font size:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
        font = Integer.parseInt(result.get()); 
        }
        mainTextArea.setStyle("-fx-font-size:"+result.get()+"");
        
    }

    @FXML
    private void colorButtonHandle(ActionEvent event) {
        List<String> choices = new ArrayList<>();
        choices.add("Red");
        choices.add("Green");
        choices.add("Blue");
        choices.add("Black");

    ChoiceDialog<String> dialog = new ChoiceDialog<>("Black", choices);
    
    dialog.setTitle("Color Dialog");
    dialog.setHeaderText("Color Dialog");
    dialog.setContentText("Choose your Color:");

    // Traditional way to get the response value.
    Optional<String> result = dialog.showAndWait();
    if (result.isPresent()){
        color = result.get();
    }
    mainTextArea.setStyle("-fx-text-fill:"+result.get()+"");
    
    }
    
}
