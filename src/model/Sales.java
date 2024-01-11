/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Sales {
     private String month;
    private String branch;
    private String totalSalesInTaka;
    
    public Sales(String month,String branch,String totalSalesInTaka){
     
        this.month=month;
        this.branch=branch;
        this.totalSalesInTaka=totalSalesInTaka;
        
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTotalSalesInTaka() {
        return totalSalesInTaka;
    }

    public void setTotalSalesInTaka(String totalSalesInTaka) {
        this.totalSalesInTaka = totalSalesInTaka;
    }
    
            
    
}
