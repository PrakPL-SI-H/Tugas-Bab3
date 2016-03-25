package No2;

public class Obat {

    private String daftarobat[][] = {{"Paracetamol", "OBT1"}, {"Mefinal", "OBT2"}, {"Entro Stop", "OBT3",}, {"Obat Galau", "OBT4"}};
    private int hargaobat[] = {10000, 15000, 6000, 22000};
    private String obatpilih[] = new String[4];
    private int banyakobat[] = new int[4];
    private int totharga;
    static private int jumobat;

    public void showDaftar() {
        System.out.println("\t DAFTAR OBAT");
        System.out.println("No Kode  Nama Obat\t\tHarga");
        for (int i = 0; i < daftarobat.length; i++) {
            System.out.printf("%-3d%-6s%-23s%d\n", (i + 1), daftarobat[i][1], daftarobat[i][0], hargaobat[i]);
        }
    }

    public void pilihObat(String kode, int banyakobat) {
        for (int i = 0; i < daftarobat.length; i++) {
            if (kode.equalsIgnoreCase(daftarobat[i][1])) {
                obatpilih[i] = daftarobat[i][0];
                this.banyakobat[i] = banyakobat;
                totharga = banyakobat * hargaobat[i];
            }
        }
        jumobat++;
    }

    public void showBayar(String nama, String alamat) {
        System.out.println("\t Apotek Lekas Sembuh");
        System.out.println("Nama   = " + nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < obatpilih.length; i++) {
            if (banyakobat[i] != 0) {
                System.out.printf("%-20sX%d\n", obatpilih[i], banyakobat[i]);
            }
        }
        System.out.println("Jumlah Obat  = " + jumobat);
        System.out.println("Jumlah Bayar = " + totharga);
    }
}
