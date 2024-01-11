/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SetUserInfoToGetUpdateController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField emailAddressTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonOnAction(ActionEvent event) {
           Alert a = new Alert(Alert.AlertType.INFORMATION);
        
        String name = nameTextField.getText();
        String phoneNumber= phoneNumberTextField.getText();
        String emailAddress= emailAddressTextField.getText();
        
        File f = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try 
        {
            f = new File("userInfoForToyotaUpdate.bin");
            if(f.exists())
            {
                fos = new FileOutputStream(f,true);
            }
            else
            {
                fos = new FileOutputStream(f);
            }
            
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(fos);
            
           
            
            dos.writeUTF(name);
            dos.writeUTF(emailAddress);
            dos.writeUTF(phoneNumber);
            
            
            a.setTitle("User Info");
            a.setHeaderText("Set successfull");
            a.setContentText("User info has been set successfully");
            a.showAndWait();
            
            Parent homeSceneParent = FXMLLoader.load(getClass().getResource("homeScene.fxml"));
            Scene scene2 = new Scene(homeSceneParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();

        } 
        catch (IOException e) 
        {
            a.setTitle("User Info");
            a.setHeaderText("Set failure");
            a.setContentText("User info setup Failed!");
            a.showAndWait();  
        } 
        finally 
        {
            try 
            {
                if(dos != null) 
                {
                    dos.close();
                }
              
            } 
            catch (IOException ex) 
            {
                System.out.println(ex);
            }
        }
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("GuestmHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
