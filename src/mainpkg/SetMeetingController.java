/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.Meeting;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SetMeetingController implements Initializable {

    @FXML
    private TextField monthTextField;
    @FXML
    private Button setMeeting;
    @FXML
    private TableView<Meeting> tableView;
    @FXML
    private TableColumn<Meeting, String> monthColumn;
    @FXML
    private TableColumn<Meeting, LocalDate> dateoOfJoiningcolumn;
    @FXML
    private DatePicker dojDatePicker;
    ArrayList <Meeting> meetinglist = new ArrayList();
    @FXML
    private Button goback;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         monthColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("month"));
        dateoOfJoiningcolumn.setCellValueFactory(new PropertyValueFactory<Meeting, LocalDate>("dateofjoining"));
         File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("Meeting.bin");
            
            if(!f.exists())
            {
                System.out.println("file dosen't exist");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                Meeting m;
                while(true)
                {
                   m= (Meeting)ois.readObject();
                   meetinglist.add(m);
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
                ObservableList<Meeting> people = FXCollections.observableArrayList();
            
                for(Meeting m: meetinglist){
                    people.add(m);
                }
                tableView.setItems(people);
            }
            catch(Exception e){
                    System.out.println("exception:"+e);
                    
            }
    }    
    }
    @FXML
    private void setMeetingOnClick(ActionEvent event) {
          Meeting newMeeting = new Meeting( 
                                       monthTextField.getText(),
                                       dojDatePicker.getValue()
                   );
                  
                  tableView.getItems().add(newMeeting); 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("Meeting.bin");
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

            oos.writeObject(newMeeting);
        }
        catch(Exception e)
        {
            
        }
        finally
        {
            try {
                oos.close();
            } catch (Exception e) {
              
            }
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
    
