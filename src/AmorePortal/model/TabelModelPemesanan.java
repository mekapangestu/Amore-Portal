/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmorePortal.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wulan Purwanti
 */
public class TabelModelPemesanan extends AbstractTableModel {

    private List<ModelPemesanan> PemesananList;

    private String[] header = {"Kode Pemesanan", "Nama", "Alamat", "Tanggal Prawed", "Tanggal Wedding", "Paket"};

    public TabelModelPemesanan() {
    }

    public TabelModelPemesanan(List<ModelPemesanan> PemesananList) {
        this.PemesananList = PemesananList;
    }

    public List<ModelPemesanan> getPemesananList() {
        return PemesananList;
    }

    public void setPemesananList(List<ModelPemesanan> PemesananList) {
        this.PemesananList = PemesananList;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    @Override
    public int getRowCount() {
        return PemesananList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return PemesananList.get(rowIndex).getId_pemesanan();
        } else if (columnIndex == 1) {
            return PemesananList.get(rowIndex).getNama_pemesan();
        } else if (columnIndex == 2) {
            return PemesananList.get(rowIndex).getAlamat();
        } else if (columnIndex == 3) {
            return PemesananList.get(rowIndex).getTanggal_prawed();
        } else if (columnIndex == 4) {
            return PemesananList.get(rowIndex).getTanggal_wed();
        } else if (columnIndex == 5) {
            return PemesananList.get(rowIndex).getPaket();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
}
