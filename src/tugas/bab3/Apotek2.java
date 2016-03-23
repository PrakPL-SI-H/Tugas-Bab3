package BAB3;

public class Apotek {

    private String nama, alamat;
    private String[] jenis = new String[5];
    private int[] harga = new int[5];
    private int[] jumlah = new int[5];
    private int total;
    private static int n = 0;

    public Apotek() {
        this.nama = "";
        this.alamat = "";
        this.total = 0;
    }

    public Apotek(String nama, String alamat, int total) {
        this.nama = nama;
        this.alamat = alamat;
        this.total = total;
    }

    public void obat(int obt, int jml) {
        switch (obt) {
            case 1:
                jenis[n] = "Amoxilin";
                harga[n] = 5000;
                jumlah[n] = jml;
                break;
            case 2:
                jenis[n] = "Antalgin";
                harga[n] = 3000;
                jumlah[n] = jml;
                break;
            case 3:
                jenis[n] = "Bodrex  ";
                harga[n] = 3000;
                jumlah[n] = jml;
                break;
            case 4:
                jenis[n] = "Actived ";
                harga[n] = 4000;
                jumlah[n] = jml;
                break;
            case 5:
                jenis[n] = "Promag  ";
                harga[n] = 6000;
                jumlah[n] = jml;
                break;
        }
        n++;
    }

    public void obat() {
        System.out.println("OBAT          JUMLAH        HARGA");
        for (int i = 0; i < n; i++) {
            int perharga = (jumlah[i] * harga[i]);
            System.out.println(jenis[i] + "         " + jumlah[i] + "          " + perharga);
            total += perharga;
        }
        System.out.println("\nTOTAL HARGA : Rp" + total);
    }

    public void listObat() {
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\t     DAFTAR OBAT");
        System.out.println("--------------------------------------------------------");;
        System.out.println("\t 1.\t Amoxilin        Rp5.000,-");
        System.out.println("\t 2.\t Antalgin        Rp3.000,-");
        System.out.println("\t 3.\t Bodrex          Rp3.000,-");
        System.out.println("\t 4.\t Actived         Rp4.000,-");
        System.out.println("\t 5.\t Promag          Rp6.000,-");
        System.out.println("--------------------------------------------------------");
    }
}
