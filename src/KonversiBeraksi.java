package nomor1;

import java.util.Scanner;

public class KonversiBeraksi {

    public static void main(String[] args) {

        Konversi ubah = new Konversi();
        String s;
        int pilihan;
        do {
            ubah.menu();
            Scanner in = new Scanner(System.in);
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka anda : ");
                    ubah.overloadingMeth(in.nextInt());
                    System.out.println(ubah.getHasilHuruf());
                    break;
                case 2:
                    System.out.print("Masukkan huruf anda : ");
                    ubah.overLoadingMeth(in.nextLine());
                    ubah.overLoadingMeth(in.nextLine());
                    System.out.println(ubah.getHasilAngka());
                    break;
                case 3:
                    break;
            }
            System.out.print("Ingin konversi lagi? (y/n) : ");
            s = in.next();
        } while (pilihan != 3 && !s.equalsIgnoreCase("n"));
        System.out.println("bye.....byeeee");
    }
}
