/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.bab3;

import java.util.Scanner;

class Konversi {

    private final String[] huruf = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    private String nilaiHuruf;

    private final String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private String nilaiAngka;

    public String getHasilHuruf() {
        return nilaiHuruf;
    }

    public String getHasilAngka() {
        return nilaiAngka;
    }

    public String overloadingMeth(int angka) {
        nilaiHuruf = "";
        if (angka < 12) {
            nilaiHuruf += huruf[angka];
        } else if (angka < 20) {
            nilaiHuruf += huruf[angka - 10] + " Belas";
        } else if (angka < 100) {
            nilaiHuruf += huruf[angka / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka == 100) {
            nilaiHuruf = "Seratus";
        } else if (angka == 0) {
            nilaiHuruf = "Nol";
        } else if (angka > 100) {
            System.err.println("Maaf, angka tidak boleh lebih dari 100 (Seratus) !");
        }
        return nilaiHuruf;
    }

    public String overLoadingMeth(String huruf) {
        for (int i = 0; i < this.huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nilaiAngka = angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nilaiAngka = angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " belas")) {
                    nilaiAngka = angka[1] + angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh")) {
                    nilaiAngka = angka[i] + angka[0];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh " + this.huruf[j])) {
                    nilaiAngka = angka[i] + angka[j];
                } else if (huruf.equalsIgnoreCase("Seratus")) {
                    nilaiAngka = angka[1] + angka[0] + angka[0];
                }
            }
        }
        return nilaiAngka;
    }

    public static void menu() {  
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("=================== Selamat Datang di Layanan Pengubah Kata dan Huruf ===================");
        System.out.println("1. Konversi dari bentuk angka ke bentuk huruf : ");
        System.out.println("2. Konversi dari bentuk huruf ke bentuk angka : ");
        System.out.println("3. Keluar ");
        System.out.print("Masukkan pilihan anda : >>> ");        
    }
}

public class TugasBab3 {

    public static void main(String[] args) {
    
    Konversi ubah = new Konversi();
        String s;
        int pilihan;
        do {
            ubah.menu();
            Scanner imut = new Scanner(System.in);
            pilihan = imut.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka anda : ");
                    ubah.overloadingMeth(imut.nextInt());
                    System.out.println(ubah.getHasilHuruf());
                    break;
                case 2:
                    System.out.print("Masukkan huruf anda : ");
                    ubah.overLoadingMeth(imut.nextLine());
                    ubah.overLoadingMeth(imut.nextLine());
                    System.out.println(ubah.getHasilAngka());
                    break;
                case 3:
                    break;
            }
            System.out.print("Ingin konversi lagi? (y/n) : ");
            s = imut.next();
        } while (pilihan != 3 && !s.equalsIgnoreCase("n"));
        System.out.println("bye.....byeeee");
        
    }
    
}
