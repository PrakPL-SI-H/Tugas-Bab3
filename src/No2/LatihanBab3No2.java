package No2;

import java.util.Scanner;

public class LatihanBab3No2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Obat pembeli = new Obat();
        String nama;
        String alamat;

        System.out.println("\t===> Apotek Lekas Sembuh <==");
        System.out.print("Masukkan Nama   = ");
        nama = in.nextLine();
        System.out.print("Masukkan Alamat = ");
        alamat = in.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pembeli.showDaftar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tPilih Obat");
        String tambah;
        do {
            System.out.print("Masukan kode = ");
            String kode = in.next();
            System.out.print("Banyak       = ");
            int banyak = in.nextInt();
            pembeli.pilihObat(kode, banyak);
            System.out.println("Tambah obat (y/n) ? ");
            tambah = in.next();
        } while (tambah.equalsIgnoreCase("y"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pembeli.showBayar(nama, alamat);
    }
}
