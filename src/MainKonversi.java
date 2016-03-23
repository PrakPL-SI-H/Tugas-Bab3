package bab3;

import java.util.Scanner;
public class MainKonversi {
    public static void main(String[] args) {
        Konversi a = new Konversi();
        Scanner in = new Scanner(System.in);
        System.out.println("======== Program Sederhana Pengubah Angka dan Huruf ========");
        System.out.println("");
        int x;
        System.out.print("Masukkan Angka : ");
        x = in.nextInt();
        if (x == 10) {
            System.out.println("Sepuluh");
        } else if (x == 11) {
            System.out.println("Sebelas");
        } else if (x == 0) {
            System.out.println("Nol");
        } else if (x == 100) {
            System.out.println("Seratus");
        } else if (x < 10) {
            Konversi.ubah(x);
        } else if (x > 11 && x < 20) {
            Konversi.ubah(x);
        } else if (x >= 20 && x < 100) {
            Konversi.ubah(x);
        } else {
            System.out.print("ANGKA MELEBIHI BATAS");
        }
        System.out.print("\n\nMasukkan Huruf :");
        in.nextLine();
        String c = in.nextLine();
        System.out.println(a.overloadingMeth(c));
        System.out.println("");
        System.out.println("SEKIAN DAN TERIMA KASIH");
        System.out.println("=================================================");
    }
}

