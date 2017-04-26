/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmorePortal.control;

import AmorePortal.util.APConnection;
import AmorePortal.model.ModelUser;
import AmorePortal.view.FrameCS;
import AmorePortal.view.FrameKasir;
import AmorePortal.view.FrameLogin;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhamad Eka Pangestu
 */

public class ControllerLogin {

    public void validasiLogin(FrameLogin login) {
        String user = login.getUserText().getText();
        String pass = login.getPassText().getText();
        List<ModelUser> users = new ArrayList<>();

        boolean b = false;
        String tempPassword = "";

        if (user.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Username belum diisi");
            b = false;
        } else if (pass.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Password belum diisi");
            b = false;
        } else {
            String query = "SELECT id_user, username, password FROM user WHERE username = '" + user + "'";
            try {
                Statement statement = new APConnection().getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                //penampung objek
                ModelUser modelUser = new ModelUser();
                while (resultSet.next()) {
                    modelUser.setIdUser(resultSet.getInt("id_user"));
                    modelUser.setUsername(resultSet.getString("username"));
                    modelUser.setPassword(resultSet.getString("password"));
                    if (modelUser.getUsername().equals(user) && modelUser.getPassword().equals(pass)) {
                        if (modelUser.getUsername().equals("cs") && modelUser.getPassword().equals("cs123")) {
                            login.dispose();
                            JOptionPane.showMessageDialog(null, "Selamat datang Customer Service");
                            FrameCS frameCS = new FrameCS();
                            frameCS.setVisible(true);
                        } else if (modelUser.getUsername().equals("kasir") && modelUser.getPassword().equals("kasir123")) {
                            login.dispose();
                            JOptionPane.showMessageDialog(null, "Selamat datang Kasir");
                            FrameKasir fKasir = new FrameKasir();
                            fKasir.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Username dan Password salah");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
