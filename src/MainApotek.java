
import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] obat = {"A", "B", "C", "D", "E"};
        int[] harga = {10000, 5000, 2000, 2500, 3000, 8000};
        String item[] = new String[10];
        int jumlah[] = new int[10];

        System.out.println("Selamat datang di Apotek Overload");
        System.out.println("---------------------------------");
        System.out.println("Isi biodata berikut untuk memesan");
        System.out.print("Input nama: ");
        String nama = in.next();
        System.out.print("Input alamat: ");
        String alamat = in.next();

        Apotek pasien = new Apotek(nama, alamat);
        Apotek beli = new Apotek(obat, harga);
        beli.listHarga();

        for (int i = 0; i < item.length; i++) {
            System.out.print("Nama obat: ");
            item[i] = in.next();
            System.out.print("Jumlah obat: ");
            jumlah[i] = in.nextInt();
            System.out.print("Tekan 'y' untuk tambah obat: ");
            String lagi = in.next();
            if (!"y".equalsIgnoreCase(lagi)) {
                break;
            }
        }
        System.out.println("------------------------------");
        pasien.cetakBio();        
        beli.listHarga(item, jumlah);
        System.out.println("Silahkan untuk melunasi pembayaran");
        System.out.println("Terima kasih...");
    }
}
