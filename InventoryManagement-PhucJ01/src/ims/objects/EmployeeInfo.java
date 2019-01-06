/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.objects;

import java.util.Date;

/**
 *
 * @author sieut
 */
public class EmployeeInfo {
    private String maNV;
    private String soThe;
    private String hoTen;
    private boolean phai;
    private int namSinh;
    private int maNoiSinh;
    private String cmnd;
    private Date ngayCapCMND;
    private int maNoiCapCMND;
    private String dcThuongTru;
    private int dtThuongTru;
    private String dcTamTru;
    private int dtdd;
    private String email;    
    private Date ngayVaoDoan;
    private Date ngayVaoDang;
    private int maDToc;
    private int maTGiao;
    private int maQTich;
    private int passport;
    private Date ngayCapCass;
    private int maNoiCapPass;
    private boolean honNhan;
    private int maSoThue;
    private Date ngayCapMST;
    private int soTK;
    private String maTK;
    private int maNH;
    private int maTDo;
    private int maBC;
    private String hocHam;
    private String chuyenMon;
    private int knlvNam;
    private int knlvThang;
    private int maLNV;
    private Date ngayVao;
    private Date ngayHet;
    private Date ngayChinhThuc;
    private int maDvi;
    private int maPBan;
    private int maBphan;
    private int maCDanh;
    private int maCVu;
    private int maNoiLam;
    private float luongTV;
    private float luongCB;
    private float luongKD;
    private String hinh;

    public EmployeeInfo() {}

