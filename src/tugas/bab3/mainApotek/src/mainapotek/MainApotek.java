package mainapotek;

import java.util.Scanner;

public class MainApotek {
    public static void main(String[] args) {
        DataApotek data = new DataApotek();
        Scanner in = new Scanner(System.in);        
        System.out.println("Sistem Informasi Penjualan Apotek");
        System.out.println("Masukkan nama : ");
        String a = in.nextLine();
        System.out.println("Masukkan alamat : ");
        String b = in.nextLine();
        data.DataApotek(a, b);
        System.out.println("");
        System.out.println("Daftar Obat");
        data.daftar();
        System.out.println("");
        data.output();        
    }    
}
