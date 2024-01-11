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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.VehicleDetails;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DetailsVehicleController implements Initializable {

    @FXML
    private TextField carNameTextField;
    @FXML
    private TextField designationTextField;
    @FXML
    private TextField colourTextField;
    @FXML
    private TableView<VehicleDetails> tableView;
    @FXML
    private TableColumn<VehicleDetails,String> carNameColumn;
    @FXML
    private TableColumn<VehicleDetails,String> carModelColumn;
    @FXML
    private TableColumn<VehicleDetails,String> designationColumn;
    @FXML
    private TableColumn<VehicleDetails,LocalDate> dateoOfaddingcolumn;
    @FXML
    private TableColumn<VehicleDetails,String> colourColumn;
    @FXML
    private TableColumn<VehicleDetails,String> contactNumberColumn;
    @FXML
    private TextField carModelTextField;
    @FXML
    private TextField contactNumberTextField;
    @FXML
    private DatePicker addDatePicker;
    ArrayList <VehicleDetails> vehicledetailslist= new ArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
        // TODO
        //set up the columns in the table
        carNameColumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, String>("carName"));
        carModelColumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, String>("carModel"));
        designationColumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, String>("designation"));
        dateoOfaddingcolumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, LocalDate>("dateofadding"));
        contactNumberColumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, String>("contactnumber"));
        colourColumn.setCellValueFactory(new PropertyValueFactory<VehicleDetails, String>("colour")); 
  
       
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("VehicleDetails.bin");
            
            if(!f.exists())
            {
                System.out.println("file dosen't exist");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                VehicleDetails v;
                while(true)
                {
                   v= (VehicleDetails)ois.readObject();
                   vehicledetailslist.add(v);
                }
            }
        }
        catch(Exception v)
        {
            System.out.println("exception:"+v);
        }
        finally
        {
            try{
                ois.close();
                ObservableList<VehicleDetails> people = FXCollections.observableArrayList();
            
                for(VehicleDetails v: vehicledetailslist){
                    people.add(v);
                }
                tableView.setItems(people);
            }
            catch(Exception v){
                    System.out.println("exception:"+v);
                    
            }
            
        }
       
        // TODO
    }    

    @FXML
    private void carnameOnMouseClick(MouseEvent event) {
         carNameTextField.setText(null);
    }

    @FXML
    private void designationOnMouseClick(MouseEvent event) {
               designationTextField.setText(null);
    }

    @FXML
    private void colourOnMouseClick(MouseEvent event) {
           colourTextField.setText(null);
    }

    @FXML
    private void deletevehicleOnClickactn(ActionEvent event) {
          ObservableList<VehicleDetails> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        for(VehicleDetails v: selectedRows){allPeople.remove(v);}
    }

    @FXML
    private void addvehicleOnClickactn(ActionEvent event) {
         VehicleDetails newVehicleDetails = new VehicleDetails( 
                                       carNameTextField.getText(),
                                      carModelTextField.getText(), 
                                       designationTextField.getText(), 
                                       addDatePicker.getValue(),
                                       colourTextField.getText(), 
                                       contactNumberTextField.getText()
                                        );
            tableView.getItems().add(newVehicleDetails); 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("VehicleDetails.bin");
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

            oos.writeObject(newVehicleDetails);
        }
        catch(Exception v)
        {
            
        }
        finally
        {
            try {
                oos.close();
            } catch (Exception v) {
              
            }
        }
    }

    @FXML
    private void carModelOnMouseClick(MouseEvent event) {
            carModelTextField.setText(null);
    }

    @FXML
    private void contactNumOnMouseClick(MouseEvent event) {
        contactNumberTextField.setText(null);
    }

    @FXML
    private void prevSceneclickOnAction(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerMainPage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
          
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); 
      
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void dateMouseclick(MouseEvent event) {
         addDatePicker.setValue(null);
    }
    
}
