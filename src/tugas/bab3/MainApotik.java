
import java.util.Scanner;

public class MainApotik {
    public static void main(String[] args) {
        Daftar obat = new Daftar();
        int i;
        Scanner ini = new Scanner(System.in);
        System.out.println("Nama   = ");
        obat.Nama = ini.nextLine();
        System.out.println("Alamat = ");
        obat.Alamat = ini.nextLine();

        System.out.println("Menu");
        System.out.println("1.Pilih Obat");
        System.out.println("2.Total Harga");
        System.out.println("9.keluar");
        System.out.println("Masukkan Urutan = ");
        i = ini.nextInt();

   }
}
