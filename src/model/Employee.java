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
    public class Employee implements Serializable{
    private String name;
    private String branch;
    private String division;
    private String salary;
    private String month;
    private LocalDate dateofpayment;
    
    public Employee(String name, String branch, String division, String salary, String month, LocalDate dateofpayment) {
        this.name = name;
        this.branch = branch;
        this.division = division;
        this.salary = salary;
        this.month = month;
        this.dateofpayment = dateofpayment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDate getDateofpayment() {
        return dateofpayment;
    }

    public void setDateofpayment(LocalDate dateofpayment) {
        this.dateofpayment = dateofpayment;
    }
   
    
}
   
    
