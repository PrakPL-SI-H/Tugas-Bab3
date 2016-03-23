
public class Apotek {

    public String nama;
    public String alamat;
    public String[] obat;
    public int[] jumlah;
    public int[] harga;

    public Apotek() {

    }

    public Apotek(String[] obat, int[] harga) {
        this.obat = obat;
        this.harga = harga;
    }
    
    public void daftarHarga() {       
        System.out.println("OBAT \t\t HARGA");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("%s\t\t %d\n", obat[i], harga[i]);
        }        
    }
    
    public void dataKonsumen(String nama, String alamat){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat pasien: " + alamat);
    }
    
    public void daftarHarga(String[] obat, int[] jumlah) {
        int i, j, k;
        int l = 0;
        int TOTAL = 0;
        System.out.println("OBAT \t\t JML \t HARGA \t TOTAL");        
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
        System.out.println("\t\t\t\t " + TOTAL); 
        
    }
}
