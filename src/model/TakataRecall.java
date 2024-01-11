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
public class TakataRecall implements Serializable {
    private String vin,email,phone,checkvehicleinfo;  
     private LocalDate date; 
     
     public TakataRecall(String checkvehicleinfo) {
        this.checkvehicleinfo = checkvehicleinfo;
    }
     public TakataRecall(String vin,String email,String phone) {
         this.vin = vin;
        this.email = email; 
        this.phone= phone; 
    }
     public void setCheckvehicleinfo(String checkvehicleinfo) {
        this.checkvehicleinfo= checkvehicleinfo;
    }

    public String getCheckvehicleinfo() {
        return checkvehicleinfo;
    }
    
    public String getVIN() {
        return vin;
    }

    public void setVIN(String vin) {
        this.vin = vin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "TakataRecall{" + "vin=" + vin + "," + "email=" + email + ", phone=" + phone+ ", checkvehicleinfo=" + checkvehicleinfo + '}';
    }
    
}
