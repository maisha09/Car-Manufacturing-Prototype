/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LiveSession;

/**
 * FXML Controller class
 *
 * @author User
 */
public class JoinLiveSessionController implements Initializable {

    @FXML
    private TextField liveDateTextField;
    @FXML
    private TextField liveTimeTextField;
    @FXML
    private TextField liveLocationTextField;
    @FXML
    private TextField liveTypeTextField;
    @FXML
    private TextField liveLinkTextField;
    @FXML
    private TextField setByTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          LiveSession l = new LiveSession();
        l.participateLive(liveDateTextField, liveTypeTextField, liveTimeTextField, liveLocationTextField, liveLinkTextField, setByTextField);
       
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("GuestmHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
