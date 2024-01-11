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
import model.Goals;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewNoticeController implements Initializable {

    @FXML
    private TextArea noticeDgTextArea;
    @FXML
    private Button goBack;
    @FXML
    private Button showNoticebutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackOnClickAction(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void showNoticebuttonOnClick(ActionEvent event) {
         File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("SetMonthlyGoals.bin");
            
            if(!f.exists())
            {
                noticeDgTextArea.setText("SetMonthlyGoals.bin file doesn't exist!");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Goals g;
                
                while(true)
                {
                    g = (Goals)ois.readObject();
                    noticeDgTextArea.appendText(g.toString()+"\n"+"\n");
                }
                
            }
            
        }
        catch(Exception e)
        {
            System.out.println("exception:"+e); 
        }
        finally
        {
            try{
                ois.close();
            }
            catch(Exception e){
                    System.out.println("exception:"+e);
            }
        }    
        showNoticebutton.setText("Shown");
    }

    }
    

