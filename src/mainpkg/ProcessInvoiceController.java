/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ProcessInvoiceController implements Initializable {

    @FXML
    private ComboBox type;
    @FXML
    private TextField carTextArea;
    @FXML
    private TextField partsTextArea;
    @FXML
    private RadioButton dhanmondiBtn;
    @FXML
    private ToggleGroup branch;
    @FXML
    private RadioButton bashundharaBtn;
    @FXML
    private Label myLabel;
    @FXML
    private Button saveBtn;
    @FXML
    private Button goBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
          type.getItems().addAll("Toyota 1000","Toyota Hi-CT","Toyota FXS");
          type.setValue("Select Car"); 
        // TODO
    }    

    @FXML
    private void dhanmondiBtnOnClick(ActionEvent event) {
         if(dhanmondiBtn.isSelected()) {
   myLabel.setText(dhanmondiBtn.getText());
        
    }
    }
    @FXML
    private void bashundharaBtnOnClick(ActionEvent event) {
           if(bashundharaBtn.isSelected()) {
   myLabel.setText(bashundharaBtn.getText());
        
    }
    
}

    @FXML
    private void saveBtnOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackOnClick(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}