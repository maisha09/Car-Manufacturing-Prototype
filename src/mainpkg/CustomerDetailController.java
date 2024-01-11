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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerDetailController implements Initializable {

    @FXML
    private TextField customerid;
    @FXML
    private TextField firstnameid;
    @FXML
    private TextField surenameid;
    @FXML
    private TextField address;
    @FXML
    private TextField town;
    @FXML
    private TextField downpayment;
    @FXML
    private TextField deposit;
    @FXML
    private ComboBox<?> carComboBox;
    @FXML
    private CheckBox standardCheckBox;
    @FXML
    private CheckBox modifiedCheckBox;
    @FXML
    private CheckBox leatherCheckBox;
    @FXML
    private CheckBox stereoCheckBox;
    @FXML
    private Button addbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void carComboBoxAction(ActionEvent event) {
    }

    @FXML
    private void addAllInfoToTextActionButton(ActionEvent event) throws IOException {
        File f =  null;
        FileWriter  fw = null;
        try
        {
            f = new File("CustomerDetails.txt");
        
        if(f.exists())
        {
            fw = new FileWriter(f,true);
        }
        else
        {
            fw = new FileWriter(f);
        }
        String str = customerid.getText()+","+firstnameid.getText()+","
                       +surenameid.getText()+","+address.getText()+","
                +town.getText()+"," +downpayment.getText()+"," 
                                +deposit.getText()+"\n";
       
        fw.write(str); 
        addbutton.setText("Added");
        customerid.setText("");
        firstnameid.setText("");
        surenameid.setText("");
        address.setText(""); 
        town.setText("");
        downpayment.setText("");
        deposit.setText("");
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
    private void prevSceneActionButton(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerMainPage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
