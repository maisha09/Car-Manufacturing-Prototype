/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.Contact;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ContactFxmlController implements Initializable {

    @FXML
    private TextField emailid;
    @FXML
    private TextField nameid;
    @FXML
    private TextField phoneid;
    @FXML
    private TextField messageid;
    @FXML
    private Button submitid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonAction(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("Contact.bin");
            
            if(f.exists())
            {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else
            {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            Contact c  = new Contact(emailid.getText(),nameid.getText(),
                    phoneid.getText(),messageid.getText()
                         );
            
            oos.writeObject(c);
           
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            try {
                oos.close();
            } catch (IOException ex) {
                //Logger.getLogger(FileHandlingSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        submitid.setText("Sent Suceessful");
        emailid.setText(null); 
        nameid.setText(null); 
        phoneid.setText(null);
        messageid.setText(null);
    }

    @FXML
    private void prevSceneButtonAction(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("GuestmHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
