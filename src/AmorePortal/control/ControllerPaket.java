/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AmorePortal.control;

import AmorePortal.model.ModelPaket;
import AmorePortal.util.APConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Muhamad Eka Pangestu
 */
public class ControllerPaket {
    public void dataPaket(ModelPaket paket){
        Connection con = APConnection.getConnection();
        
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM paket ");
            paket.setNamaPaket(rs.getString("nama_paket"));
            paket.setHarga(rs.getInt("harga"));
        } catch (Exception e) {
        }
    }
    
}
