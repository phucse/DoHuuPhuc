/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Certificate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class CertificateDAL extends Database{
    public ArrayList<Certificate>readCertificate() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Certificate> certificateList = new ArrayList<Certificate>();        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaBC,TenBC FROM bangcap";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Certificate certificate = new Certificate();
                certificate.setCertificateID(rs.getInt("MaBC"));                
                certificate.setCertificateName(rs.getString("TenBC"));
                certificateList.add(certificate);
            }
            rs.close();
            stm.close();
            conn.close();
            return certificateList;
    }
}
