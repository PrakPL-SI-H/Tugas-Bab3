package Apotek;

public class Apotek {

    private String nama;
    private String alamat;
    private String[] obat = {"Panadol", "Vitamin", "Amoxylin", "Paramex", "Milanta", "Diapet"};
    private int[] jumlah = new int[20];
    private int[] harga = {90000, 50000, 30000, 90000, 50000, 30000};
    private String line = "========================================";

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Apotek(String[] obat, int[] harga) {
        this.obat = obat;
        this.harga = harga;
    }

    public void daftarHarga() {
        System.out.println(line);
        System.out.println("tNama Obat \t\t PRICE");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("\t%10s \t %d\n", obat[i], harga[i]);
        }
        System.out.println(line);
    }

    public void daftarHarga(String[] obat, int[] jumlah) {
        int i, j, k;
        int l = 0;
        int TOTAL = 0;
        System.out.println(line);
        System.out.println("\tObat \t\t QTY \t PRICE \t TOTAL");
        for (i = 0; i < obat.length; i++, l++) {
            if (jumlah[i] == 0) {
                continue;
            }
            for (k = 0; k < obat.length; k++) {
                int TOT = jumlah[i] + harga[k];
                System.out.printf("\n\t%-1d  \t%-1s \t %-1d \t %-3d   %-3d", obat[k], jumlah[i], harga[k], TOT);
                TOTAL += TOT;
            }
        }
        System.out.println(line);
        System.out.println("\t\t\t\t\t\t\t " + TOTAL);
    }
}
