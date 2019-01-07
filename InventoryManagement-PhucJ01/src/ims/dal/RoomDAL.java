/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Room;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class RoomDAL extends Database{
    public ArrayList<Room>readRoom() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Room> roomList = new ArrayList<Room>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaPB,TenPB FROM phongban";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Room room = new Room();
                room.setRoomID(rs.getInt("MaPB"));                
                room.setRoomName(rs.getString("TenPB"));
                roomList.add(room);
            }
            rs.close();
            stm.close();
            conn.close();
            return roomList;
    }
}
