/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Meeting implements Serializable {
    private String month;
    private LocalDate dateofjoining; 
    
    public Meeting(String month, LocalDate dateofjoining)  
    
    {
        this.month= month;
        this.dateofjoining = dateofjoining;
   }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDate getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(LocalDate dateofjoining) {
        this.dateofjoining = dateofjoining;
    }
    
}
