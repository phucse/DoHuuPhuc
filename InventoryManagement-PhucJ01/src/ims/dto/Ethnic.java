/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

import java.util.Set;

/**
 *
 * @author sieut
 */
public class Ethnic {
    private int ethnicID;
    private String ethnicName;
    private Set<EmployeeInfo> employeeInfos;
    
    public Set<EmployeeInfo> getEmployeeInfos() {
        return employeeInfos;
    }

    public void setEmployeeInfos(Set<EmployeeInfo> employeeInfos) {
        this.employeeInfos = employeeInfos;
    }

    public int getEthnicID() {
        return ethnicID;
    }

    public void setEthnicID(int ethnicID) {
        this.ethnicID = ethnicID;
    }

    public String getEthnicName() {
        return ethnicName;
    }

    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName;
    }
    
    @Override
    public String toString() {
        return ethnicName;
    } 
    
}
