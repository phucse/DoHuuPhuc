/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.dto.EmployeeInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class EmployeeDAL extends Database {
    
    public void addEmployee(EmployeeInfo em) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = getConnection();
        PreparedStatement pre = null;
        
        String maNV = em.getMaNV();
        String soThe = em.getSoThe();
        String hoTen = em.getHoTen();
        String phai = em.getPhai();
        int namSinh = em.getNamSinh();
        int maNoiSinh = em.getMaNoiSinh();        
        String cmnd = em.getCmnd();
        Date ngayCapCMND = em.getNgayCapCMND();
        int maNoiCapCMND = em.getMaNoiCapCMND();
        String dcThuongTru = em.getDcThuongTru();
        int dtThuongTru = em.getDtThuongTru();
        String dcTamTru = em.getDcTamTru();
        int dtdd = em.getDtdd();
        String email = em.getEmail();
        Date ngayVaoDoan = em.getNgayVaoDoan();
        Date ngayVaoDang = em.getNgayVaoDang();
        int maDToc = em.getMaDToc();
        int maTGiao = em.getMaTGiao();
        String quocTich = em.getQuocTich();
        int passport = em.getPassport();
        Date ngayCapCass = em.getNgayCapCass();
        int maNoiCapPass = em.getMaNoiCapPass();
        String honNhan = em.getHonNhan();
        int maSoThue = em.getMaSoThue();
        Date ngayCapMST = em.getNgayCapMST();
        int soTK = em.getSoTK();
        String maTK = em.getMaTK();
        int maNH = em.getMaNH();
        int maTDo = em.getMaTDo();
        int maBC = em.getMaBC();
        String hocHam = em.getHocHam();
        String chuyenMon = em.getChuyenMon();
        int knlvNam = em.getKnlvNam();
        int knlvThang = em.getKnlvThang();
        int maLNV = em.getMaLNV();
        Date ngayVao = em.getNgayVao();
        Date ngayHet = em.getNgayHet();
        Date ngayChinhThuc = em.getNgayChinhThuc();
        int maDvi = em.getMaDvi();
        int maPBan = em.getMaPBan();
        int maBphan = em.getMaBphan();
        int maCDanh = em.getMaCDanh();
        int maCVu = em.getMaCVu();
        int maNoiLam = em.getMaNoiLam();
        float luongTV = em.getLuongTV();
        float luongCB = em.getLuongCB();
        float luongKD = em.getLuongKD();
        String hinh = em.getHinh();
        
        String sql = "INSERT INTO `nhanvien` (`MaNV`, `SoThe`, `TenNV`, `Phai`, `NamSinh`, `MaNoiSinh`, `CMND`, `NgayCapCM`, `MaNoiCapCM`, `DCThuongTru`, `DTThuongTru`, `DCTamTru`, `DTDD`, `Email`, `NgayVaoDoan`, `NgayVaoDang`, `MaDT`, `MaTG`, `QuocTich`, `Passport`, `NgayCapPass`, `MaNoiCapPass`, `HonNhan`, `MaSoThue`, `NgayCapMST`, `SoTK`, `MaTK`, `MaNH`, `MaTD`, `MaBC`, `HocHam`, `ChuyenMon`, `KNLVNam`, `KNLVThang`, `MaLNV`, `NgayVao`, `NgayHet`, `NgayChinhThuc`, `MaDV`, `MaPB`, `MaBP`, `MaCD`, `MaCV`, `MaNoiLam`, `LuongTV`, `LuongCB`, `LuongKD`, `Hinh`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        pre = conn.prepareStatement(sql);
        pre.setString(1, maNV);
        pre.setString(2, soThe);
        pre.setString(3, hoTen);
        pre.setString(4, phai);
        pre.setInt(5, namSinh);
        pre.setInt(6, maNoiSinh);        
        pre.setString(7, cmnd);
        pre.setDate(8, ngayCapCMND);
        pre.setInt(9, maNoiCapCMND);
        pre.setString(10, dcThuongTru);
        pre.setInt(11, dtThuongTru);
        pre.setString(12, dcTamTru);
        pre.setInt(13, dtdd);
        pre.setString(14, email);
        pre.setDate(15, ngayVaoDoan);
        pre.setDate(16, ngayVaoDang);
        pre.setInt(17, maDToc);
        pre.setInt(18, maTGiao);
        pre.setString(19, quocTich);
        pre.setInt(20, passport);
        pre.setDate(21, ngayCapCass);
        pre.setInt(22, maNoiCapPass);
        pre.setString(23, honNhan);
        pre.setInt(24, maSoThue);
        pre.setDate(25, ngayCapMST);
        pre.setInt(26, soTK);
        pre.setString(27, maTK);
        pre.setInt(28, maNH);
        pre.setInt(29, maTDo);
        pre.setInt(30, maBC);
        pre.setString(31, hocHam);
        pre.setString(32, chuyenMon);
        pre.setInt(33, knlvNam);
        pre.setInt(34, knlvThang);
        pre.setInt(35, maLNV);
        pre.setDate(36, ngayVao);
        pre.setDate(37, ngayHet);
        pre.setDate(38, ngayChinhThuc);
        pre.setInt(39, maDvi);
        pre.setInt(40, maPBan);
        pre.setInt(41, maBphan);
        pre.setInt(42, maCDanh);
        pre.setInt(43, maCVu);
        pre.setInt(44, maNoiLam);
        pre.setFloat(45, luongTV);
        pre.setFloat(46, luongCB);
        pre.setFloat(47, luongKD);
        pre.setString(48, hinh);
        
        pre.execute();
        
        pre.close();
        conn.close();
    }
    
    public ArrayList<EmployeeInfo> readEmployeeInfo() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement stm = null;
        ArrayList<EmployeeInfo> employeeInfoList = new ArrayList<EmployeeInfo>();
        
        conn = getConnection();        
        stm = conn.createStatement();
        String sql = "SELECT * FROM nhanvien";
        ResultSet rs = stm.executeQuery(sql); 
        while (rs.next()) {
            EmployeeInfo employeeInfo = new EmployeeInfo();   
            employeeInfo.setMaNV(rs.getString("MaNV"));
            employeeInfo.setMaNoiSinh(rs.getInt("MaNoiSinh"));
            employeeInfo.setHoTen(rs.getString("TenNV"));
            employeeInfo.setNamSinh(rs.getInt("NamSinh")); 
            employeeInfoList.add(employeeInfo);
        }
        rs.close();
        stm.close();
        conn.close();
        return employeeInfoList;
    }
    
    public void deleteEmp (String id) throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement stm = null;
        conn=getConnection();
        
        stm=conn.createStatement();
        String sql = "DELETE FROM nhanvien where MaNV = '"+id+"';";
        stm.executeUpdate(sql);
        stm.close();
        conn.close();
    }
}
