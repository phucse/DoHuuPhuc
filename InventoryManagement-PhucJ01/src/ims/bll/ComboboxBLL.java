/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;
import  ims.dal.*;
import ims.objects.*;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author sieut
 */

public class ComboboxBLL {
    ProvinceDAL provinceDAL = new ProvinceDAL();
    EthnicDAL ethnicDAL = new EthnicDAL();
    ReligionDAL religionDAL = new ReligionDAL();
    BankDAL bankdal = new BankDAL();
    TypeEmpDAL typeEmpDAL = new TypeEmpDAL();
    DegreeDAL degreeDAL = new DegreeDAL();
    CertificateDAL certificateDAL = new CertificateDAL();
    UnitWorkDAL unitWorkDAL = new UnitWorkDAL();
    RoomDAL roomDAL = new RoomDAL();
    DepartmentDAL departmentDAL = new DepartmentDAL();
    TitleDAL titleDAL = new TitleDAL();
    PositionDAL positionDAL = new PositionDAL();
    
    public ArrayList<Province>readProvince() throws SQLException, ClassNotFoundException{
        ArrayList<Province> proList = provinceDAL.readProvince();
        return proList;
    }
    
    public ArrayList<Ethnic>readEthnic() throws SQLException, ClassNotFoundException{
        ArrayList<Ethnic> ethnicList = ethnicDAL.readEthnic();
        return ethnicList;
    }
    
    public ArrayList<Religion>readReligion() throws SQLException, ClassNotFoundException{
        ArrayList<Religion>religionlList = religionDAL.readReligion();
        return religionlList;
    }
    
    public ArrayList<Bank>readBank() throws SQLException, ClassNotFoundException{
        ArrayList<Bank> bankList = bankdal.readBank();
        return bankList;
    }
    
    public ArrayList<TypeEmp>readTypeEmp() throws SQLException, ClassNotFoundException{
        ArrayList<TypeEmp> typeEmpList = typeEmpDAL.readType();
        return typeEmpList;
    }
    
    public ArrayList<Degree>readDegree() throws SQLException, ClassNotFoundException{
        ArrayList<Degree> degreeList = degreeDAL.readDegree();
        return degreeList;
    }
    
    public ArrayList<Certificate>readCertificate() throws SQLException, ClassNotFoundException{
        ArrayList<Certificate> certificateList = certificateDAL.readCertificate();
        return certificateList;
    }
    
    public ArrayList<UnitWork>readUnitWork() throws SQLException, ClassNotFoundException{
        ArrayList<UnitWork> unitWorkList = unitWorkDAL.readUnit();
        return unitWorkList;
    }
    
    public ArrayList<Room>readRoom() throws SQLException, ClassNotFoundException{
        ArrayList<Room> roomList = roomDAL.readRoom();
        return roomList;
    }
    
    public ArrayList<Department>readDepartment() throws SQLException, ClassNotFoundException{
        ArrayList<Department> departmentList = departmentDAL.readDepartment();
        return departmentList;
    }
    
    public ArrayList<Title>readTitle() throws SQLException, ClassNotFoundException{
        ArrayList<Title> titleList = titleDAL.readTitle();
        return titleList;
    }
    
    public ArrayList<Position>readPosition() throws SQLException, ClassNotFoundException{
        ArrayList<Position> positionList = positionDAL.readPosition();
        return positionList;
    }
}
