package BAB3;

import java.util.Scanner;

public class ApotekMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, alamat, pilihan;
        Apotek data = new Apotek();
        System.out.println("========================================================");
        System.out.println("                      SELAMAT DATANG");
        System.out.println("                    APOTEK KIMIA FARMA     ");
        System.out.println("========================================================");
        System.out.print("NAMA   : ");
        nama = in.next();
        System.out.print("ALAMAT : ");
        alamat = in.next();
        data.listObat();
        System.out.println("\nPILIH DAFTAR YANG DI BELI");
        do {
            System.out.print("OBAT       : ");
            int obat = in.nextInt();
            System.out.print("JUMLAH     : ");
            int jumlah = in.nextInt();
            data.obat(obat, jumlah);
            System.out.print("\nTAMBAH PEMBELIAN? (Y/N)");
            pilihan = in.next();
        } while (pilihan.equalsIgnoreCase("y"));
        System.out.println("--------------------------------------------------------");
        data.obat();
    }
}
