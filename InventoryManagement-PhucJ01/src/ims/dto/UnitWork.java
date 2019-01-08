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
public class UnitWork {
    private int unitID;
    private String unitkName;
    private Set<EmployeeInfo> employeeInfos;
    
    public Set<EmployeeInfo> getEmployeeInfos() {
        return employeeInfos;
    }

    public void setEmployeeInfos(Set<EmployeeInfo> employeeInfos) {
        this.employeeInfos = employeeInfos;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public String getUnitName() {
        return unitkName;
    }

    public void setUnitName(String unitkName) {
        this.unitkName = unitkName;
    }
    
    @Override
    public String toString() {
        return unitkName;
    } 

}
