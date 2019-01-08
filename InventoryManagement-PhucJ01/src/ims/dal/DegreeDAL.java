/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.Degree;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class DegreeDAL extends Database{
    public ArrayList<Degree>readDegree() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Degree> degreeList = new ArrayList<Degree>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaTD,TenTD FROM trinhdo";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Degree degree = new Degree();
                degree.setDegreeID(rs.getInt("MaTD"));                
                degree.setDegreeName(rs.getString("TenTD"));
                degreeList.add(degree);
            }
            rs.close();
            stm.close();
            conn.close();
            return degreeList;
    }
    
}
