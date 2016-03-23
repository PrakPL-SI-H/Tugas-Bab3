package prak3;
import java.util.Scanner;
public class OverloadingMeth {

    String[] satuanHuruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    String[] satuanAngka = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    public void overloadingMeth(int angka) {
        if (angka == 0) {
            System.out.println("Nol");
        } else if (angka < 12) {
            System.out.println(satuanHuruf[angka]);
        } else if (angka >= 12 && angka <= 19) {
            int belas = angka % 10;
            System.out.println(satuanHuruf[belas] + " belas");
        } else if (angka >= 20 && angka <= 99) {
            int x = angka % 10;
            int y = angka / 10;
            System.out.println(satuanHuruf[y] + " puluh" + satuanHuruf[x]);
        } else if (angka == 100) {
            System.out.println("Seratus");
        } else {
            System.out.println("Angka yang Anda Masukkan Melebihi 100");
        }
    }

    public  String overloadingMeth(String huruff) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
        String angka[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] no = huruff.split(" ");
        String hasil = "";
        for (int i = 0; i < no.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (no.length == 3) {
                    if (no[i].indexOf(huruf[j]) >= 0) {
                        hasil = hasil + angka[j];
                    }
                } else if (no.length == 2) {
                    if (no.length == 2 && no[1].equalsIgnoreCase("puluh") && no[i].equalsIgnoreCase(huruf[j])) {
                        hasil = angka[j] + "0";
                    } else if (no.length == 2 && no[1].equalsIgnoreCase("belas") && no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = "1" + angka[j];
                    }
                } else {
                    if (no[0].equalsIgnoreCase("sebelas")) {
                        hasil = "11";
                    } else if (no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = angka[j];
                    } else if (no[0].equalsIgnoreCase("seratus")) {
                        hasil = "100";
                    }
                }
            }
        }
        return hasil;
    }
}
