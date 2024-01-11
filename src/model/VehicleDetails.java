/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class VehicleDetails {
      private String carName, carModel;
    private LocalDate dateofadding;
    private String designation,contactnumber,colour; 


    public VehicleDetails(String carName, String carModel, String designation,LocalDate dateofadding,  
                        String contactnumber, String colour)  
    
    {
        this.carName = carName;
        this.carModel = carModel;
        this.dateofadding = dateofadding;
        this.designation = designation;
        this.contactnumber = contactnumber;
        this.colour = colour;
    }

    public String  getCarName() {
        return carName;
    }

    public void setCarName(String  carName) {
        this.carName = carName;
    }
  
    public String  getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public LocalDate getDateofjoining() {
        return dateofadding;
    }

    public void setDateofadding(String LocalDate) {
        this.dateofadding = dateofadding;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
