package bab3sistemapotik;

public class DataApotik {

    public String nama, user, alamat, obat;
    public int[] harga;
    public String[] list, pilObat;
    public int jum, total;

    public DataApotik() {

    }

    public DataApotik(String a, String b) {
        this.user = a;
        this.alamat = b;
    }

    public DataApotik(String[] a, int[] b) {
        this.list = a;
        this.harga = b;
    }

    

}
