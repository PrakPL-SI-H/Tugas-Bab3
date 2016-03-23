package bab3sistemapotik;

import java.util.Scanner;

/**
 *
 * @author Istighfarin Bahtiar AMry
 * @NIM 155150401111129
 * @Kelas SI-H
 */
public class Bab3SistemApotik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String loop;
        String daftar[] = {"ObatH5N1", "ObatH222", "Obat5W1H", "ObatK2K3", "ObatXXXX"};
        int price[] = {10000, 20000, 30000, 40000, 50000};

        System.out.println("    Masukkan Identitas Diri");
        System.out.print("Nama Anda   : ");
        String nama = in.nextLine();
        System.out.print("Alamat Anda : ");
        String alamat = in.nextLine();
        System.out.println();

        DataApotik user = new DataApotik(nama, alamat); //overloading construktor
        DataApotik list = new DataApotik(daftar, price);

        menu();
        do {
            System.out.println();
            System.out.print("SILAHKAN PILIH MENU : ");
            
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("    ===DAFTAR OBAT DAN HARGANYA===");
                    for (int i = 0; i < daftar.length; i++) {
                        list.olahData(i);

                    }
                    break;
                case 2:
                    System.out.println("===PEMBELIAN OBAT===");
                    System.out.print("Masukkan Nama Obat   : ");
                    String namaObat = in.next();
                    System.out.print("masukkan Jumlah Obat : ");
                    int jum = in.nextInt();
                    list.olahData(namaObat, jum);
                    break;

                case 3:
                    System.out.println("            ===APOTIK BAHTIAR===");
                    System.out.println("    =====================================");
                    System.out.println("   Nama Pembeli     :" + user.user);
                    System.out.println("   Alamat Rumah     :" + user.alamat);
                   
                    list.outputProgram();
                    break;
                case 4:
                    break;
            }

        } while (pil != 4);
        System.out.println("===APOTIK BAHTIAR===");
        System.out.println("   TERIMA KASIH");
    }

    public static void menu() {
        System.out.println("===SELAMAT DATANG DI APOTIK BAHTIAR===");
        System.out.println("");
        System.out.println("    MENU : ");
        System.out.println("    1.Daftar Nama Obat");
        System.out.println("    2.Pembelian Obat  ");
        System.out.println("    3.Cetak Bukti Pembelian");
        System.out.println("    4.Keluar");
    }

}
