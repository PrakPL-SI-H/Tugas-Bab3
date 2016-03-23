package pl_praktikum_lap3;

import java.util.Scanner;

public class MainObat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClassObat pelanggan = new ClassObat();
        System.out.println("==========SELAMAT DATANG DI SISTEM INFORMASI APOTEK==========");
        System.out.print("Masukkan Nama Lengkap    : ");
        pelanggan.setName(in.next());
        pelanggan.setName(in.next());
        System.out.print("Nama Panggilan           : ");
        pelanggan.setName(in.next());
        System.out.print("Masukkan Alamat          : ");
        pelanggan.setaddress(in.next());
        System.out.println("1. BODREX           Rp. 10000");
        System.out.println("2. PARACETAMOL      Rp. 20000");
        System.out.println("3. INSAGRIN         Rp. 30000");
        System.out.println("4. CALADINE         Rp. 40000");
        System.out.println("5. OBH              Rp. 50000");
        System.out.println("6. PANADOL          Rp. 50000");
        System.out.print("Masukkan Jumlah Obat yang dibeli : ");
        pelanggan.Data(in.nextInt());
        for (int i = 0; i < pelanggan.jum; i++) {
            System.out.print("Masukkan Nama Obat : ");
            pelanggan.pilihObat(in.next());
        }
        System.out.println("");
        pelanggan.Data();

    }

}
