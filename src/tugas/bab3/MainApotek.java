package mainapotek;
import java.util.Scanner;
public class MainApotek {
        Scanner in = new Scanner (System.in);
        public static int data1[],data2[];
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("===SELAMAT DATANG DI SISTEM INFORMASI PENJUALAN APOTEK K-Farma===");
        System.out.print("Masukkan Nama Anda   : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        String alamat = in.nextLine();
        Apotek a = new Apotek(nama,alamat);
        System.out.print("Masukkan jumlah jenis obat yang akan anda beli : ");
        int jumlah = in.nextInt();
    }
}
