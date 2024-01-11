/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 * FXML Controller class
 *
 * @author User
 */
public class CreateJobCircularController implements Initializable {

    @FXML
    private Button saveBtn;
    @FXML
    private Button goBack;
    @FXML
    private TextField vacantPostid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveBtnOnClick(ActionEvent event) throws IOException {
            File f =  null;
        FileWriter  fw = null;
        try
        {
            f = new File("JobCircular.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true);
        }
        else
        {
            fw = new FileWriter(f);
        }
        String str = vacantPostid.getText()+"\n";
        
        fw.write(str); 
        
        saveBtn.setText("Saved");
        vacantPostid.setText("");
        fw.close();
    
    }
        catch(Exception v)
        {
            System.out.println("Exception : "+v);
            
        }
        finally
        {
            fw.close();
        }
    }
    @FXML
    private void goBackOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DirectorGeneralHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
