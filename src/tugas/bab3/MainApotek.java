package pratikum3;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, almt;
        int pilih , obat;
        Apotek.setHarga(20000, 25000, 10000, 30000, 15000);
        System.out.println("========Masukan Data Anda========");
        System.out.print("Nama   : ");
        nama = in.nextLine();
        System.out.print("Alamat : ");
        almt = in.nextLine();
        Apotek p1 = new Apotek(nama, almt);
        Apotek.getDaftarObat();
        do {
            System.out.println("===========Menu Pembelian============");
            System.out.println("1. Pilih obat");
            System.out.println("2. Selesai");
            System.out.print("Pilihan : ");
            pilih = in.nextInt();
            if (pilih == 1) {
                System.out.print("Masukkan obat yang dipilih : ");
                obat = in.nextInt();
                p1.pilihObat(obat);
            } else if (pilih != 2) {
                System.out.println("Pilihan salah");
            }
        } while (pilih != 2);
        p1.getTotal();
    }
}