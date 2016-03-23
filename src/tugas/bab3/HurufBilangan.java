package hurufbilangan;

import java.util.Scanner;

public class HurufBilangan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Ubah angka jadi teks (1-100)");
        System.out.println("2. Ubah teks jadi angka (1-100)");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Masukkan angka : ");
                break;
            case 2:
                System.out.println("Masukkan teks : ");
                break;
            default :
                System.out.println("Pilihan anda tidak ada");
                break;
        }
        

    }

}
