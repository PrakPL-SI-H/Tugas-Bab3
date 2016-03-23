package mainapotek;
public class Apotek {

    String nama, alamat;
    int menu, banyak;
    private static int total = 0;

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }