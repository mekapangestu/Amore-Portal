/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmorePortal.model;

import java.sql.Date;

/**
 *
 * @author Wulan Purwanti
 */
public class ModelPemesanan {

    private int id_pemesanan;
    private String nama_pemesan;
    private String alamat;
    private String no_hp;
    private String nama_paket;
    private Date tanggal_pemesanan;
    private String tempat_pelaksanaan;
    private Date tanggal_prawed;
    private Date tanggal_wed;

    public ModelPemesanan() {
    }

    public ModelPemesanan(int id_pemesanan, String nama_pemesan, String alamat, String no_hp, String nama_paket, Date tanggal_pemesanan, String tempat_pelaksanaan, Date tanggal_prawed, Date tanggal_wed) {
        this.id_pemesanan = id_pemesanan;
        this.nama_pemesan = nama_pemesan;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.nama_paket = nama_paket;
        this.tanggal_pemesanan = tanggal_pemesanan;
        this.tempat_pelaksanaan = tempat_pelaksanaan;
        this.tanggal_prawed = tanggal_prawed;
        this.tanggal_wed = tanggal_wed;
    }

    public int getId_pemesanan() {
        return id_pemesanan;
    }

    public void setId_pemesanan(int id_pemesanan) {
        this.id_pemesanan = id_pemesanan;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getPaket() {
        return nama_paket;
    }

    public void setPaket(String nama_paket) {
        this.nama_paket = nama_paket;
    }

    public Date getTanggal_pemesanan() {
        return tanggal_pemesanan;
    }

    public void setTanggal_pemesanan(Date tanggal_pemesanan) {
        this.tanggal_pemesanan = tanggal_pemesanan;
    }

    public String getTempat_pelaksanaan() {
        return tempat_pelaksanaan;
    }

    public void setTempat_pelaksanaan(String tempat_pelaksanaan) {
        this.tempat_pelaksanaan = tempat_pelaksanaan;
    }

    public Date getTanggal_prawed() {
        return tanggal_prawed;
    }

    public void setTanggal_prawed(Date tanggal_prawed) {
        this.tanggal_prawed = tanggal_prawed;
    }

    public Date getTanggal_wed() {
        return tanggal_wed;
    }

    public void setTanggal_wed(Date tanggal_wed) {
        this.tanggal_wed = tanggal_wed;
    }

}
