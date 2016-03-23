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
        System.out.println("============DAFTAR OBAT YANG TERSEDIA============");
        System.out.println("1.  Paracetamol       : Rp  5000,-");
        System.out.println("2.  Decolgen          : Rp  2000,-");
        System.out.println("3.  Combantrin        : Rp 25000,-");
        System.out.println("4.  Antalgin          : Rp  4500,-");
        System.out.println("5.  Amoxilin          : Rp 10000,-");
        System.out.println("6.  Inzana            : Rp  3000,-");
        System.out.println("7.  Tolak Angin       : Rp  7500,-");
        System.out.println("8.  Bodrex            : Rp  5500,-");
        System.out.println("9.  Betadine          : Rp 13000,-");
        System.out.println("10. Minyak Kayu Putih : Rp  9000,-"); 
        System.out.println("=================================================");
        System.out.println("Silahkan Pilih Obat Yang Anda Inginkan");
        data1 = new int[jumlah];
        data2 = new int[jumlah];
        for(int i = 0;i<data1.length;i++){
            System.out.print("Masukkan Nomor Menu Obat          : ");
            data1[i]=in.nextInt();
            System.out.print("Masukkan Banyak Yang Ingin Dibeli : ");
            data2[i]=in.nextInt();
            Apotek b = new Apotek(data1[i],data2[i]);
        }
        System.out.println("=================================================");
        a.diplayMessage();
        System.out.println("=================================================");
        System.out.println("\tTERIMA KASIH ATAS KUNJUNGAN ANDA");
    }
}

