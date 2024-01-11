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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.AppendableObjectOutputStream;
import model.Sales;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MonthlyStatementController implements Initializable {

    @FXML
    private TextField monthTextField;
    @FXML
    private TextField branchTextField;
    @FXML
    private TextField totalSalesTextField;
    @FXML
    private TableView<Sales> tableView;
    @FXML
    private TableColumn<Sales,String> monthColumn;
    @FXML
    private TableColumn<Sales, String> branchColumn;
    @FXML
    private TableColumn<Sales,String> totalSalesInTakaColumn;
    
    ArrayList <Sales> saleslist = new ArrayList(); 
    @FXML
    private Button goBackButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthColumn.setCellValueFactory(new PropertyValueFactory<Sales, String>("month"));
        branchColumn.setCellValueFactory(new PropertyValueFactory<Sales, String>("Branch"));
        totalSalesInTakaColumn.setCellValueFactory(new PropertyValueFactory<Sales, String>("totalSalesInTaka"));
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try
        {
            f = new File("SaleDetails.bin");
            
            if(!f.exists())
            {
                System.out.println("file dosen't exist");
            }
            else
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                
                Sales s;
                while(true)
                {
                   s= (Sales)ois.readObject();
                   saleslist.add(s);
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
                ObservableList<Sales> people = FXCollections.observableArrayList();
            
                for(Sales s: saleslist){
                    people.add(s);
                }
                tableView.setItems(people);
            }
            catch(Exception e){
                    System.out.println("exception:"+e);
                    
            }
            
        }
    }    

    @FXML
    private void addToListOnClickAction(ActionEvent event) {
         Sales newSales = new Sales( 
                                       monthTextField.getText(),
                                       branchTextField.getText(), 
                                       totalSalesTextField.getText()
                                      
                                        );
            tableView.getItems().add(newSales); 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            f = new File("SaleDetails.bin");
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

            oos.writeObject(newSales);
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
    private void monthOnMouseClick(MouseEvent event) {
        monthTextField.setText(null);
    }

    @FXML
    private void branchOnMouseClick(MouseEvent event) {
            branchTextField.setText(null);
    }

    @FXML
    private void totalSalesInTakaOnMouseClick(MouseEvent event) {
            totalSalesTextField.setText(null);
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
