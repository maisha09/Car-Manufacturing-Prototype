/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

public class Worker {
    private SimpleStringProperty firstName, lastName;
    private LocalDate birthday;

    public Worker(String firstName, String lastName, LocalDate birthday) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    
    
    public String getFirstName() {
        //return firstName;
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
