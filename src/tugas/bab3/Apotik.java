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
        System.out.println("\t NAMA \t\t HARGA");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("\t%s\t\t %d\n", obat[i], harga[i]);
        }
        System.out.println("====================================");
    }

    public void id(String nama, String alamat) {
        System.out.println("Nama Pasien          : " + nama);
        System.out.println("Alamat               : " + alamat);
    }

    public void daftarHarga(String[] obat, int[] jumlah) {
        int i, j, k;
        int l = 0;
        int TOTAL = 0;
        System.out.println("NAMA \t\t JUMLAH \t HARGA \t TOTAL");
        System.out.println("================================");
        for (i = 0; i < obat.length; i++, l++) {
            if (jumlah[i] == 0) {
                continue;
            }
            for (k = 0; k < obat.length; k++) {
                if (obat[l].equalsIgnoreCase(this.obat[k])) {
                    int TOT = jumlah[i] * harga[k];
                    System.out.printf("%s\t  \t %d  \t   %d  \t  %d", this.obat[k], jumlah[i], harga[k], TOT);
                    TOTAL += TOT;
                }
            }
        }
        System.out.println("\n" + "==================");
        System.out.println("TOTAL : Rp." + TOTAL);
        System.out.println("==================");
    }
}
