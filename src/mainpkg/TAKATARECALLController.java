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
import model.TakataRecall;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TAKATARECALLController implements Initializable {

    @FXML
    private TextField vinid;
    @FXML
    private TextField emailid;
    @FXML
    private TextField phoneid;
    @FXML
    private Button checkvehicleid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkVehicleAction(ActionEvent event) {
          File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("TAKATARECALL.bin");
            
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
            
            TakataRecall t  = new TakataRecall(vinid.getText(),emailid.getText(),
                    phoneid.getText() );
            
            oos.writeObject(t);
           
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
        checkvehicleid.setText("Sent Suceessful");
        vinid.setText(null);
        emailid.setText(null);  
        phoneid.setText(null);
        
    }

    @FXML
    private void prevSceneButtonAction(ActionEvent event) throws IOException {
             Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerMainPage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
