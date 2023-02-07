package kasus1;

/**
 *
 * @author aulaw
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stk;
    }

    public void addStok(int amount) {
        this.stok += amount;
    }

    public int getStok() {
        return this.stok;
    }
}

