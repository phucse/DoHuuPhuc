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
public class Certificate {
    private int certificateID;
    private String certificateName;
    private Set<EmployeeInfo> employeeInfos;
    
    public Set<EmployeeInfo> getEmployeeInfos() {
        return employeeInfos;
    }

    public void setEmployeeInfos(Set<EmployeeInfo> employeeInfos) {
        this.employeeInfos = employeeInfos;
    }
    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    
    @Override
    public boolean equals(Object other) {
        Certificate certificate = (Certificate) other;
        if(other == null || certificate.certificateID != this.certificateID) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return certificateName;
    } 

}
