package Apotek;

public class Apotek {

    private String nama;
    private String alamat;
    private String[] obat;
    private int[] jumlah;
    private int[] harga;
    private String line = "========================================";

    public Apotek() {
    }

    public Apotek(String[] obat, int[] harga) {
        this.obat = obat;
        this.harga = harga;
    }

    public void daftarHarga() {
        System.out.println(line);
        System.out.println("\t DRUG \t\t PRICE");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("\t%s\t\t %d\n", obat[i], harga[i]);
        }
        System.out.println(line);
    }
    
    public void id(String nama, String alamat){
        System.out.println("Patient name          : " + nama);
        System.out.println("Patient address       : " + alamat);
    }
    
    public void daftarHarga(String[] obat, int[] jumlah) {
        int i, j, k;
        int l = 0;
        int TOTAL = 0;
        System.out.println("DRUG \t\t QTY \t PRICE \t TOTAL");
        System.out.println(line);
        for (i = 0; i < obat.length; i++, l++) {
            if (jumlah[i] == 0) {
                continue;
            }
            for (k = 0; k < obat.length; k++) {
                if (obat[l].equalsIgnoreCase(this.obat[k])) {
                    int TOT = jumlah[i] * harga[k];
                    System.out.printf("%s\t\t %d\t %d\t %d", this.obat[k], jumlah[i], harga[k], TOT);
                    TOTAL += TOT;
                }
            }
        }
        System.out.println("\n"+line);
        System.out.println("\t\t\t\t " + TOTAL);
        System.out.println(line);
    }
}
