package PraktikumSIH;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("    SELAMAT DATANG DI APOTEK    ");
            System.out.println("--------------------------------");
            System.out.println("Isi Biodata Sebelum Memesan");
            System.out.print("Nama   : ");
            String nama = in.nextLine();
            System.out.print("Alamat : ");
            String alamat = in.nextLine();
            System.out.println();
            Apotek user = new Apotek (nama, alamat);
                user.lihatDaftar();
                user.beliObat();
                user.tampilPesanan();
    }
}