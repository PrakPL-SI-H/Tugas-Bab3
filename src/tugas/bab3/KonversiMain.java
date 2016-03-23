package program_Laporan;

import java.util.Scanner;

public class KonversiMain {

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
                    System.out.print("Masukkan angka yang ingin anda ubah : ");
                    ubah.overloadingMeth(in.nextInt());
                    System.out.println(ubah.getHasilHuruf());
                    break;
                case 2:
                    System.out.print("Masukkan huruf yang ingin anda ubah : ");
                    ubah.overLoadingMeth(in.nextLine());
                    ubah.overLoadingMeth(in.nextLine());
                    System.out.println(ubah.getHasilAngka());
                    break;
                case 3:
                    break;
            }
            System.out.print("Ingin melakukan pengkonversian ulang? (y/n) : ");
            s = in.next();
        } while (pilihan != 3 && !s.equalsIgnoreCase("n"));
        System.out.println("terimakasih telah menjalankan program kami");
    }
}
