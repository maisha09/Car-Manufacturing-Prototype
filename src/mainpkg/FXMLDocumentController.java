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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField idField;
    @FXML
    private TextField passField;
    @FXML
    private ComboBox type;
    @FXML
    private Button loginButton;
    @FXML
    private Label incorrect;
 
   
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          type.getItems().addAll("Finance Officer","Director General","Customer","Guest","HOD");
          type.setValue("User Type");  
    }    

    @FXML
    private void loginOnAction(ActionEvent event) throws IOException {
         if(idField.getText().equals("123")  && passField.getText().equals("123") &&  
                type.getValue().equals( "Finance Officer")){
            
          gotoFinanceOfficerHomeScene(event);
        }
        else if(idField.getText().equals("123")  && passField.getText().equals("123") &&  
                type.getValue().equals( "Director General")){
            
          gotoDirectorGeneralHomeScene(event);
        }
        else if(idField.getText().equals("123")  && passField.getText().equals("123") &&  
                type.getValue().equals( "Customer")){
            
          gotoCustomerHomeScene(event);
        }
        else if(idField.getText().equals("123")  && passField.getText().equals("123") &&  
                type.getValue().equals( "Guest")){
            
          gotoGuestHomeScene(event);
        } 
        else if(idField.getText().equals("123")  && passField.getText().equals("123") &&  
                type.getValue().equals( "HOD")){
            
          gotoHODHomeScene(event);
        }
        else{
            
            incorrect.setText("Wrong Credentials.Please try Again!");
        }
        idField.setText(null); 
        passField.setText(null); 
        type.setValue("User Type");
        idField.clear();
        passField.clear();
    }

    
    @FXML
    private void idfieldOnActn(ActionEvent event) {
        idField.setText(null);
    }

    @FXML
    private void passfieldOnActn(ActionEvent event) {
        passField.setText(null);
        
    }

    private void gotoFinanceOfficerHomeScene(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    private void gotoDirectorGeneralHomeScene(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DirectorGeneralHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    private void gotoCustomerHomeScene(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerMainPage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    private void gotoGuestHomeScene(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("GuestmHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    private void gotoHODHomeScene(ActionEvent event) throws IOException {
       Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    
 
    
    
}
