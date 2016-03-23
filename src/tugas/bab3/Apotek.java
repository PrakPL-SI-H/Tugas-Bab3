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