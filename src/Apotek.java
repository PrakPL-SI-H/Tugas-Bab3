package PraktikumSIH;
import java.util.Scanner;
public class Apotek {
    Scanner in = new Scanner(System.in);
    String nama, alamat;
    String namaObat[] = {"Antimo", "Promag", "Tolak Angin", "Dulcolax", "Enervon C"};
    int hargaObat[] = {6000, 8000, 12000, 5500, 18000};
    int pesanan[] = new int[5], jumlah[] = new int[5];
    int total;
    public Apotek (String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public void lihatDaftar() {
        System.out.println("Daftar Obat : ");
        System.out.println("Nama Obat\tHarga Obat");
        for (int i = 0; i <= 4; i++) {
            System.out.println((i + 1) + ". " + namaObat[i] + " \tRp." + hargaObat[i]);
        }
        System.out.println("--------------------------------");
    }
    public void beliObat() {
        System.out.print("Pilihan Obat : ");
        int pilih = in.nextInt();
        System.out.print("Jumlah Item  : ");
        int jumlah = in.nextInt();
        if(pilih==1){
          total = hargaObat[0] * jumlah;
        } else if (pilih==2){
          total = hargaObat[1] * jumlah;
        } else if (pilih==3){
          total = hargaObat[2] * jumlah;
        } else if (pilih==4){
          total = hargaObat[3] * jumlah;
        } else if (pilih==5){
          total = hargaObat[4] * jumlah;
        }
    }
    public void tampilPesanan() {
        System.out.println("--------------------------------");
        System.out.println("          PESANAN OBAT         ");
        System.out.println("Atas nama " + nama);
        System.out.println("Yang beralamat di " + alamat);
        System.out.println("Total pembelian : Rp. "+ total);
    }
}