/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AmorePortal.model;

/**
 *
 * @author Muhamad Eka Pangestu
 */
public class ModelPembayaran {
    private int idPembayaran;
    private int pembayaran;
    private int sisa;
    private int total;
    private int idPemesanan;
    private String namaPaket;

    public ModelPembayaran() {
    }

    public ModelPembayaran(int idPembayaran, int pembayaran, int sisa, int total, int idPemesanan, String namaPaket) {
        this.idPembayaran = idPembayaran;
        this.pembayaran = pembayaran;
        this.sisa = sisa;
        this.total = total;
        this.idPemesanan = idPemesanan;
        this.namaPaket = namaPaket;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public int getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getSisa() {
        return sisa;
    }

    public void setSisa(int sisa) {
        this.sisa = sisa;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }
    
    
}
