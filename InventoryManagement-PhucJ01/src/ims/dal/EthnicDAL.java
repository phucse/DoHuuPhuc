/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.Ethnic;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class EthnicDAL extends Database{
    public ArrayList<Ethnic>readEthnic() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Ethnic> ethnicList = new ArrayList<Ethnic>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaDT,TenDT FROM dantoc";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Ethnic ethnic = new Ethnic();
                ethnic.setEthnicID(rs.getInt("MaDT"));                
                ethnic.setEthnicName(rs.getString("TenDT"));
                ethnicList.add(ethnic);
            }
            rs.close();
            stm.close();
            conn.close();
            return ethnicList;
    }
    
}
