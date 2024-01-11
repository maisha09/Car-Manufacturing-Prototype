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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CreateNewAccount(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("CreateNewAccount.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Create New Account For Employee"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void ShowAllEmployees(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("ShowAllEmployees.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Show All Employees"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void PostANotice(ActionEvent event) throws IOException {
            Parent myparent = FXMLLoader.load(getClass().getResource("PostANotice.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Post Notice"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void ViewAllNotice(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("ViewAllNotice.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("View All Notice"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void DesignAndResearchDevelopment(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("DesignAndResearchDevelopment.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Design And Research & Development"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void Production(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("Production.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Production"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void SupplyChainAndLogistics(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("SupplyChainAndLogistics.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Supply Chain And Logistics"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void SalesAndMarketing(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("SalesAndMarketing.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Sales And Marketing"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void InventoryTracking(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("InventoryTracking.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Inventory Tracking"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void Warehouse(ActionEvent event) throws IOException {
        Parent myparent = FXMLLoader.load(getClass().getResource("Warehouse.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Warehouse"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void ProductionOutput(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("ProductionOutput.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Production Output"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void TaskManagement(ActionEvent event) throws IOException {
            Parent myparent = FXMLLoader.load(getClass().getResource("TaskManagement.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Task Management"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void QualityControl(ActionEvent event) throws IOException {
             Parent myparent = FXMLLoader.load(getClass().getResource("QualityControl.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Quality Control"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void ResourceAllocation(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("ResourceAllocation.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Resource Allocation"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void AlertsAndNotifications(ActionEvent event) throws IOException {
           Parent myparent = FXMLLoader.load(getClass().getResource("AlertsAndNotifications.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Alerts And Notifications"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void EquipmentInventory(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("EquipmentInventory.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Equipment Inventory"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void AssetTracking(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("Asset Tracking.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Asset Tracking"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void OpportunitiesForImprovement(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("OpportunitiesForImprovement.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Opportunities For Improvement"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }

    @FXML
    private void DecisionMaking(ActionEvent event) throws IOException {
         Parent myparent = FXMLLoader.load(getClass().getResource("DecisionMaking.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Decision Making"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }
    
}