    public EmployeeInfo(String maNV, String soThe, String hoTen, boolean phai, int namSinh, int maNoiSinh, String cmnd, Date ngayCapCMND, int maNoiCapCMND, String dcThuongTru, int dtThuongTru, String dcTamTru, int dtdd, String email, Date ngayVaoDoan, Date ngayVaoDang, int maDToc, int maTGiao, int maQTich, int passport, Date ngayCapCass, int maNoiCapPass, boolean honNhan, int maSoThue, Date ngayCapMST, int soTK, String maTK, int maNH, int maTDo, int maBC, String hocHam, String chuyenMon, int knlvNam, int knlvThang, int maLNV, Date ngayVao, Date ngayHet, Date ngayChinhThuc, int maDvi, int maPBan, int maBphan, int maCDanh, int maCVu, int maNoiLam, float luongTV, float luongCB, float luongKD, String hinh) {
        this.maNV = maNV;
        this.soThe = soThe;
        this.hoTen = hoTen;
        this.phai = phai;
        this.namSinh = namSinh;
        this.maNoiSinh = maNoiSinh;
        this.cmnd = cmnd;
        this.ngayCapCMND = ngayCapCMND;
        this.maNoiCapCMND = maNoiCapCMND;
        this.dcThuongTru = dcThuongTru;
        this.dtThuongTru = dtThuongTru;
        this.dcTamTru = dcTamTru;
        this.dtdd = dtdd;
        this.email = email;
        this.ngayVaoDoan = ngayVaoDoan;
        this.ngayVaoDang = ngayVaoDang;
        this.maDToc = maDToc;
        this.maTGiao = maTGiao;
        this.maQTich = maQTich;
        this.passport = passport;
        this.ngayCapCass = ngayCapCass;
        this.maNoiCapPass = maNoiCapPass;
        this.honNhan = honNhan;
        this.maSoThue = maSoThue;
        this.ngayCapMST = ngayCapMST;
        this.soTK = soTK;
        this.maTK = maTK;
        this.maNH = maNH;
        this.maTDo = maTDo;
        this.maBC = maBC;
        this.hocHam = hocHam;
        this.chuyenMon = chuyenMon;
        this.knlvNam = knlvNam;
        this.knlvThang = knlvThang;
        this.maLNV = maLNV;
        this.ngayVao = ngayVao;
        this.ngayHet = ngayHet;
        this.ngayChinhThuc = ngayChinhThuc;
        this.maDvi = maDvi;
        this.maPBan = maPBan;
        this.maBphan = maBphan;
        this.maCDanh = maCDanh;
        this.maCVu = maCVu;
        this.maNoiLam = maNoiLam;
        this.luongTV = luongTV;
        this.luongCB = luongCB;
        this.luongKD = luongKD;
        this.hinh = hinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isPhai() {
        return phai;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getMaNoiSinh() {
        return maNoiSinh;
    }

    public void setMaNoiSinh(int maNoiSinh) {
        this.maNoiSinh = maNoiSinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Date getNgayCapCMND() {
        return ngayCapCMND;
    }

    public void setNgayCapCMND(Date ngayCapCMND) {
        this.ngayCapCMND = ngayCapCMND;
    }

    public int getMaNoiCapCMND() {
        return maNoiCapCMND;
    }

    public void setMaNoiCapCMND(int maNoiCapCMND) {
        this.maNoiCapCMND = maNoiCapCMND;
    }

    public String getDcThuongTru() {
        return dcThuongTru;
    }

    public void setDcThuongTru(String dcThuongTru) {
        this.dcThuongTru = dcThuongTru;
    }

    public int getDtThuongTru() {
        return dtThuongTru;
    }

    public void setDtThuongTru(int dtThuongTru) {
        this.dtThuongTru = dtThuongTru;
    }

    public String getDcTamTru() {
        return dcTamTru;
    }

    public void setDcTamTru(String dcTamTru) {
        this.dcTamTru = dcTamTru;
    }

    public int getDtdd() {
        return dtdd;
    }

    public void setDtdd(int dtdd) {
        this.dtdd = dtdd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayVaoDoan() {
        return ngayVaoDoan;
    }

    public void setNgayVaoDoan(Date ngayVaoDoan) {
        this.ngayVaoDoan = ngayVaoDoan;
    }

    public Date getNgayVaoDang() {
        return ngayVaoDang;
    }

    public void setNgayVaoDang(Date ngayVaoDang) {
        this.ngayVaoDang = ngayVaoDang;
    }

    public int getMaDToc() {
        return maDToc;
    }

    public void setMaDToc(int maDToc) {
        this.maDToc = maDToc;
    }

    public int getMaTGiao() {
        return maTGiao;
    }

    public void setMaTGiao(int maTGiao) {
        this.maTGiao = maTGiao;
    }

    public int getMaQTich() {
        return maQTich;
    }

    public void setMaQTich(int maQTich) {
        this.maQTich = maQTich;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public Date getNgayCapCass() {
        return ngayCapCass;
    }

    public void setNgayCapCass(Date ngayCapCass) {
        this.ngayCapCass = ngayCapCass;
    }

    public int getMaNoiCapPass() {
        return maNoiCapPass;
    }

    public void setMaNoiCapPass(int maNoiCapPass) {
        this.maNoiCapPass = maNoiCapPass;
    }

    public boolean isHonNhan() {
        return honNhan;
    }

    public void setHonNhan(boolean honNhan) {
        this.honNhan = honNhan;
    }

    public int getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(int maSoThue) {
        this.maSoThue = maSoThue;
    }

    public Date getNgayCapMST() {
        return ngayCapMST;
    }

    public void setNgayCapMST(Date ngayCapMST) {
        this.ngayCapMST = ngayCapMST;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public int getMaNH() {
        return maNH;
    }

    public void setMaNH(int maNH) {
        this.maNH = maNH;
    }

    public int getMaTDo() {
        return maTDo;
    }

    public void setMaTDo(int maTDo) {
        this.maTDo = maTDo;
    }

    public int getMaBC() {
        return maBC;
    }

    public void setMaBC(int maBC) {
        this.maBC = maBC;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public int getKnlvNam() {
        return knlvNam;
    }

    public void setKnlvNam(int knlvNam) {
        this.knlvNam = knlvNam;
    }

    public int getKnlvThang() {
        return knlvThang;
    }

    public void setKnlvThang(int knlvThang) {
        this.knlvThang = knlvThang;
    }

    public int getMaLNV() {
        return maLNV;
    }

    public void setMaLNV(int maLNV) {
        this.maLNV = maLNV;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public Date getNgayHet() {
        return ngayHet;
    }

    public void setNgayHet(Date ngayHet) {
        this.ngayHet = ngayHet;
    }

    public Date getNgayChinhThuc() {
        return ngayChinhThuc;
    }

    public void setNgayChinhThuc(Date ngayChinhThuc) {
        this.ngayChinhThuc = ngayChinhThuc;
    }

    public int getMaDvi() {
        return maDvi;
    }

    public void setMaDvi(int maDvi) {
        this.maDvi = maDvi;
    }

    public int getMaPBan() {
        return maPBan;
    }

    public void setMaPBan(int maPBan) {
        this.maPBan = maPBan;
    }

    public int getMaBphan() {
        return maBphan;
    }

    public void setMaBphan(int maBphan) {
        this.maBphan = maBphan;
    }

    public int getMaCDanh() {
        return maCDanh;
    }

    public void setMaCDanh(int maCDanh) {
        this.maCDanh = maCDanh;
    }

    public int getMaCVu() {
        return maCVu;
    }

    public void setMaCVu(int maCVu) {
        this.maCVu = maCVu;
    }

    public int getMaNoiLam() {
        return maNoiLam;
    }

    public void setMaNoiLam(int maNoiLam) {
        this.maNoiLam = maNoiLam;
    }

    public float getLuongTV() {
        return luongTV;
    }

    public void setLuongTV(float luongTV) {
        this.luongTV = luongTV;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public float getLuongKD() {
        return luongKD;
    }

    public void setLuongKD(float luongKD) {
        this.luongKD = luongKD;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    
    
}
