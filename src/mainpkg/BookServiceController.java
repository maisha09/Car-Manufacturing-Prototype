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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BookServiceController implements Initializable {

    @FXML
    private TextField firstnameid;
    @FXML
    private TextField lastnameid;
    @FXML
    private TextField emailid;
    @FXML
    private TextField vrhicleRegid;
    @FXML
    private TextField miltageid;
    @FXML
    private TextField unitid;
    @FXML
    private TextField mobieid;
    @FXML
    private TextArea messageTextArea;
    @FXML
    private Button submitButtonid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void prevSceneActionButton(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("GuestmHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void submitSceneActionButton(ActionEvent event) throws IOException {
           File f =  null;
        FileWriter  fw = null;
        try
        {
            f = new File("BookService.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true);
        }
        else
        {
            fw = new FileWriter(f);
        }
        String str =       firstnameid.getText()+","+lastnameid.getText()+","
                +mobieid.getText()+","+emailid.getText()+"," 
                +vrhicleRegid.getText()+"," +unitid.getText()+"," 
                +messageTextArea.getText()+","+miltageid.getText()+"\n";
       
        fw.write(str); 
        submitButtonid.setText("Added");
        firstnameid.setText("");
        lastnameid.setText("");
        mobieid.setText("");
        emailid.setText(""); 
        vrhicleRegid.setText("");
        unitid.setText("");
        messageTextArea.setText("");
        miltageid.setText("");
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
    }
    
