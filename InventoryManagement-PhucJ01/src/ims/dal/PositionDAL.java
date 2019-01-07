/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Position;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class PositionDAL extends Database{
    public ArrayList<Position>readPosition() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Position> positionList = new ArrayList<Position>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaCV,TenCV FROM chucvu";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Position position = new Position();
                position.setPositionID(rs.getInt("MaCV"));                
                position.setPositionName(rs.getString("TenCV"));
                positionList.add(position);
            }
            rs.close();
            stm.close();
            conn.close();
            return positionList;
    }
}
