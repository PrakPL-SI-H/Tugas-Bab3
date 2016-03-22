package Apotek;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static String[] obat = {"Panadol", "Vitamin", "Amoxylin", "Paramex", "Milanta", "Diapet"};
    static String[] inputObat = new String[5];
    static String nama, alamat;
    static int[] jumlah = new int[5];
    static int[] harga = {90000, 50000, 30000, 90000, 50000, 30000};
    static String line = "========================================";

    public static void main(String[] args) {

        System.out.println("Program Kasir Apotek");
        System.out.print("Masukkan nama pasien      : ");
        nama = in.nextLine();
        System.out.print("Masukkan alamat pasien    : ");
        alamat = in.nextLine();

        Apotek item = new Apotek(obat, harga);
        Apotek pasien = new Apotek(nama, alamat);

        item.daftarHarga();

        int pilih;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Input obat yang dibeli");
            System.out.println("2. Print nota");
            System.out.println("0. Selesai");
            System.out.print("Pilih Menu : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    input();
                    break;
                case 2:
                    item.daftarHarga(inputObat, jumlah);
                    break;
            }
        } while (pilih != 0);
    }

    private static void input() {

        System.out.println(line);
        for (int i = 0; i < 5; i++) {
            System.out.print("DRUG NAME  " + (i + 1) + "         = ");
            inputObat[i] = in.next();
            System.out.print("Qty        " + (i + 1) + "         = ");
            jumlah[i] = in.nextInt();
            if (jumlah[i] == 0) {
                System.out.println(line);
                break;
            }
        }
    }
}
