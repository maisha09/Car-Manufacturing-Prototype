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
public class Order implements Serializable {
    private String productno,time,place;
    private LocalDate date;
    
    public Order()
    {
        productno=time = place = null;
        date=null;
    }
    public Order(String productno, String time, String place, LocalDate date)  
    {
        this.productno = productno;
        this.time = time;
        this.place = place;
        this.date = date;
      
    }
     public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
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
        return "Order{productno=" + productno + ", time=" + time + ", place=" + place + ",date=" + date + '}';
    }
    
}
