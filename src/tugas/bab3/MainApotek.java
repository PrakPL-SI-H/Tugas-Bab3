package mainapotek;

import java.util.Scanner;

public class MainApotek {

    public static String data[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotek isi = new Apotek();
        Obat obat = new Obat(); 
        int i;
        System.out.println("=====APOTEK FELIX=====");
        obat.tampilkanObat();
        System.out.println("======================\n");
        System.out.print("Nama : ");
        String nama = in.nextLine();
        System.out.print("Alamat : ");
        String alamat = in.nextLine();
        isi.setData(nama, alamat);
}
