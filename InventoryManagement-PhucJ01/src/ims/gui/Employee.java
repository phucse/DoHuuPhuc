/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import ims.dto.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import ims.bll.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAT
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    ArrayList<Province> proList;
    ArrayList<Ethnic> ethnicList;
    ArrayList<Religion> religionList;
    ArrayList<Bank> bankList;
    ArrayList<TypeEmp> typeEmpList;
    ArrayList<Degree> degreeList;
    ArrayList<Certificate> certificateList;
    ArrayList<UnitWork> unitWorkList;
    ArrayList<Room> roomList;
    ArrayList<Department> departmentList;
    ArrayList<Title> titleList;
    ArrayList<Position> positionList;

    Province province;
    Ethnic ethnic;
    Religion religion;
    Bank bank;
    TypeEmp typeEmp;
    Degree degree;
    Certificate certificate;
    UnitWork unitWork;
    Room room;
    Department department;
    Title title;
    Position position;

    private ComboboxBLL cbll = new ComboboxBLL();
    private EmployeeInfo employeeInfo;
    private EmployeeInfo empDetail;
    private EmployeeBLL ebll = new EmployeeBLL();
    private boolean isDetail;

    public Employee() {
        initComponents();
        stateButton(true);
        setInfoDialog();
        isDetail = false;
    }

    public Employee(String id) throws ClassNotFoundException, SQLException {
        this();
        empDetail = new EmployeeBLL().detailEmployeeInfo(id);
        isDetail = true;
        btNew.setVisible(false);
    }

    public void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
        setResizable(false);
    }

    public void stateButton(boolean value) {

        btNew.setVisible(value);
        btEdit.setVisible(value);
        btDelete.setVisible(value);
        btPrint.setVisible(value);
        btClose.setVisible(value);
        btSave.setVisible(!value);
        btCancel.setVisible(!value);
    }

    public EmployeeInfo insertEmployee() {
        //Get ID of ComboBoxes
        Province maNS, maNCCM, maNCP, maDDLV;
        Ethnic dT;
        Religion tG;
        Bank nH;
        TypeEmp lNV;
        Degree tD;
        Certificate bC;
        UnitWork dV;
        Room pB;
        Department bP;
        Title cD;
        Position cV;

        maNS = (Province) cbxNoiSinh.getSelectedItem();
        int maNoiSinh = maNS.getProvinceID();
        maNCP = (Province) cbxMaNoiCapPass.getSelectedItem();
        int maNoiCapPass = maNCP.getProvinceID();
        maNCCM = (Province) cbxNoiCapCM.getSelectedItem();
        int maNoiCapCM = maNCCM.getProvinceID();
        maDDLV = (Province) cbxDDLV.getSelectedItem();
        int maNoiLam = maDDLV.getProvinceID();
        dT = (Ethnic) cbxDanToc.getSelectedItem();
        int maDantoc = dT.getEthnicID();
        tG = (Religion) cbxTonGiao.getSelectedItem();
        int maTonGiao = tG.getReligionID();
        nH = (Bank) cbxNganHang.getSelectedItem();
        int maNganHang = nH.getBankID();
        lNV = (TypeEmp) cbxLoaiNV.getSelectedItem();
        int maLoaiNV = lNV.getTypeID();
        tD = (Degree) cbxTrinhDo.getSelectedItem();
        int maTrinhDO = tD.getDegreeID();
        bC = (Certificate) cbxBangCap.getSelectedItem();
        int maBangCap = bC.getCertificateID();
        dV = (UnitWork) cbxDonVi.getSelectedItem();
        int maDonVi = dV.getUnitID();
        pB = (Room) cbxPhongBan.getSelectedItem();
        int maPhongBan = pB.getRoomID();
        bP = (Department) cbxBoPhan.getSelectedItem();
        int maBoPhan = bP.getDepartmentID();
        cD = (Title) cbxChucDanh.getSelectedItem();
        int maChucDanh = cD.getTitleID();
        cV = (Position) cbxChucVu.getSelectedItem();
        int maChucvu = cV.getPositionID();

        //Get Text
        String maNV = txtMaNV.getText();
        String soThe = txtSoThe.getText();
        String hoTen = txtHoTen.getText();
        String phai = cbxPhai.getSelectedItem().toString();
        int namSinh = Integer.valueOf(txtNamSinh.getText());
        String cmnd = txtCMND.getText();
        Date ngayCapCMND = Date.valueOf(txtNgayCapCMND.getText());
        String dcThuongTru = txtDCThuongTru.getText();
        int dtThuongTru = Integer.valueOf(txtDTTT.getText());
        String dcTamTru = txtDCTamTru.getText();
        int dtdd = Integer.valueOf(txtDTTT.getText());
        String email = txtEmail.getText();
        Date ngayVaoDoan = Date.valueOf(txtNgayVaoDoan.getText());
        Date ngayVaoDang = Date.valueOf(txtNgayVaoDang.getText());
        String quocTich = txtQuocTich.getText();
        int passport = Integer.valueOf(txtPassport.getText());
        Date ngayCapPass = Date.valueOf(txtNgayCapPass.getText());
        String honNhan = cbxHonNhan.getSelectedItem().toString();
        int maSoThue = Integer.valueOf(txtMaSoThue.getText());
        Date ngayCapMST = Date.valueOf(txtNgayCapMST.getText());
        int soTK = Integer.valueOf(txtSoTK.getText());
        String maTK = txtMaTK.getText();
        String hocHam = txtHocHam.getText();
        String chuyenMon = txtChuyenMon.getText();
        int knlvNam = Integer.valueOf(txtKNLVNam.getText());
        int knlvThang = Integer.valueOf(txtKNLVThang.getText());
        Date ngayVao = Date.valueOf(txtNgayVaoCT.getText());
        Date ngayHet = Date.valueOf(txtNgayHetHanTV.getText());
        Date ngayChinhThuc = Date.valueOf(txtNgayChinhThuc.getText());
        float luongTV = Float.valueOf(txtLuongTV.getText());
        float luongCB = Float.valueOf(txtLuongCB.getText());
        float luongKD = Float.valueOf(txtLuongKD.getText());
        String hinh = "";

        if (employeeInfo == null) {
            employeeInfo = new EmployeeInfo();
        }

        employeeInfo.setMaNoiSinh(maNoiSinh);
        employeeInfo.setMaNoiCapCMND(maNoiCapCM);
        employeeInfo.setMaNoiLam(maNoiLam);
        employeeInfo.setMaNoiCapPass(maNoiCapPass);
        employeeInfo.setMaTGiao(maTonGiao);
        employeeInfo.setMaDToc(maDantoc);
        employeeInfo.setMaNH(maNganHang);
        employeeInfo.setMaLNV(maLoaiNV);
        employeeInfo.setMaTDo(maTrinhDO);
        employeeInfo.setMaBC(maBangCap);
        employeeInfo.setMaDvi(maDonVi);
        employeeInfo.setMaPBan(maPhongBan);
        employeeInfo.setMaBphan(maBoPhan);
        employeeInfo.setMaCDanh(maChucDanh);
        employeeInfo.setMaCVu(maChucvu);

        employeeInfo.setMaNV(maNV);
        employeeInfo.setSoThe(soThe);
        employeeInfo.setHoTen(hoTen);
        employeeInfo.setPhai(phai);
        employeeInfo.setNamSinh(namSinh);
        employeeInfo.setCmnd(cmnd);
        employeeInfo.setNgayCapCMND(ngayCapCMND);
        employeeInfo.setDcThuongTru(dcThuongTru);
        employeeInfo.setDtThuongTru(dtThuongTru);
        employeeInfo.setDcTamTru(dcTamTru);
        employeeInfo.setDtdd(dtdd);
        employeeInfo.setEmail(email);
        employeeInfo.setNgayVaoDoan(ngayVaoDoan);
        employeeInfo.setNgayVaoDang(ngayVaoDang);
        employeeInfo.setQuocTich(quocTich);
        employeeInfo.setPassport(passport);
        employeeInfo.setNgayCapCass(ngayCapPass);
        employeeInfo.setHonNhan(honNhan);
        employeeInfo.setMaSoThue(maSoThue);
        employeeInfo.setNgayCapMST(ngayCapMST);
        employeeInfo.setSoTK(soTK);
        employeeInfo.setMaTK(maTK);
        employeeInfo.setHocHam(hocHam);
        employeeInfo.setChuyenMon(chuyenMon);
        employeeInfo.setKnlvNam(knlvNam);
        employeeInfo.setKnlvThang(knlvThang);
        employeeInfo.setNgayVao(ngayVao);
        employeeInfo.setNgayHet(ngayHet);
        employeeInfo.setNgayChinhThuc(ngayChinhThuc);
        employeeInfo.setLuongCB(luongCB);
        employeeInfo.setLuongTV(luongTV);
        employeeInfo.setLuongKD(luongKD);
        employeeInfo.setHinh(hinh);

        return employeeInfo;
    }

    public void detailEmployee() throws SQLException, ClassNotFoundException {
        setComboBox();
        Province maNS = new Province();
        Province maNCCM = new Province();
        Province maDDLV = new Province();
        Province maNCP = new Province();
        ethnic = new Ethnic();
        religion = new Religion();
        bank = new Bank();
        typeEmp = new TypeEmp();
        degree = new Degree();
        certificate = new Certificate();
        unitWork = new UnitWork();
        room = new Room();
        department = new Department();
        title = new Title();
        position = new Position();

        maNS.setProvinceID(empDetail.getMaNoiSinh());
        cbxNoiSinh.setSelectedItem(maNS);

        maNCP.setProvinceID(empDetail.getMaNoiCapPass());
        cbxMaNoiCapPass.setSelectedItem(maNCP);

        maNCCM.setProvinceID(empDetail.getMaNoiSinh());
        cbxNoiCapCM.setSelectedItem(maNCCM);

        maDDLV.setProvinceID(empDetail.getMaNoiSinh());
        cbxDDLV.setSelectedItem(maDDLV);

        ethnic.setEthnicID(empDetail.getMaDToc());
        cbxDanToc.setSelectedItem(ethnic);

        religion.setReligionID(empDetail.getMaTGiao());
        cbxTonGiao.setSelectedItem(religion);

        bank.setBankID(empDetail.getMaNH());
        cbxNganHang.setSelectedItem(bank);

        typeEmp.setTypeID(empDetail.getMaLNV());
        cbxLoaiNV.setSelectedItem(typeEmp);

        degree.setDegreeID(empDetail.getMaTDo());
        cbxTrinhDo.setSelectedItem(degree);

        certificate.setCertificateID(empDetail.getMaBC());
        cbxBangCap.setSelectedItem(certificate);

        unitWork.setUnitID(empDetail.getMaDvi());
        cbxDonVi.setSelectedItem(unitWork);

        room.setRoomID(empDetail.getMaPBan());
        cbxPhongBan.setSelectedItem(room);

        department.setDepartmentID(empDetail.getMaBphan());
        cbxBoPhan.setSelectedItem(department);

        title.setTitleID(empDetail.getMaCDanh());
        cbxChucDanh.setSelectedItem(title);

        position.setPositionID(empDetail.getMaCVu());
        cbxChucVu.setSelectedItem(position);

        //Set Text
        txtMaNV.setText(empDetail.getMaNV());
        txtSoThe.setText(empDetail.getSoThe());
        txtHoTen.setText(empDetail.getHoTen());
        cbxPhai.setSelectedItem(empDetail.getPhai());
        txtNamSinh.setText(String.valueOf(empDetail.getNamSinh()));
        txtCMND.setText(empDetail.getCmnd());
        txtNgayCapCMND.setText(String.valueOf(empDetail.getNgayCapCMND()));
        txtDCThuongTru.setText(empDetail.getDcThuongTru());
        txtDTTT.setText(String.valueOf(empDetail.getDtThuongTru()));
        txtDCTamTru.setText(empDetail.getDcTamTru());
        txtDTTT.setText(String.valueOf(empDetail.getDtdd()));
        txtEmail.setText(empDetail.getEmail());
        txtNgayVaoDoan.setText(String.valueOf(empDetail.getNgayVaoDoan()));
        txtNgayVaoDang.setText(String.valueOf(empDetail.getNgayVaoDang()));
        txtQuocTich.setText(empDetail.getQuocTich());
        txtPassport.setText(String.valueOf(empDetail.getPassport()));
        txtNgayCapPass.setText(String.valueOf(empDetail.getNgayCapCass()));
        cbxHonNhan.setSelectedItem(empDetail.getHonNhan());
        txtMaSoThue.setText(String.valueOf(empDetail.getMaSoThue()));
        txtNgayCapMST.setText(String.valueOf(empDetail.getNgayCapMST()));
        txtSoTK.setText(String.valueOf(empDetail.getSoTK()));
        txtMaTK.setText(empDetail.getMaTK());
        txtHocHam.setText(empDetail.getHocHam());
        txtChuyenMon.setText(empDetail.getChuyenMon());
        txtKNLVNam.setText(String.valueOf(empDetail.getKnlvNam()));
        txtKNLVThang.setText(String.valueOf(empDetail.getKnlvThang()));
        txtNgayVaoCT.setText(String.valueOf(empDetail.getNgayVao()));
        txtNgayHetHanTV.setText(String.valueOf(empDetail.getNgayHet()));
        txtNgayChinhThuc.setText(String.valueOf(empDetail.getNgayChinhThuc()));
        txtLuongTV.setText(String.valueOf(empDetail.getLuongTV()));
        txtLuongCB.setText(String.valueOf(empDetail.getLuongCB()));
        txtLuongKD.setText(String.valueOf(empDetail.getLuongKD()));
    }

    public void setComboBox() {
        try {
            proList = cbll.readProvince();
            ethnicList = cbll.readEthnic();
            religionList = cbll.readReligion();
            bankList = cbll.readBank();
            typeEmpList = cbll.readTypeEmp();
            degreeList = cbll.readDegree();
            certificateList = cbll.readCertificate();
            unitWorkList = cbll.readUnitWork();
            roomList = cbll.readRoom();
            departmentList = cbll.readDepartment();
            titleList = cbll.readTitle();
            positionList = cbll.readPosition();

            DefaultComboBoxModel cbNS = new DefaultComboBoxModel(proList.toArray(new Province[0]));
            cbxNoiSinh.setModel(cbNS);

            DefaultComboBoxModel cbNCCM = new DefaultComboBoxModel(proList.toArray(new Province[0]));
            cbxNoiCapCM.setModel(cbNCCM);

            DefaultComboBoxModel cbNCPASS = new DefaultComboBoxModel(proList.toArray(new Province[0]));
            cbxMaNoiCapPass.setModel(cbNCPASS);

            DefaultComboBoxModel cbDDLV = new DefaultComboBoxModel(proList.toArray(new Province[0]));
            cbxDDLV.setModel(cbDDLV);
            DefaultComboBoxModel cbNH = new DefaultComboBoxModel(bankList.toArray(new Bank[0]));
            cbxNganHang.setModel(cbNH);

            DefaultComboBoxModel cbDT = new DefaultComboBoxModel(ethnicList.toArray(new Ethnic[0]));
            cbxDanToc.setModel(cbDT);

            DefaultComboBoxModel cbTG = new DefaultComboBoxModel(religionList.toArray(new Religion[0]));
            cbxTonGiao.setModel(cbTG);

            DefaultComboBoxModel cbTD = new DefaultComboBoxModel(degreeList.toArray(new Degree[0]));
            cbxTrinhDo.setModel(cbTD);

            DefaultComboBoxModel cbBC = new DefaultComboBoxModel(certificateList.toArray(new Certificate[0]));
            cbxBangCap.setModel(cbBC);

            DefaultComboBoxModel cbLNV = new DefaultComboBoxModel(typeEmpList.toArray(new TypeEmp[0]));
            cbxLoaiNV.setModel(cbLNV);

            DefaultComboBoxModel cbDV = new DefaultComboBoxModel(unitWorkList.toArray(new UnitWork[0]));
            cbxDonVi.setModel(cbDV);

            DefaultComboBoxModel cbPB = new DefaultComboBoxModel(roomList.toArray(new Room[0]));
            cbxPhongBan.setModel(cbPB);

            DefaultComboBoxModel cbBP = new DefaultComboBoxModel(departmentList.toArray(new Department[0]));
            cbxBoPhan.setModel(cbBP);

            DefaultComboBoxModel cbCD = new DefaultComboBoxModel(titleList.toArray(new Title[0]));
            cbxChucDanh.setModel(cbCD);

            DefaultComboBoxModel cbCV = new DefaultComboBoxModel(positionList.toArray(new Position[0]));
            cbxChucVu.setModel(cbCV);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNew = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btPrint = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        panelAddEm = new javax.swing.JPanel();
        panelBasicInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxPhai = new javax.swing.JComboBox<>();
        txtCMND = new javax.swing.JTextField();
        txtSoTK = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassport = new javax.swing.JTextField();
        cbxDanToc = new javax.swing.JComboBox<>();
        cbxHonNhan = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNgayCapPass = new javax.swing.JTextField();
        txtMaSoThue = new javax.swing.JTextField();
        txtMaTK = new javax.swing.JTextField();
        cbxTonGiao = new javax.swing.JComboBox<>();
        txtNgayVaoDoan = new javax.swing.JTextField();
        txtNgayCapCMND = new javax.swing.JTextField();
        txtNamSinh = new javax.swing.JTextField();
        txtSoThe = new javax.swing.JTextField();
        txtDCTamTru = new javax.swing.JTextField();
        txtDCThuongTru = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDTTT = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        cbxNoiSinh = new javax.swing.JComboBox<>();
        cbxNoiCapCM = new javax.swing.JComboBox<>();
        txtDD = new javax.swing.JTextField();
        txtNgayVaoDang = new javax.swing.JTextField();
        txtNgayCapMST = new javax.swing.JTextField();
        btnChonTep = new javax.swing.JButton();
        labelLink = new javax.swing.JLabel();
        cbxNganHang = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        txtQuocTich = new javax.swing.JTextField();
        cbxMaNoiCapPass = new javax.swing.JComboBox<>();
        panelBangCap = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtChuyenMon = new javax.swing.JTextField();
        cbxTrinhDo = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cbxBangCap = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtHocHam = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtKNLVNam = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtKNLVThang = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        panelNgayVaoLAm = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cbxLoaiNV = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        txtNgayChinhThuc = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtNgayVaoCT = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtNgayHetHanTV = new javax.swing.JTextField();
        panelNoiLV = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cbxChucDanh = new javax.swing.JComboBox<>();
        cbxDonVi = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        cbxPhongBan = new javax.swing.JComboBox<>();
        cbxChucVu = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        cbxDDLV = new javax.swing.JComboBox<>();
        cbxBoPhan = new javax.swing.JComboBox<>();
        panelLuongNV = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtLuongTV = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtLuongCB = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtLuongKD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btNew.setText("Thêm");
        btNew.setPreferredSize(new java.awt.Dimension(75, 23));
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btEdit.setText("Sửa");
        btEdit.setPreferredSize(new java.awt.Dimension(75, 23));
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setText("Xóa");
        btDelete.setPreferredSize(new java.awt.Dimension(75, 23));

        btPrint.setText("In");
        btPrint.setPreferredSize(new java.awt.Dimension(75, 23));

        btClose.setText("Thoát");
        btClose.setPreferredSize(new java.awt.Dimension(75, 23));
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btSave.setText("Ghi");
        btSave.setPreferredSize(new java.awt.Dimension(75, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setText("Hủy");
        btCancel.setPreferredSize(new java.awt.Dimension(75, 23));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        panelBasicInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Thông tin cá nhân");

        jLabel1.setText("Mã NV*");

        jLabel3.setText("Phái*");

        jLabel5.setText("CMND*");

        jLabel4.setText("Đia chỉ thường trú");

        jLabel6.setText("Địa chỉ tạm trú");

        jLabel7.setText("Email");

        jLabel8.setText("Dân Tộc*");

        jLabel9.setText("Passport");

        jLabel10.setText("Tình trạng hôn nhân*");

        jLabel11.setText("Số tài khoản");

        cbxPhai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        txtCMND.setText("03428974");

        txtSoTK.setText("0");

        txtPassport.setText("0");

        cbxHonNhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độc thân", "Đã có gia đình" }));

        jLabel12.setText("Số thẻ");

        jLabel13.setText("Năm sinh*");

        jLabel14.setText("Ngày cấp CMND*");

        jLabel15.setText("Ngày vào đoàn");

        jLabel16.setText("Tôn giáo*");

        jLabel17.setText("Ngày cấp passport");

        jLabel18.setText("Mã số thuế");

        jLabel19.setText("Mã tài khoản");

        txtNgayCapPass.setText("1900-01-01");

        txtMaSoThue.setText("0");

        txtNgayVaoDoan.setText("1900-01-01");

        txtNgayCapCMND.setText("1900-01-01");

        txtNamSinh.setText("1900");

        jLabel20.setText("Họ tên*");

        jLabel21.setText("Nơi sinh*");

        jLabel22.setText("Nơi cấp CMND*");

        jLabel23.setText("Điện thoại thường trú");

        jLabel24.setText("Di động");

        jLabel25.setText("Ngày váo Đảng");

        jLabel26.setText("Quốc tịch");

        jLabel27.setText("Nơi cấp Passport");

        jLabel28.setText("Ngày cấp MST");

        jLabel29.setText("Ngân Hàng");

        txtDTTT.setText("0");

        txtDD.setText("0");

        txtNgayVaoDang.setText("1900-01-01");

        txtNgayCapMST.setText("1900-01-01");

        btnChonTep.setText("Chọn tệp");
        btnChonTep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonTepActionPerformed(evt);
            }
        });

        labelLink.setText("Không có tệp được chọn");

        txtQuocTich.setText("Việt Nam");

        javax.swing.GroupLayout panelBasicInfoLayout = new javax.swing.GroupLayout(panelBasicInfo);
        panelBasicInfo.setLayout(panelBasicInfoLayout);
        panelBasicInfoLayout.setHorizontalGroup(
            panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(txtNgayCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                                .addComponent(txtSoTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(cbxPhai, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoThe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamSinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(cbxDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayVaoDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(cbxHonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSoThue)
                                    .addComponent(txtNgayCapPass, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addComponent(txtDCTamTru)
                            .addComponent(txtDCThuongTru)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxNganHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDTTT)
                                        .addComponent(txtHoTen)
                                        .addComponent(cbxNoiSinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxNoiCapCM, 0, 130, Short.MAX_VALUE)
                                        .addComponent(txtDD)
                                        .addComponent(txtNgayVaoDang)
                                        .addComponent(txtNgayCapMST)
                                        .addComponent(txtQuocTich))
                                    .addComponent(cbxMaNoiCapPass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                                        .addComponent(btnChonTep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLink)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBasicInfoLayout.setVerticalGroup(
            panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBasicInfoLayout.createSequentialGroup()
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtSoThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxPhai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(cbxNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtNgayCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(cbxNoiCapCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDCThuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtDTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDCTamTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txtDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtNgayVaoDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtNgayVaoDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cbxTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(txtQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtNgayCapPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(btnChonTep)
                    .addComponent(labelLink)
                    .addComponent(cbxMaNoiCapPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxHonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSoThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel28)
                    .addComponent(txtNgayCapMST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(cbxNganHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBangCap.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 51));
        jLabel30.setText("Bằng cấp - kinh nghiệm");

        jLabel31.setText("Trình độ*");

        jLabel32.setText("Chuyên môn");

        jLabel33.setText("Bằng cấp*");

        jLabel34.setText("Học Hàm");

        jLabel35.setText("KNLV");

        txtKNLVNam.setText("0");

        jLabel36.setText("năm");

        txtKNLVThang.setText("0");

        jLabel37.setText("tháng");

        javax.swing.GroupLayout panelBangCapLayout = new javax.swing.GroupLayout(panelBangCap);
        panelBangCap.setLayout(panelBangCapLayout);
        panelBangCapLayout.setHorizontalGroup(
            panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBangCapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(panelBangCapLayout.createSequentialGroup()
                        .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBangCapLayout.createSequentialGroup()
                                .addComponent(cbxTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxBangCap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtChuyenMon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHocHam, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBangCapLayout.createSequentialGroup()
                                .addComponent(txtKNLVNam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKNLVThang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBangCapLayout.setVerticalGroup(
            panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBangCapLayout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cbxTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(cbxBangCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtHocHam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtChuyenMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBangCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel35)
                        .addComponent(txtKNLVNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(txtKNLVThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        panelNgayVaoLAm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 51));
        jLabel38.setText("Ngày vào làm");

        jLabel39.setText("Loại nhân viên");

        jLabel40.setText("Ngày vào chính thức");

        txtNgayChinhThuc.setText("1900-01-01");

        jLabel41.setText("Ngày vào công ty*");

        txtNgayVaoCT.setText("1900-01-01");

        jLabel42.setText("Ngày hết hạn thử việc");

        txtNgayHetHanTV.setText("1900-01-01");

        javax.swing.GroupLayout panelNgayVaoLAmLayout = new javax.swing.GroupLayout(panelNgayVaoLAm);
        panelNgayVaoLAm.setLayout(panelNgayVaoLAmLayout);
        panelNgayVaoLAmLayout.setHorizontalGroup(
            panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNgayVaoLAmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(panelNgayVaoLAmLayout.createSequentialGroup()
                        .addGroup(panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayChinhThuc)
                            .addComponent(cbxLoaiNV, 0, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayVaoCT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayHetHanTV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNgayVaoLAmLayout.setVerticalGroup(
            panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNgayVaoLAmLayout.createSequentialGroup()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cbxLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtNgayVaoCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtNgayHetHanTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNgayVaoLAmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtNgayChinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        panelNoiLV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 102, 51));
        jLabel43.setText("Nơi làm việc");

        jLabel44.setText("Đơn vị*");

        jLabel45.setText("Chức danh*");

        jLabel46.setText("Phòng ban*");

        jLabel47.setText("Chức vụ*");

        jLabel48.setText("Bộ phận");

        jLabel49.setText("Địa điểm làm việc");

        javax.swing.GroupLayout panelNoiLVLayout = new javax.swing.GroupLayout(panelNoiLV);
        panelNoiLV.setLayout(panelNoiLVLayout);
        panelNoiLVLayout.setHorizontalGroup(
            panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoiLVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(panelNoiLVLayout.createSequentialGroup()
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44))
                        .addGap(18, 18, 18)
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxChucDanh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxDonVi, 0, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxPhongBan, 0, 149, Short.MAX_VALUE)
                            .addComponent(cbxChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel48))
                        .addGap(18, 18, 18)
                        .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxDDLV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxBoPhan, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNoiLVLayout.setVerticalGroup(
            panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoiLVLayout.createSequentialGroup()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(cbxDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(cbxPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(cbxBoPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelNoiLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(cbxChucDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(cbxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(cbxDDLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelLuongNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 102, 51));
        jLabel50.setText("Lương nhân viên");

        jLabel51.setText("Lương thử việc*");

        txtLuongTV.setText("0");

        jLabel52.setText("Lương CB*");

        txtLuongCB.setText("0");

        jLabel53.setText("Lương KD*");

        txtLuongKD.setText("0");

        javax.swing.GroupLayout panelLuongNVLayout = new javax.swing.GroupLayout(panelLuongNV);
        panelLuongNV.setLayout(panelLuongNVLayout);
        panelLuongNVLayout.setHorizontalGroup(
            panelLuongNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuongNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLuongNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addGroup(panelLuongNVLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(txtLuongTV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(txtLuongKD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLuongNVLayout.setVerticalGroup(
            panelLuongNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLuongNVLayout.createSequentialGroup()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLuongNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtLuongTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtLuongKD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddEmLayout = new javax.swing.GroupLayout(panelAddEm);
        panelAddEm.setLayout(panelAddEmLayout);
        panelAddEmLayout.setHorizontalGroup(
            panelAddEmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddEmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddEmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLuongNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNgayVaoLAm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBangCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBasicInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNoiLV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAddEmLayout.setVerticalGroup(
            panelAddEmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddEmLayout.createSequentialGroup()
                .addComponent(panelBasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBangCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNgayVaoLAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNoiLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelAddEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAddEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        stateButton(false);
    }//GEN-LAST:event_btNewActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        stateButton(true);
        try {
            ebll.addEmployee(insertEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        stateButton(false);
    }//GEN-LAST:event_btEditActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        stateButton(true);// TODO add your handling code here:
    }//GEN-LAST:event_btCancelActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void btnChonTepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonTepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChonTepActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            if (isDetail) {
                detailEmployee();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btnChonTep;
    private javax.swing.JComboBox<String> cbxBangCap;
    private javax.swing.JComboBox<String> cbxBoPhan;
    private javax.swing.JComboBox<String> cbxChucDanh;
    private javax.swing.JComboBox<String> cbxChucVu;
    private javax.swing.JComboBox<String> cbxDDLV;
    private javax.swing.JComboBox<String> cbxDanToc;
    private javax.swing.JComboBox<String> cbxDonVi;
    private javax.swing.JComboBox<String> cbxHonNhan;
    private javax.swing.JComboBox<String> cbxLoaiNV;
    private javax.swing.JComboBox<String> cbxMaNoiCapPass;
    private javax.swing.JComboBox<String> cbxNganHang;
    private javax.swing.JComboBox<String> cbxNoiCapCM;
    private javax.swing.JComboBox<String> cbxNoiSinh;
    private javax.swing.JComboBox<String> cbxPhai;
    private javax.swing.JComboBox<String> cbxPhongBan;
    private javax.swing.JComboBox<String> cbxTonGiao;
    private javax.swing.JComboBox<String> cbxTrinhDo;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelLink;
    private javax.swing.JPanel panelAddEm;
    private javax.swing.JPanel panelBangCap;
    private javax.swing.JPanel panelBasicInfo;
    private javax.swing.JPanel panelLuongNV;
    private javax.swing.JPanel panelNgayVaoLAm;
    private javax.swing.JPanel panelNoiLV;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtChuyenMon;
    private javax.swing.JTextField txtDCTamTru;
    private javax.swing.JTextField txtDCThuongTru;
    private javax.swing.JTextField txtDD;
    private javax.swing.JTextField txtDTTT;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHocHam;
    private javax.swing.JTextField txtKNLVNam;
    private javax.swing.JTextField txtKNLVThang;
    private javax.swing.JTextField txtLuongCB;
    private javax.swing.JTextField txtLuongKD;
    private javax.swing.JTextField txtLuongTV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSoThue;
    private javax.swing.JTextField txtMaTK;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtNgayCapCMND;
    private javax.swing.JTextField txtNgayCapMST;
    private javax.swing.JTextField txtNgayCapPass;
    private javax.swing.JTextField txtNgayChinhThuc;
    private javax.swing.JTextField txtNgayHetHanTV;
    private javax.swing.JTextField txtNgayVaoCT;
    private javax.swing.JTextField txtNgayVaoDang;
    private javax.swing.JTextField txtNgayVaoDoan;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JTextField txtQuocTich;
    private javax.swing.JTextField txtSoTK;
    private javax.swing.JTextField txtSoThe;
    // End of variables declaration//GEN-END:variables
}
