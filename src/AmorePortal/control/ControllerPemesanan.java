/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmorePortal.control;

import AmorePortal.util.APConnection;
import AmorePortal.model.ModelPemesanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wulan Purwanti
 */
public class ControllerPemesanan {

    public List<ModelPemesanan> tampilData() throws SQLException {
        Connection con = APConnection.getConnection();

        List<ModelPemesanan> pemesananList;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id_pemesanan, nama_pemesan,alamat,tanggal_prawed,tanggal_wed,nama_paket from data_pemesanan");
            pemesananList = new ArrayList<>();
            while (rs.next()) {
                ModelPemesanan pesanan = new ModelPemesanan();
                pesanan.setId_pemesanan(rs.getInt("id_pemesanan"));
                pesanan.setNama_pemesan(rs.getString("nama_pemesan"));
                pesanan.setAlamat(rs.getString("alamat"));
                pesanan.setTanggal_prawed(rs.getDate("tanggal_prawed"));
                pesanan.setTanggal_wed(rs.getDate("tanggal_wed"));
                pesanan.setPaket(rs.getString("nama_paket"));

                pemesananList.add(pesanan);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return pemesananList;

    }

    public void tambahPemesanan(ModelPemesanan pemesanan) throws SQLException {
        Connection con = APConnection.getConnection();

        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO data_pemesanan values (?,?,?,?,?,?,?,?,?)");
            st.setInt(1, pemesanan.getId_pemesanan());
            st.setString(2, pemesanan.getNama_pemesan());
            st.setString(3, pemesanan.getAlamat());
            st.setString(4, pemesanan.getNo_hp());
            st.setString(5, pemesanan.getPaket());
            st.setDate(6, pemesanan.getTanggal_pemesanan());
            st.setString(7, pemesanan.getTempat_pelaksanaan());
            st.setDate(8, pemesanan.getTanggal_prawed());
            st.setDate(9, pemesanan.getTanggal_wed());

            st.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    

}
