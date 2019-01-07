/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.UnitWork;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class UnitWorkDAL extends Database{
    public ArrayList<UnitWork>readUnit() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<UnitWork> unitList = new ArrayList<UnitWork>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaDV,TenDV FROM donvi";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                UnitWork unit = new UnitWork();
                unit.setUnitID(rs.getInt("MaDV"));                
                unit.setUnitName(rs.getString("TenDV"));
                unitList.add(unit);
            }
            rs.close();
            stm.close();
            conn.close();
            return unitList;
    }
}
