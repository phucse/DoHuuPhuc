/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Bank;
import ims.objects.Bank;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class BankDAL extends Database{
    public ArrayList<Bank>readBank() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Bank> bankList = new ArrayList<Bank>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaNH,TenNH FROM nganhang";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Bank bank = new Bank();
                bank.setBankID(rs.getInt("MaNH"));                
                bank.setBankName(rs.getString("TenNH"));
                bankList.add(bank);
            }
            rs.close();
            stm.close();
            conn.close();
            return bankList;
    }   
    
}
