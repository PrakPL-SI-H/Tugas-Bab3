package javaapplication10;

import java.util.Scanner;

public class MainKonversiAngka {

    public static void main(String[] args) {

        KonversiAngka ubah = new KonversiAngka();
        String yn;
        int pilihan;

        do {
            KonversiAngka.display();
            Scanner in = new Scanner(System.in);
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka : ");
                    ubah.overloadingMeth(in.nextInt());
                    System.out.println(ubah.ambilHasilHuruf());
                    break;
                case 2:
                    System.out.print("Masukkan huruf : ");
                    ubah.overLoadingMeth(in.nextLine());
                    ubah.overLoadingMeth(in.nextLine());
                    System.out.println(ubah.ambilHasilNomor());
                    break;
            }

            System.out.print("Ingin mengkonversi lagi? (y/n) : ");
            yn = in.next();
        } while (pilihan != 3 && !yn.equalsIgnoreCase("n"));
        System.out.println("=====TERIMAKASIH=====");
    }
}
