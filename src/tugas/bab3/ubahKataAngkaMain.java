package BAB3;

import java.util.Scanner;

public class ubahKataAngkaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil1, satuan;
        String tulisan, pil2;
        ubahKataAngka nilai = new ubahKataAngka();
        System.out.println("========================================================");
        System.out.println("                      SELAMAT DATANG");
        System.out.println("     PROGRAM KONVERSI ANGKA KE HURUF DAN SEBALIKNYA     ");
        System.out.println("========================================================");
        do {
            System.out.println("\n========================================================");
            System.out.println("PILIH MENU OUTPUT DAN INPUT  : ");
            System.out.println("1. Bilangan --> Tulisan");
            System.out.println("2. Tulisan  --> Bilangan");
            System.out.print("Pilihan : ");
            pil1 = input.nextInt();
