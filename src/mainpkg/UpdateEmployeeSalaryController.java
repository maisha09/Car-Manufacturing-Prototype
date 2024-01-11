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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.Employee;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdateEmployeeSalaryController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField branchTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private TextField divisionTextField;
    @FXML
    private TextField monthTextField;
   
    @FXML
    private TableColumn<Employee, String> employeeNameColumn;
    @FXML
    private TableColumn<Employee, String> branchColumn;
    @FXML
    private TableColumn<Employee, String> divisionColumn;
    @FXML
    private TableColumn<Employee,String> salaryColumn;
    @FXML
    private TableColumn<Employee, String> monthColumn;
    @FXML
    private TableView<Employee> tableView;
    
    ArrayList <Employee> employeelist= new ArrayList();
    @FXML
    private Button goBackBtn;
    @FXML
    private DatePicker dojDatePicker;
    @FXML
    private TableColumn<Employee, LocalDate> dateoOfJoiningcolumn;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        employeeNameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Name"));
        branchColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Branch"));
        divisionColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Division"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Salary"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Month"));
        dateoOfJoiningcolumn.setCellValueFactory(new PropertyValueFactory<Employee, LocalDate>("Date of Payment"));
     File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("SalaryDetails.bin");
            
            if(!f.exists())
            {
                System.out.println("file dosen't exist");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                Employee e;
                while(true)
                {
                   e= (Employee)ois.readObject();
                   employeelist.add(e);
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
                ObservableList<Employee> people = FXCollections.observableArrayList();
            
                for(Employee e: employeelist){
                    people.add(e);
                }
                tableView.setItems(people);
            }
            catch(Exception e){
                    System.out.println("exception:"+e);
                    
            }
            
        }
    }   
     @FXML
    private void deleteRecordOnClick(ActionEvent event) {
        ObservableList<Employee> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        for(Employee e: selectedRows){allPeople.remove(e);}
    }

    @FXML
    private void addRecordOnClick(ActionEvent event) {
         Employee newEmployee = new Employee( 
                                       nameTextField.getText(),
                                       branchTextField.getText(), 
                                       divisionTextField.getText(),
                                       salaryTextField.getText(),
                                       monthTextField.getText(),
                                       dojDatePicker.getValue()
                                       );
            tableView.getItems().add(newEmployee); 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("SalaryDetails.bin");
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

            oos.writeObject(newEmployee);
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
    private void nameOnMouseClick(MouseEvent event) {
        nameTextField.setText(null);
        
    }

    @FXML
    private void branchOnMouseClick(MouseEvent event) {
        branchTextField.setText(null);
    }

    @FXML
    private void salaryOnMouseClick(MouseEvent event) {
        salaryTextField.setText(null);
    }

    @FXML
    private void divisionOnMouseClick(MouseEvent event) {
        divisionTextField.setText(null);
    }
     @FXML
    private void monthOnMouseClick(MouseEvent event) {
        monthTextField.setText(null);
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
    private void dojOnMouseclick(MouseEvent event) {
        dojDatePicker.setValue(null);
    }
   
    
}
