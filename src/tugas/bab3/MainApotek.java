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
        System.out.println("");
        do {
            System.out.print("Kode : ");
            i = in.nextInt();
            System.out.print("Jumlah : ");
            int j = in.nextInt();
            isi.setData(i,j);
        } while (i != 0);
        System.out.println("DAFTAR BELI");
        System.out.println("KODE  |  DESKRIPSI  |  Harga");
        isi.beli();
        System.out.println();
        System.out.println("======================");
        System.out.println("Total Harga Obat\t\t| " + isi.getHarga());
    }
}
