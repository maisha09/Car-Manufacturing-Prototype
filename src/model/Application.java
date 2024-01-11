/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


/**
 *
 * @author User
 */
public class Application implements Serializable{
    private String app;
    
    public void setApp(String str)
    {
        app=str;
    }

  
    @Override
    public String toString() {
         return "Application{" + "app=" + app + '}';
    }
    
    
}
