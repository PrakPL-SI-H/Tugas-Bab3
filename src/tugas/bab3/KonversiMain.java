package Praktikum3;

import java.util.Scanner;

public class KonversiMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Konversi konversi = new Konversi();
        System.out.println("KONVERSI BILANGAN-ANGKA (satu-seratus)");
        System.out.println("======================================");
        System.out.print("Masukkan bilangan : ");
        String y = in.nextLine();
        konversi.showAngka(y);

    }
}
