package Apotek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String[] obat = {"Panadol", "Vitamin", "Amoxylin", "Paramex", "Milanta", "Diapet"};
        String nama, alamat;
        int[] jumlah = new int[5];
        int[] harga = {90000, 50000, 30000, 90000, 50000, 30000};
        String line = "========================================";
       
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
                    cetak();
                    break;
            }
        } while (pilih != 0);
    }

    private static void input() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println(line);
        for (int i = 0; i < 20; i++) {
            System.out.print("Item Code  " + (i + 1) + "         = ");
            obat[i] = in.nextInt();
            if (obat[i] < 1 || obat[i] > 6) {
                System.out.println("Fail, no entry");
                System.out.println(line);
                break;
            }
            System.out.print("Qty        " + (i + 1) + "         = ");
            jumlah[i] = in.nextInt();
            if (jumlah[i] == 0) {
                System.out.println(line);
                break;
            }
        }
    }
}
