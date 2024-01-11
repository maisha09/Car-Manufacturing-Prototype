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
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Cell;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.BalanceSheets;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BalanceSheetsController implements Initializable {

    @FXML
    private Button goBackBtn;
    @FXML
    private TextField branchTextField;
    @FXML
    private TextField divisionTextField;
    @FXML
    private TextField totalSalesTextField;
    @FXML
    private Button saveBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void goBackBtnOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void saveBtnOnClick(ActionEvent event) {
         File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("Balance.bin");
            
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
            
            BalanceSheets b  = new BalanceSheets(branchTextField.getText(),divisionTextField.getText(),
                    totalSalesTextField.getText()
                         );
            
            oos.writeObject(b);
           
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
        saveBtn.setText("Saved");
        branchTextField.setText(null); 
        divisionTextField.setText(null); 
        totalSalesTextField.setText(null);
    }

        
}
