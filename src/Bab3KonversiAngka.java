package bab3konversiangka;

import java.util.Scanner;

/**
 *
 * @author Istighfarin Bahtiar AMry
 * @NIM 155150401111129
 * @Kelas SI-H
 */
public class Bab3KonversiAngka {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ProsesKonversi convert = new ProsesKonversi();
        String loop;
        int pil;
        
        do {
            System.out.println("");
            System.out.print("    SILAHKAN PILIH MENU : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan huruf anda    : ");
                    in.nextLine();
                    convert.overLoadingMeth(in.nextLine());
                    convert.outputnum();
                    break;

                case 2:

                    System.out.print("Masukkan angka anda    : ");
                    int num = in.nextInt();
                    convert.overloadingMeth(num);
                    convert.outputword();
                    break;

            }
            System.out.print("ULANGI LAGI ?(Y/N)");
            loop = in.next();
        } while ("Y".equals(loop));
        System.out.println("");
        System.out.println("     ===PROGRAM CLOSED===");
        System.out.println("         TERIMA KASIH    ");
    }
}
