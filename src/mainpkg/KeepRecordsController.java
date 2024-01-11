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
public class KeepRecordsController implements Initializable {

    @FXML
    private TextField branchNameTextField;
    @FXML
    private TextField amountInTakaTextField;
    @FXML
    private Button saveRecordToTextFile;
    @FXML
    private Button prevScene;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveRecordToTextFileOnClick(ActionEvent event) throws IOException {
           File f =  null;
        FileWriter  fw = null;
        try
        {
            f = new File("Records.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true);
        }
        else
        {
            fw = new FileWriter(f);
        }
        String str = branchNameTextField.getText()+","+amountInTakaTextField.getText()+"\n";
        
        fw.write(str); 
        
        saveRecordToTextFile.setText("Saved");
        branchNameTextField.setText("");
        amountInTakaTextField.setText("");
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
    private void prevSceneOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
    }
  
