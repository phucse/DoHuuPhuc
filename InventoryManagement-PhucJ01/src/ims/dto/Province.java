/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;


/**
 *
 * @author sieut
 */
public class Province {
    private int provinceID;
    private String provinceName;
    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object other) {
        Province province = (Province) other;
        if(other == null || province.provinceID != this.provinceID) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return provinceName;
    }    
    
}
