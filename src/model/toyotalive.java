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
public class toyotalive {
      private String liveDate, liveType, liveTime, liveLocation, liveLink, liveSetBy;
        
         public void participateLive(TextField liveDateTextField, TextField liveTypeTextField, TextField liveTimeTextField, TextField liveLocationTextField, TextField liveLinkTextField, TextField setByTextField) {
        File f = null;
        Scanner sc  = null;
        
        String str; String[] tokens = null;
        
        try
        {
            f = new File("toyotalive.txt");
            
            sc = new Scanner(f);
            
            if(f.exists())
            {
                
                while(sc.hasNextLine())
                {
                   str = sc.nextLine();
                  
                    
                  tokens  = str.split(",");
                  
                 
                    
                    
                }
                liveDate = tokens[0];
                liveType = tokens[1];
                liveTime = tokens[2];
                liveLocation = tokens[3];
                liveLink = tokens[4];
                liveSetBy = tokens[5];
                
                liveDateTextField.setText(liveDate);
                 liveTypeTextField.setText(liveType);
                 liveTimeTextField.setText(liveTime);
                liveLocationTextField.setText(liveLocation);
                 liveLinkTextField.setText(liveLink);
                 setByTextField.setText(liveSetBy);
                 
                
                
                
                
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
