
import java.util.Scanner;

public class LatihanBab3No1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String batas = ("----------------------------------------------------");
        UbahInput input = new UbahInput();
        int pilih;
        do {
            System.out.println("1. Ubah Angka ke Huruf");
            System.out.println("2. Ubah Huruf ke Angka");
            System.out.println("0. Keluar");
            System.out.print("Masukan Pilihan = ");
            pilih = in.nextInt();
            System.out.printf("%.40s\n", batas);
            switch (pilih) {
                case 1:
                    System.out.println("===> Ubah Angka ke Huruf <===");
                    System.out.print("Masukkan Angka (0 - 100) = ");
                    int angka = in.nextInt();
                    input.ubahAngka(angka);
                    System.out.println("");
                    System.out.printf("%.40s\n", batas);
                    break;
                case 2:
                    System.out.println("===> Ubah Huruf ke Angka <===");
                    System.out.print("Masukkan Huruf (0 - 100) = ");
                    String huruf = in.nextLine();
                    huruf = in.nextLine();
                    input.ubahHuruf(huruf);
                    System.out.println("");
                    System.out.printf("%.40s\n", batas);
                    break;
                default:
                    if (pilih == 0) {
                        break;
                    } else {
                        System.out.println("Maaf, Pilihan Tidak Tersedia");
                    }
            }
        } while (pilih != 0);
        System.out.println("\tTerima Kasih");
    }

}
