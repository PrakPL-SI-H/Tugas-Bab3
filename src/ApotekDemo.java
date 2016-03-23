
import java.util.Scanner;

public class ApotekDemo {
    public static int pilihan;
    public static void main(String[] args) {
        int banyak,pil;
        Scanner in = new Scanner (System.in);
        System.out.println("=====================================================");
        System.out.println("\tSELAMAT DATANG DI APOTEK FORZA");
        System.out.println("=====================================================\n");
        System.out.print("Masukkan Nama Anda\t: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Alamat Anda\t: ");
        String alamat = in.nextLine();
        Pembeli pasien = new Pembeli (nama,alamat);
        Obat pasien1 = new Obat();
        
        
        do{
            pasien1.displayMessage();
            System.out.print("Masukkan pilihan anda\t: ");
            pilihan = in.nextInt();
            System.out.print("Masukkan berapa unit obat yang akan anda beli\t: ");
            banyak = in.nextInt();
            System.out.println("");
            Pembeli obat = new Pembeli (pilihan,banyak);
            System.out.println("Apakah anda akan membeli obat lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println("Pilihan anda\t: ");
            pil = in.nextInt();
            if (pil == 2){
                obat.showLast();
            }
        
        }while(pil != 2);
}
}
