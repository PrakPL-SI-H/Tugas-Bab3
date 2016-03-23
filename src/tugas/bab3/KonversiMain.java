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
                
            }
            System.out.print("Ingin melakukan pengkonversian ulang? (y/n) : ");
            s = in.next();
        } while (pilihan != 3 && !s.equalsIgnoreCase("n"));
        System.out.println("terimakasih telah menjalankan program kami");
    }
}
