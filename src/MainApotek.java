
import java.util.Scanner;

public class MainApotek {

    static Scanner in = new Scanner(System.in);
    static String[] obat = {"Panadol", "Vitamin", "Oralit", "Paramex", "Milanta", "Diapet"};
    static String[] inputObat = new String[5];
    static String nama, alamat;
    static int[] jumlah = new int[6];
    static int[] harga = {90000, 50000, 30000, 90000, 50000, 30000};

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("    Apotek Mizasr");
        System.out.println("---------------------");
        System.out.print("Nama pasien: ");
        nama = in.nextLine();
        System.out.print("Alamat pasien: ");
        alamat = in.nextLine();

        Apotek pasien = new Apotek();
        Apotek item = new Apotek(obat, harga);

        item.daftarHarga();

        int pilih;
        do {
            System.out.println("MENU:");
            System.out.println("1. Input drugs");
            System.out.println("2. Print bill");
            System.out.println("0. Exit");
            System.out.print("Pick Menu : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    input();
                    break;
                case 2:
                    System.out.println("TOTAL");
                    pasien.dataKonsumen(nama, alamat);
                    item.daftarHarga(inputObat, jumlah);
                    break;
            }
        } while (pilih != 0);
    }

    private static void input() {        
        for (int i = 0; i < 6; i++) {
            System.out.print("Nama obat  " + (i + 1) + "         = ");
            inputObat[i] = in.next();
            System.out.print("Jumlah     " + (i + 1) + "         = ");
            jumlah[i] = in.nextInt();
            if (jumlah[i] == 0) {
                
                break;
            }
        }
    }
}
