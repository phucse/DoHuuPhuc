/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.TypeEmp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class TypeEmpDAL extends Database{
    public ArrayList<TypeEmp>readType() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<TypeEmp> typeList = new ArrayList<TypeEmp>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaLNV,TenLNV FROM loainv";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                TypeEmp type = new TypeEmp();
                type.setTypeID(rs.getInt("MaLNV"));                
                type.setTypeName(rs.getString("TenLNV"));
                typeList.add(type);
            }
            rs.close();
            stm.close();
            conn.close();
            return typeList;
    }
}
