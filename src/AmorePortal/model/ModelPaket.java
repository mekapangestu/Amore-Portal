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
public class ModelPaket {

    String namaPaket;
    int harga;

    public ModelPaket() {
    }

    public ModelPaket(String namaPaket, int harga) {
        this.namaPaket = namaPaket;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
