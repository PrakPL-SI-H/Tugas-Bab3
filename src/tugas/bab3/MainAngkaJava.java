package mainangka.java;

import java.util.Scanner;

public class MainAngkaJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih, nomor;
        Ubah ubah = new Ubah();
        do {
            System.out.println("=========MENU=========");
            System.out.println("1. Mengubah int ke String\n2. Mengubah String ke int\n0. keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilih = in.nextInt();
            System.out.println("");
            if (pilih == 1) {
                do {
                    System.out.print("Masukkan angka (nomor) 0-100  : ");
                    nomor = in.nextInt();
                } while (nomor < 0 || nomor > 100);
                System.out.print("Hasil konversi  : ");
                ubah.overloadingMeth(nomor);
                System.out.println("=============================");
            } else if (pilih == 2) {
                System.out.print("Masukkan kalimat angka 0-100  : ");
                String bil = in.nextLine();
                bil = in.nextLine();
                System.out.print("Hasil konversi  : ");
                ubah.overloadingMeth(bil);
                System.out.println("==============================");
            }
            System.out.println("");
        } while (pilih != 0);
    }
}