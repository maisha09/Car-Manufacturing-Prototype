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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CreateNewAccountController implements Initializable {

    @FXML
    private TextField EnterTheEmployeeNamne;
    @FXML
    private TextField DepartmentOfTheEmployee;
    @FXML
    private TextField TypeOfEmployee;
    @FXML
    private TextField WorkingType;
    @FXML
    private TextField RecentMonthlySalary;
    @FXML
    private TextField AgeOfTheEmployee;
    @FXML
    private TextField EmployeeAddress;
    @FXML
    private TextField EmployeeContactNumber;
    @FXML
    private TextField EmployeeEmail;
    @FXML
    private TextField EmployeeGender;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EmployeeSubmit(ActionEvent event) throws IOException {
         StringBuilder sb = new StringBuilder();
        sb.append(EnterTheEmployeeNamne.getText().toString()+ "\n");
        sb.append(DepartmentOfTheEmployee.getText().toString()+ "\n");
        sb.append(TypeOfEmployee.getText().toString()+ "\n");
        sb.append(WorkingType.getText().toString()+ "\n");
        sb.append(RecentMonthlySalary.getText().toString()+ "\n");
        sb.append(AgeOfTheEmployee.getText().toString()+ "\n");
        sb.append(EmployeeAddress.getText().toString()+ "\n");
        sb.append(EmployeeContactNumber.getText().toString()+ "\n");
        sb.append(EmployeeEmail.getText().toString()+ "\n");
        sb.append(EmployeeGender.getText().toString());
        
        File file = new File("C:\\Users\\Koushik Dewri\\Documents\\NetBeansProjects\\Department Head\\Employees.txt");
        FileWriter W = new FileWriter(file);
        W.write(sb.toString());
        W.close();
    }

    @FXML
    private void EmployeeBack(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Dashboard"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }
    
}
