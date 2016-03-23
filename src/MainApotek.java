package bab3;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotek obat1 = new Apotek();
        System.out.print("Masukan Nama Anda   : ");
        obat1.nama = in.nextLine();
        System.out.print("Masukan Alamat Anda : ");
        obat1.alamat = in.nextLine();
        int pilih = 0;
        do {
            obat1.tampilan();
            System.out.print("Masukan jumlah obat yang akan anda beli : ");
            int jumlahIsi = in.nextInt();
            for (int i = 0; i < jumlahIsi; i++) {
                System.out.print("Masukan kode obat yang akan anda beli : ");
                pilih = in.nextInt();
                obat1.isi(pilih - 1, i);
            }
            obat1.tampilkanData();
            System.out.println("\nApakah anda ingin membeli obat lagi?");
            System.out.println("1. Iya    2. Tidak");
            System.out.print("Masukan pilihan : ");
            pilih = in.nextInt();
        } while (pilih != 2);
    }
}