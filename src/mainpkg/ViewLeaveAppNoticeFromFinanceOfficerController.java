/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.stage.Stage;
import model.Application;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewLeaveAppNoticeFromFinanceOfficerController implements Initializable {

    @FXML
    private TextArea applicationTextArea;
    @FXML
    private Button showApplicationButton;
    @FXML
    private Button goBackBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showApplicationButtonOnClickAction(ActionEvent event) throws IOException{
         File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        {
            f = new File("LeaveApplication.bin");
            
            if(!f.exists())
            {
                applicationTextArea.setText("LeaveApplication.bin file doesn't exist!");
            }
            else
            {
//               
                try {
                 fis = new FileInputStream(f);
                 ois = new ObjectInputStream(fis);
                
                 Application app;
                 
                applicationTextArea.setText("");
                
                 while(true) {
                  app = (Application) ois.readObject();
                  applicationTextArea.appendText(app.toString()+"\n");
                                      }
                        }             
                catch (IOException e) {
                e.printStackTrace();
                            } 
                catch (ClassNotFoundException e) {
                e.printStackTrace();
            } 
      }
        }
    }

    @FXML
    private void goBackBtnOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("DirectorGeneralHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    

}