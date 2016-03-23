package PrakPemLan;

import java.util.Scanner;

public class UbahMain {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int pil, bil;
        String teks;
        Mengubah nilaibil = new Mengubah();
        System.out.println("Program Mengubah Text_To_Number dan Number_To_Text");
        do {
            System.out.println("Silakan pilih ingin mengubah apa");
            System.out.println("1.\tText_To_Number");
            System.out.println("2.\tNumber_To_Text");
            System.out.print("Masukan pilihan Anda : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("\n\tText_To_Number");
                    System.out.print("Masukkan bilangan antara 0 sampai 100 : ");
                    bil = in.nextInt();
                    if (bil >= 0 && bil <= 100) {
                        System.out.print("Output : ");
                        nilaibil.overloadingMeth(bil);
                    } else {
                        System.out.println("\nNumber not found !");
                    }
                    break;
                case 2:
                    System.out.println("\n\tNumber_To_Text");
                    System.out.println("\n\t\t!!! PERHATIKAN !!!");
                    System.out.println("Gunakan huruf kecil dan garis bawah ( _ ) untuk spasi");
                    System.out.print("\nMasukkan teks dari bilangan antara 0 sampai 100 : ");
                    teks = in.next();
                    System.out.println(nilaibil.overloadingMeth(teks));
                    break;
            }
            System.out.println("\nIngin menginputkan lagi ?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilih : ");
            pil = in.nextInt();
            System.out.println("");
        } while (pil == 1);
        System.out.println("Program dihentikan ");
    }
}