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
public class Contact  implements Serializable { 
    private String email,name,phone,message,submitinfo;  
     private LocalDate date; 
     
     public Contact(String submitinfo) {
        this.submitinfo = submitinfo;
    }
     public Contact(String email, String name, String phone, String message) {
        this.email = email; 
        this.name = name;
        this.phone= phone; 
        this.message= message;
    }
     public void setSubmitinfo(String submitinfo) {
        this.submitinfo= submitinfo;
    }

    public String getSubmitinfo() {
        return submitinfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getmessage() {
        return message;
    }


    @Override
    public String toString() {
        return "Contact{" + "email=" + email + ", name=" + name + ", phone=" + phone+ ", message=" +message + ", submitinfo=" + submitinfo + ", date=" + date + '}';
    }
    
}
