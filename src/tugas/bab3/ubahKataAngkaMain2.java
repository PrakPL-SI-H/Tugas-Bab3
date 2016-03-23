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
            switch (pil1) {
                case 1:
                    System.out.println("========================================================");
                    System.out.println("            PROGRAM BILANGAN ---> TULISAN");
                    System.out.println("========================================================");
                    System.out.print("Masukkan angka bilangan (0-100) : ");
                    satuan = input.nextInt();
                    if (satuan >= 0 && satuan <= 100) {
                        System.out.println(nilai.overloadingMeth(satuan));
                    } else {
                        System.out.println("Bilangan yang Anda masukkan tidak terdefinisi!");
                    }
                    break;
                case 2:
                    System.out.println("========================================================");
                    System.out.println("           PROGRAM TULISAN ---> BILANGAN");
                    System.out.println("========================================================");
                    System.out.print("Masukkan huruf bilangan (0-100) : ");
                    tulisan = input.nextLine();
                    tulisan = input.nextLine();
                    System.out.print(nilai.overloadingMeth(tulisan));
                    break;
            }
            System.out.println("\nApakah Anda ingin menginputkan lagi [y/n] ?");
            System.out.print("Pilihan : ");
            pil2 = input.next();
        } while (pil2.equalsIgnoreCase("y"));
        System.out.println("========================================================");
        System.out.println("       TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
        System.out.println("========================================================");
    }
}
