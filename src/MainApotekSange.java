package javaapplication10;

import java.util.Scanner;

public class MainApotekSange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ApotekSange obat = new ApotekSange();
        System.out.println("                    +++++++++++++++++++");
        System.out.println("                    +++++++++++++++++++");
        System.out.println("                    +++++++++++++++++++");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++ Apotek Sange Siap Melayani Anda, Selamat Datang ! +++++++");
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                    +++++++++++++++++++");
        System.out.println("                    +++++++++++++++++++");
        System.out.println("                    +++++++++++++++++++");
        System.out.println("==========================================================");
        System.out.println("==== Seblum Membeli Obat Silahkan Isi Data Diri Anda =====");
        System.out.print("Silihkan Isi Nama Anda   : ");
        obat.name = in.nextLine();
        System.out.print("Silahkan Isi Alamat Anda : ");
        obat.address = in.nextLine();
        String yn;
        int pilihan = 0;
        do {
            obat.tampilan();
            System.out.print("Masukan jumlah obat yang akan di beli : ");
            int jumlahIsi = in.nextInt();
            for (int i = 0; i < jumlahIsi; i++) {
                System.out.print("Masukan kode obat yang akan di beli   : ");
                pilihan = in.nextInt();
                obat.isi(pilihan - 1, i);
            }
            obat.tampilkanData();
            System.out.print("\nApakah anda ingin membeli obat lagi ? (y/n) : ");
            yn = in.next();

        } while (pilihan != 3 && !yn.equalsIgnoreCase("n"));
        System.out.println("Terimakasih telah membeli obat di Apotek Sange, Silahkan datang kembali . . .");
    }
}
