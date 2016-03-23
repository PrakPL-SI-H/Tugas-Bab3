package Praktikum3;

import java.util.Scanner;

public class KonversiMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Konversi konversi = new Konversi();
        System.out.println("KONVERSI BILANGAN-ANGKA (satu-seratus)");
        System.out.println("======================================");
        System.out.print("Masukkan bilangan : ");
        String b = in.nextLine();
        konversi.showAngka(b);
        System.out.println("");
        
        System.out.println("KONVERSI ANGKA-BILANGAN (1-100)");
        System.out.println("======================================");
        System.out.print("Masukkan bilangan : ");
        int a = in.nextInt();
        konversi.showBilangan(a);

        
    }
}
