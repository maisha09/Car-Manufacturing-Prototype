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
    public class Goals implements Serializable {
    private String time,place;
    private LocalDate date;
    
    public Goals()
    {
        time = place = null;
        date=null;
    }
    public Goals(String time, String place, LocalDate date)  
    {
        this.time = time;
        this.place = place;
        this.date = date;
      
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    
    @Override
    public String toString() {
        return "Goals{place=" + place + ",time=" + time + ",date=" + date + '}';
    }
   
}

    
