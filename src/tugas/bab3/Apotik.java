package Praktikum3;

public class Apotik {

    private String nama;
    private String alamat;
    private String[] obat;
    private int[] jumlah;
    private int[] harga;

    public Apotik() {
    }

    public Apotik(String[] obat, int[] harga) {
        this.obat = obat;
        this.harga = harga;
    }

    public void daftarHarga() {
        System.out.println("====================================");
        System.out.println("\t DRUG \t\t PRICE");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("\t%s\t\t %d\n", obat[i], harga[i]);
        }
        System.out.println("====================================");
    }

}
