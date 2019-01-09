/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.EmployeeDAL;
import ims.dto.EmployeeInfo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class EmployeeBLL {
    EmployeeDAL eDal = new EmployeeDAL();
    
    public void addEmployee(EmployeeInfo em) throws SQLException, ClassNotFoundException {
        eDal.addEmployee(em);
    }
    
    public ArrayList<EmployeeInfo>readEmployeeInfos() throws SQLException, ClassNotFoundException{
        ArrayList<EmployeeInfo> employeeInfos = eDal.readEmployeeInfo();
        return employeeInfos;
    }
    
    public void deleteEmp(String id) throws ClassNotFoundException, SQLException{
        eDal.deleteEmp(id);
    }
    
}
