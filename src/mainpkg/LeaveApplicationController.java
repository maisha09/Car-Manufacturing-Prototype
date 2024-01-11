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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.Application;
import model.Goals;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LeaveApplicationController implements Initializable {

    @FXML
    private TextArea applicationTextArea;
    @FXML
    private Button sendToDirectorGeneral;
    @FXML
    private Button prevPage;
    private DatePicker dateDatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendToDirectorGeneralOnClickAction(ActionEvent event)throws IOException {
        Application app = new Application();
        app.setApp(applicationTextArea.getText());
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("LeaveApplication.bin");
            
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
              oos.writeObject(app);  
        }
        catch(Exception e)
        {
            
        }
            finally
        {
             oos.close();
            
        }  
        sendToDirectorGeneral.setText("Sent Suceessful");
        applicationTextArea.setText(null); 
        
}

    @FXML
    private void prevPageOnClickAction(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }
    
    
}
