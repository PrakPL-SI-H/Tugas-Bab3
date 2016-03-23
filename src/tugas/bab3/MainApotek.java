package mainapotek;
import java.util.Scanner;
public class MainApotek {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.print("Masukkan Nama  : ");
        String nama = in.nextLine();
        System.out.print("Alamat:");
        String alamat = in.nextLine();
        String obat;
        Apotek main = new Apotek( nama,alamat);
        do {
            System.out.println("Daftar Obat Yang tersedia");
            System.out.println("Ketikkan Nama Obat Dengan Benar !!!!");
            System.out.println("============================");
            System.out.println(" -Paracetamol \t -konidin\n -neuremacil\t -bodrek \n -Amoxilin\t -decolgen \n -paracetamol \t -promag \n -entrostop \t -alpara");
            System.out.print("Masukkan Nama Obat:");
            obat = in.nextLine();
            main.cobaapotik(obat);
            System.out.println("Tambah lagi : Y/N");
            pilih = in.nextLine();
        } while ("y".equalsIgnoreCase(pilih));
        main.NotaPembelian();
    }
}
