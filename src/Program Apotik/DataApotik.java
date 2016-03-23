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

    public void olahData(int arr) { //Overloading Method parameter int arr
        System.out.println("       "+(arr + 1) + "." + list[arr] + "      Rp." + harga[arr]);

    }

    public void olahData(String a, int b) { //Overloading method parameter
        this.nama = a;                      //  String a dan integer b
        this.jum = b;
        if (nama.equals("ObatH5N1")) {

            total = harga[0] * jum;
        } else if (nama.equals("ObatH222")) {

            total = harga[1] * jum;
        } else if (nama.equals("Obat5W1H")) {

            total = harga[2] * jum;
        } else if (nama.equals("ObatK2K3")) {

            total = harga[3] * jum;
        } else if (nama.equals("ObatXXXX")) {

            total = harga[4] * jum;
        }
        else{
            System.out.println("MAAF OBAT BELUM TERSEDIA!");
        }
    }

    public void outputProgram() {
        System.out.println(" =========================================");
        System.out.println("   Jenis Obat Yang Anda Beli :" + nama );
        System.out.println("   Dengan Jumlah Obat        :" + jum);
        System.out.println("   Maka Total Bayar Anda     :Rp." + total);
        System.out.println(" =========================================");

    }

}
