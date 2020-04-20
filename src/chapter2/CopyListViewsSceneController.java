/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * FXML Controller class
 *
 * @author AHMAD
 */
public class CopyListViewsSceneController implements Initializable {
   // public void CopyListViewsSceneController(){
       // mainListView.getItems().addAll("Ahmad","Mohammed","Ali","Hossam","Zaid","Noor","Lena","Ramy");
   // }
    @FXML
    private ListView<String> mainListView;
    @FXML
    private ListView<String> outputListView ;
    
    @FXML
    private Button copyButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mainListView.getItems().addAll("Ahmad","Mohammed","Ali","Hossam","Zaid","Noor","Lena","Ramy");
        mainListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        // TODO
    }    

    @FXML
    private void copyButtonHandle(ActionEvent event) {
        outputListView.getItems().addAll(mainListView.getSelectionModel().getSelectedItems());
    }
    
}
