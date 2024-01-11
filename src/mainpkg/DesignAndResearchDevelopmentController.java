/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import model.Worker;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DesignAndResearchDevelopmentController implements Initializable {

    @FXML
    private TableView<Worker> tableView;
    @FXML
    private TableColumn<Worker, String> lastNameColumn;
    @FXML
    private TableColumn<Worker, String> firstNameColumn;
    @FXML
    private TableColumn<Worker, LocalDate> birthdayColumn;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private DatePicker birthdayDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          //set up the columns in the table
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<>("birthday"));
       
        
        //Allow first and last name to be edittable
        tableView.setEditable(true);
        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        //allow the table to select multiple rows at once
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
       
    }    

    @FXML
    private void changeLasttNameCellEvent(TableColumn.CellEditEvent edittedCell) {
         Worker personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setFirstName(edittedCell.getNewValue().toString());
    }

    @FXML
    private void changeFirstNameCellEvent(TableColumn.CellEditEvent edittedCell) {
        Worker personSelected = tableView.getSelectionModel().getSelectedItem();
        personSelected.setLastName(edittedCell.getNewValue().toString());
    }

    @FXML
    private void addNewPersonButtonOnClick(ActionEvent event) {
         Worker newEmployee = new Worker(firstNameTextField.getText(),
                                       lastNameTextField.getText(),
                                       birthdayDatePicker.getValue()
                                    );
        tableView.getItems().add(0,newEmployee);
    }

    @FXML
    private void deletePersonsButtonOnClick(ActionEvent event) {
         ObservableList<Worker> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        
        selectedRows.forEach((e) -> {
            allPeople.remove(e);
        });
    }

    @FXML
    private void DesignAndResearchDevelopmentBack(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Dashboard"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }
    
}
