/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;


//import com.itextpdf.io.image.ImageData;
//import com.itextpdf.io.image.ImageDataFactory;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Image;
//import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.element.Table;
//import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CheckPaymentController implements Initializable {

    @FXML
    private Button generatePdfButton;
    @FXML
    private Button goBackButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 
    
     @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FinanceOfficerHomePage.fxml"));
        Scene scene2 = new Scene(scene2Parent);      
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void generatePdfButtonOnAction(ActionEvent event) {
//         try{
//           
//            FileChooser fc = new FileChooser();
//            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
//            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
//            File f = fc.showSaveDialog(null);
//            if(f!=null){              
//                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
//                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
//                PdfDocument pdf =  new PdfDocument(pw);
//                pdf.addNewPage();
//                Document doc = new Document(pdf);
//                doc.setLeftMargin(70);
//               
//                //----------------------------------------------------
//                //adding paragrapg to the pdf
//                String newline = "\n";
//                Paragraph lineSpace = new Paragraph(newline);
//                lineSpace.setHeight(8);
//                
//                String paraText1 
//                        = "This is line 1 of the paragraph, and the line continue....\n"
//                        + "This is line 2 of the paragraph, and the line continue....\n"
//                        + "This is line 3 of the paragraph, and the line continue....\n"
//                        + "This is line 4 of the paragraph, and the line continue....\n";
//                Paragraph para1 = new Paragraph(paraText1);
//                
//                Text titleText = new Text("This is the TITLE of the pdf");
//                titleText.setFontSize(18f);
//                Paragraph pageTitle = new Paragraph(titleText);
//                pageTitle.setBold();    //OR titleText.setBold();
//
//               
//                
//                doc.add(pageTitle);
//                doc.add(lineSpace);
//                doc.add(para1);
//                doc.add(lineSpace);
//                doc.add(lineSpace);
//                
//                //----------------------------------------------------
//             
//                //----------------------------------------------------
//                //adding an image
//                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
//                a.setContentText("Do you want to add an Image?");
//                Optional<ButtonType> result = a.showAndWait();
//                if(result.get() == ButtonType.OK){ 
//                    File imageFile = fc.showOpenDialog(null);
//                    String imagePath = imageFile.getAbsolutePath();
//                    ImageData data = ImageDataFactory.create(imagePath);
//                    Image image = new Image(data);  
//                    image.setAutoScale(true);
//                    
//                    doc.add(image);
//                    doc.add(lineSpace);
//                    a = new Alert(Alert.AlertType.INFORMATION);
//                    a.setContentText("The image is added successfully.");
//                    a.showAndWait();
//                }
//                //----------------------------------------------------
//                
//                //adding table in pdf
//                float colWidthArr[] = {70f, 200f, 100f};
//                Table pdfTable = new Table(colWidthArr); 
//                
//                //adding header row
//               
//                
//                //adding content row
//              
//                doc.add(pdfTable);
//                
//                doc.close();
//                
//                a = new Alert(Alert.AlertType.INFORMATION);
//                a.setContentText("The PDF is saved successfully.");
//                a.showAndWait();    
//            }
//            else{
//                Alert a = new Alert(Alert.AlertType.INFORMATION);
//                a.setContentText("Saving as PDF: cancelled!");
//                a.showAndWait();               
//            }
//        }
//        catch(IOException e){
//            Alert a = new Alert(Alert.AlertType.INFORMATION);
//            a.setContentText("Oops! Exception: " + e.toString()+ " occured.");
//            a.showAndWait(); 
//            //System.out.println("Something went wrong...");
//            //System.out.println(e);
//        }         
//        
//    }

    }
    
}
       

