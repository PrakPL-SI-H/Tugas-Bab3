
public class Apotek {

    public String nama;
    public String alamat;
    public String[] obat;
    public int[] harga;

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Apotek(String[] obat, int[] harga) {
        this.obat = obat;
        this.harga = harga;
    }

    public void listHarga() {
        System.out.println("OBAT | HARGA");
        for (int i = 0; i < obat.length; i++) {
            System.out.printf("%2s%10d\n", obat[i], harga[i]);
        }
    }

    public void cetakBio() {
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Alamat: " + alamat);
    }

    public void listHarga(String[] item, int[] jumlah) {
        int i, j = 0, k;
        int total = 0;
        System.out.println("------------------------------");
        System.out.printf("%s\t%s\t%s\t%s\n", "Obat", "Jumlah", "Harga", "Total");
        for (i = 0; i < obat.length; i++, j++) {
            if (jumlah[i] == 0) {
                continue;
            }
            for (k = 0; k < obat.length; k++) {
                if (obat[k].equalsIgnoreCase(item[j])) {
                    int tot = jumlah[i] * harga[k];
                    System.out.printf("%s\t%d\t%d\t%d\n", obat[k], jumlah[i], harga[k], tot);
                    total += tot;
                }
            }
        }
        System.out.println("------------------------------");
        System.out.println("Total Pembayaran:\t" + total);
        System.out.println("------------------------------");
    }
}
