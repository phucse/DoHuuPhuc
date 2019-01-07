/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import ims.objects.Province;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sieut
 */
public class ProvinceDAL extends Database {

    public ArrayList<Province> readProvince() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement stm = null;
        ArrayList<Province> provinceList = new ArrayList<Province>();

        conn = getConnection();
        stm = conn.createStatement();
        String sql = "Select MaTT, TenTT FROM tinhthanh";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Province province = new Province();
            province.setProvinceID(rs.getInt("MaTT"));
            province.setProvinceName(rs.getString("TenTT"));
            provinceList.add(province);
        }

        return provinceList;

    }

}
