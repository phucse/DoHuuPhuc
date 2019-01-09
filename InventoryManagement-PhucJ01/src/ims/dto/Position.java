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
public class Position {
    private int positionID;
    private String positionName;
    private Set<EmployeeInfo> employeeInfos;
    
    public Set<EmployeeInfo> getEmployeeInfos() {
        return employeeInfos;
    }

    public void setEmployeeInfos(Set<EmployeeInfo> employeeInfos) {
        this.employeeInfos = employeeInfos;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
    
    @Override
    public boolean equals(Object other) {
        Position position = (Position) other;
        if(other == null || position.positionID != this.positionID) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return positionName;
    } 

}
