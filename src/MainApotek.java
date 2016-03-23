package mainapotek;

import java.util.Scanner;

public class MainApotek {

    public static int code[], data[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("========= SISTEM INFORMASI PENJULAN APOTEK X ========");
        System.out.print("Masukkan Nama Anda         : ");
        String nama = in.next();
        System.out.print("Masukkan Alamat Anda       : ");
        String alamat = in.next();
        apotek x = new apotek(nama, alamat);
        System.out.print("Masukkan Jumlah Jenis Obat : ");
        int jumlah = in.nextInt();
        System.out.println("=====================================================");
        System.out.println("                 Daftar Obat  ");
        System.out.println("=====================================================");
        System.out.println("1.  Ampicilin         : Rp   8500,-");
        System.out.println("2.  Antalgin          : Rp   5000,-");
        System.out.println("3.  Antimo Anak       : Rp   2000,-");
        System.out.println("4.  Betadine          : Rp   9000,-");
        System.out.println("5.  Bisolvon          : Rp   7500,-");
        System.out.println("6.  Bodrex            : Rp   5000,-");
        System.out.println("7.  Cefadroxil        : Rp   9000,-");
        System.out.println("8.  Decolgen          : Rp   2500,-");
        System.out.println("9.  GG                : Rp   3000,-");
        System.out.println("10. Paracetamol       : Rp   5000,-");
        System.out.println("11. Paramex           : Rp   2500,-");
        System.out.println("12. Rhinos            : Rp 30.000,-");
        System.out.println("=====================================================");
        System.out.println("Pilih Obat            : ");
        code = new int[jumlah];
        data = new int[jumlah];
        for (int i = 0; i < code.length; i++) {
            System.out.print("Masukkan Kode Obat    : ");
            code[i] = in.nextInt();
            System.out.print("Masukkan Jumlah Obat  : ");
            data[i] = in.nextInt();
            apotek b = new apotek(code[i], data[i]);
        }
        x.tampilkan();
        System.out.println("========= TERIMA KASIH ATAS KUNJUNGAN ANDA ==========");
    }

}
