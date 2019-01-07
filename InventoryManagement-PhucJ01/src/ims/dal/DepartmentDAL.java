/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Department;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class DepartmentDAL extends Database{
    public ArrayList<Department>readDepartment() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stm = null;
        ArrayList<Department> departmentList = new ArrayList<Department>();
        
            conn = getConnection();            
            stm = conn.createStatement();
            String sql = "Select MaBP,TenBP FROM bophan";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Department department = new Department();
                department.setDepartmentID(rs.getInt("MaBP"));                
                department.setDepartmentName(rs.getString("TenBP"));
                departmentList.add(department);
            }
            rs.close();
            stm.close();
            conn.close();
            return departmentList;
    }
}
