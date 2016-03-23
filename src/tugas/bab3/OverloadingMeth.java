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

}
