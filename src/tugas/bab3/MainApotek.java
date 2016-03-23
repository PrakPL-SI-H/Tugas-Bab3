package Praktikum;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
    Scanner puta = new Scanner (System.in);
        
        System.out.println("==========================================="
                + "\n                APOTEK BAGUS"
                + "\n-------------------------------------------");
        
        System.out.printf("Masukkan nama    = ");
        String nama = puta.nextLine();
        System.out.print("Masukkan alamat   = ");
        String alamat = puta.nextLine();
        
        System.out.println();
        Apotek one = new Apotek (nama, alamat);
        one.daftar();
        
        System.out.print("Jumlah pembelian    = ");
        int j = puta.nextInt();
        one.daftar(j);
        one.tampil();
    
    }
    
}