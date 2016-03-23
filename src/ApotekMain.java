package PrakPemLan;

import java.util.Scanner;

public class ApotekMain {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        SistemApotek obat = new SistemApotek();
        do {
            System.out.println("~~~~~~~~~~ Sistem Informasi Penjualan Apotek ~~~~~~~~~~");
            System.out.println("1. Input Nama ");
            System.out.println("2. Input Alamat ");
            System.out.println("3. Pilih Obat ");
            System.out.println("4. Print Pesanan");
            System.out.println("5. Keluar");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pilih menu nomor : ");
            int pil = in.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Nama : ");
                    obat.Nama(in.next());
                    System.out.println("Nama telah tersimpan.\n");
                    break;
                case 2:
                    System.out.print("Alamat : ");
                    obat.Alamat(in.next());
                    System.out.println("Alamat telah tersimpan.\n");
                    break;
                case 3:
                    System.out.println("~~~~~~~~~~~~ DAFTAR OBAT ~~~~~~~~~~~~");
                    System.out.println("Nama Obat               | Harga");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1. Panadol              | (Rp.  2500)");
                    System.out.println("2. Obat Batuk OBH Combi | (Rp.  8500)");
                    System.out.println("3. Decolgen             | (Rp.  3000)");
                    System.out.println("4. Betadine             | (Rp.  7000)");
                    System.out.println("5. Paramex              | (Rp. 10000)");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Jumlah obat yang dibeli sebanyak : ");
                    obat.JlhObat(in.nextInt());
                    if (obat.ttlobat > 5) {
                        System.out.println("Maaf, jumlah maksimal obat yang dapat dibeli sebanyak 5 obat. "
                                + "Silakan masukkan kembali jumlah obat dengan benar");
                    } else {
                        for (int i = 0; i < obat.ttlobat; i++) {
                            System.out.print("Masukkan nomor obat : ");
                            obat.NoObat(in.nextInt());
                            obat.total();
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n~~~~~~~~~~ Pesanan anda saat ini ~~~~~~~~~~");
                    obat.PrintInfo();
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("\n~ Terima kasih telah berkunjung ke apotek kami ~");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Masukkan yang Anda berikan salah. Ulangi kembali.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        } while (true);
    }
}