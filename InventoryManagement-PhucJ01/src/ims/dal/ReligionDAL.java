/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Religion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class ReligionDAL extends Database{
    public ArrayList<Religion>readReligion() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Religion> religionList = new ArrayList<Religion>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaTG,TenTG FROM tongiao";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Religion religion = new Religion();
                religion.setReligionID(rs.getInt("MaTG"));                
                religion.setReligionName(rs.getString("TenTG"));
                religionList.add(religion);
            }
            rs.close();
            stm.close();
            conn.close();
            return religionList;
    }    
}
