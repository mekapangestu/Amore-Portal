/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmorePortal.control;

import AmorePortal.model.ModelPembayaran;
import AmorePortal.util.APConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Muhamad Eka Pangestu
 */
public class ControllerPembayaran {

    public void simpanPembayaran(ModelPembayaran pembayaran) throws SQLException {
        Connection con = APConnection.getConnection();

        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO pembayaran values (?,?,?,?,?,?)");
            st.setInt(1, pembayaran.getIdPembayaran());
            st.setInt(2, pembayaran.getPembayaran());
            st.setInt(3, pembayaran.getSisa());
            st.setInt(4, pembayaran.getTotal());
            st.setInt(5, pembayaran.getIdPemesanan());
            st.setString(6, pembayaran.getNamaPaket());
            st.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
