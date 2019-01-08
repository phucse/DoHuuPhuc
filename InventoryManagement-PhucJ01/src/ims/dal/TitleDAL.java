/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.Title;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class TitleDAL extends Database{
    public ArrayList<Title>readTitle() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Title> titleList = new ArrayList<Title>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaCD,TenCD FROM chucdanh";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Title title = new Title();
                title.setTitleID(rs.getInt("MaCD"));                
                title.setTitleName(rs.getString("TenCD"));
                titleList.add(title);
            }
            rs.close();
            stm.close();
            conn.close();
            return titleList;
    }    
}
