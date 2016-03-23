package Bab3;
import java.util.Scanner;
public class Apotek {
    public static String nama, alamat;
    public static int jumlahjenis;
    public static int total = 0;
    public static int noobat[], jumlahobat[];
    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public Apotek(int no, int q) {
        if (no == 1) {
            System.out.println("Antimo\t x \t4000");
            totalHarga(4000, q);
        } else if (no == 2) {
            System.out.println("Bodrex\t x \t1500");
            totalHarga(1500, q);
        } else if (no == 3) {
            System.out.println("Diapet\t x \t1500");
            totalHarga(1500, q);
        } else if (no == 4) {
            System.out.println("Herocyn\t x \t5000");
            totalHarga(5000, q);
        } else if (no == 5) {
            System.out.println("Hufagrip\t x \t10000");
            totalHarga(10000, q);
        } else if (no == 6) {
            System.out.println("Komix\t x \t2000");
            totalHarga(2000, q);
        } else if (no == 7) {
            System.out.println("Laserin\t x \t9000");
            totalHarga(9000, q);
        } else if (no == 8) {
            System.out.println("Promag\t x \t3500");
            totalHarga(3500, q);
        } else if (no == 9) {
            System.out.println("Sangobion\t x \t4500");
            totalHarga(4500, q);
        } else if (no == 10) {
            System.out.println("Vegeta\t x \t1750");
            totalHarga(1750, q);
        } else {
            System.out.println("Pilihan Anda Tidak Ditemukan");
        }
    }
    public static void totalHarga(int harga, int qty) {
        total = total + (harga * qty);
        double h = Double.valueOf(harga);
        double q = Double.valueOf(qty);
        System.out.println("Jumlah\t = \t" + totalHarga(h, q));
        System.out.println("-------------------------------------------------------");
    }
    public static double totalHarga(double h, double q) {
        double totalharga = h * q;
        return totalharga;
    }
    public static void displayMessage() {
        System.out.println("                Apotek Brawijaya                  ");
        System.out.println("             Jl Veteran No 1 Malang               ");
        System.out.println("=======================================================");
        System.out.println("Nama Pembeli\t: " + nama);
        System.out.println("Alamat Pembeli\t: " + alamat);
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s%35d\n", "Total Harga = ", total);
        System.out.println("=======================================================");
        System.out.println("Terima Kasih Atas Kunjungan Anda");
        System.out.println("Barang Yang Sudah Dibeli Tidak Dapat Dikembalikan");
        System.out.println("");
    }
    public void daftarObat() {
        System.out.println("============ DAFTAR OBAT APOTEK BRAWIJAYA =============");
        System.out.println(" 1.  Antimo                 : Rp  4000,-");
        System.out.println(" 2.  Bodrex                 : Rp  1500,-");
        System.out.println(" 3.  Diapet                 : Rp  1500,-");
        System.out.println(" 4.  Herocyn                : Rp  5000,-");
        System.out.println(" 5.  Hufagrip               : Rp 10000,-");
        System.out.println(" 6.  Komix                  : Rp  2000,-");
        System.out.println(" 7.  Laserin                : Rp  9000,-");
        System.out.println(" 8.  Promag                 : Rp  5500,-");
        System.out.println(" 9.  Sangobion              : Rp  2500,-");
        System.out.println("10.  Vegeta                 : Rp  1750,-");
        System.out.println("=======================================================");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sistem Informasi Penjualan Apotek Brawijaya");
        System.out.print("Masukkan nama Anda : ");
        String nama = in.nextLine();
        System.out.print("Masukkan alamat Anda : ");
        String alamat = in.nextLine();
        Apotek user1 = new Apotek(nama, alamat);
        user1.daftarObat();
        System.out.print("Masukkan jumlah obat yang akan anda beli : ");
        int jumlah = in.nextInt();
        Apotek.jumlahjenis = jumlah;
        int noobat[] = new int[jumlah];
        int jumlahobat[] = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Obat " + (i + 1));
            System.out.print("Masukkan No Obat      : ");
            noobat[i] = in.nextInt();
            System.out.print("Masukkan Jumlah Obat  : ");
            jumlahobat[i] = in.nextInt();
            System.out.println("-------------------------------------------------------");
            Apotek userbeli = new Apotek(noobat[i], jumlahobat[i]);
        }
        Apotek.displayMessage();
    }
}
