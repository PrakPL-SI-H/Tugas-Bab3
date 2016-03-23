package Praktikum3;

import java.util.Scanner;

public class ApotikMain {

    static Scanner in = new Scanner(System.in);
    static String[] obat = {"Paramex", "Super Tetra", "Promagh", "Fatigon", "Panadol"};
    static String[] inputObat = new String[4];
    static String nama, alamat;
    static int[] jumlah = new int[5];
    static int[] harga = {4000, 15000, 5000, 5000, 12000};

    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI APOTEK AMANAH");
        System.out.println("-------------------------------");
        System.out.println("     JL.MT.HARYONO NO.264      ");
        System.out.println("===============================");
        System.out.print("Masukkan nama pasien       : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat            : ");
        alamat = in.nextLine();

        Apotik pasien = new Apotik();
        Apotik item = new Apotik(obat, harga);

        item.daftarHarga();

        int pilih;
        do {
            System.out.println("SELAMAT DATANG DI APOTEK AMANAH");
            System.out.println("-------------------------------");
            System.out.println("     JL.MT.HARYONO NO.264      ");
            System.out.println("===============================");
            System.out.println("1. Input obat");
            System.out.println("2. Cetak nota");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    input();
                    break;
                case 2:
                    System.out.println(line);
                    System.out.println("SUMMARY");
                    System.out.println(line);
                    pasien.id(nama, alamat);
                    System.out.println(line);
                    item.daftarHarga(inputObat, jumlah);
                    break;
            }
        } while (pilih != 0);

    }
    private static void input() {

        System.out.println("========================================");
        for (int i = 0; i < 6; i++) {
            System.out.print("Drug name  " + (i + 1) + "         = ");
            inputObat[i] = in.next();
            System.out.print("Qty        " + (i + 1) + "         = ");
            jumlah[i] = in.nextInt();
            if (jumlah[i] == 0) {
                System.out.println("====================================");
                break;
            }
        }
    }
}
