
import java.util.Scanner;

public class ApotekDemo {
    public static int pilihan;
    public static void main(String[] args) {
        int banyak,pil;
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat = in.nextLine();
        Pembeli pasien = new Pembeli (nama,alamat);
        Obat pasien1 = new Obat();
        
        
        do{
            pasien1.displayMessage();
            System.out.println("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            System.out.println("Masukkan berapa unit obat yang akan anda beli : ");
            banyak = in.nextInt();
            System.out.println("");
            Pembeli obat = new Pembeli (pilihan,banyak);
            System.out.println("Apakah anda akan membeli obat lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println("Pilihan anda : ");
            pil = in.nextInt();
        
        }while(pil != 2);
}
}
