/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.Scanner;
import javafx.scene.control.TextField;

/**
 *
 * @author User
 */
public class Announce {
     private String name, branch, phone;
        
        public void announcement(TextField nameTextField, TextField branchTextField, TextField phoneTextField) {
        File f = null;
        Scanner sc  = null;
        
        String str; String[] tokens = null;
        
        try
        {
            f = new File("EmployeeOfTheMonth.txt");
            
            sc = new Scanner(f);
            
            if(f.exists())
            {
                
                while(sc.hasNextLine())
                {
                   str = sc.nextLine();
                  
                    
                  tokens  = str.split(",");
                  
                 
                    
                    
                }
                name = tokens[0];
                branch = tokens[1];
                phone = tokens[2];
                
                
                nameTextField.setText(name);
                branchTextField.setText(branch);
                phoneTextField.setText(phone);
                    
            }
    
    
        }
        catch(Exception e)
        {
            System.out.println("Exception  : "+e);
        }
        finally{
            sc.close();
        }
        
        
         }

    
    
}
