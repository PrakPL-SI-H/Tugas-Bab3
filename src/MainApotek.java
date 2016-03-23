package Apotek;

import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotek org1;
        int c, d;
        String balik = "y";
        System.out.println("    SELAMAT DATANG DI APOTIK NANDA FARMA    ");
        System.out.print("Masukan Nama Anda     = ");
        String nama = in.nextLine();
        System.out.print("Masukan Alamat Anda   = ");
        String alamat = in.nextLine();
        org1 = new Apotek(nama, alamat);

        while (balik.equalsIgnoreCase("y")) {
            System.out.println("========================================");
            System.out.println("        DAFTAR OBAT YANG TERSEDIA       ");
            System.out.println("========================================");
            System.out.println("1.  Ademsari                : Rp  2000,-");
            System.out.println("2.  Amoxcilin               : Rp  2500,-");
            System.out.println("3.  Antangin                : Rp  5000,-");
            System.out.println("4.  Cap Kaki Tiga 500ml     : Rp 15500,-");
            System.out.println("5.  Minyak Kayu Putih       : Rp 10000,-");
            System.out.println("6.  Fresh Care              : Rp 11000,-");
            System.out.println("7.  Cefadroxil              : Rp  7500,-");
            System.out.println("8.  Tolak Angin             : Rp  9000,-");
            System.out.println("9.  Cap Badak               : Rp 13000,-");
            System.out.println("10. Bodrex                  : Rp  4500,-");
            System.out.println("========================================");
            System.out.println("       Masukkan Pilihan Anda         ");
            System.out.print("Masukkan Nomor Menu Obat          : ");
            int menu = in.nextInt();
            System.out.print("Masukkan Banyak Obat Yang Dibeli  : ");
            int banyak = in.nextInt();
            org1.obat(menu, banyak);
            System.out.print("apa Anda ingin memesan obat lagi (Y/N) ? ");
            balik = in.next();
        }
            org1.displaymessage();
            System.out.println("    TERIMAKASIH ATAS KUNJUNGAN ANDA ");
            System.out.println("          SEMOGA LEKAS SEMBUH       ");
    }
}
