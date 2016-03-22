
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */
class Resep {

    String nama, alamat, obat;
    int harga, jumlah;

    public Resep() {
    }

    public Resep(String a, String b) {
        nama = a;
        alamat = b;
    }

    public void setNama(String a) {
        nama = a;
    }

    public void Data(int a) {
        jumlah = a;
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    public int pilihObat(String a) {
        obat = a;
        if (obat.equals("BODREX")) {
            harga += 10000;
        } else if (obat.equals("PARACETAMOL")) {
            harga += 20000;
        } else if (obat.equals("KONIDIN")) {
            harga += 30000;
        } else if (obat.equals("PONSTAN")) {
            harga += 40000;
        } else if (obat.equals("OSKADON")) {
            harga += 50000;
        } else {
            System.out.println("Obat tidak tersedia");
        }
        return harga;
    }

    public void Data() {
        System.out.println("==========DATA PEMBELIAN==========");
        System.out.println("Nama Anda                       : " + nama);
        System.out.println("Alamat Anda                     : " + alamat);
        System.out.println("Harga Yang Harus Dibayar        : " + harga);
    }
}

public class LatihanBab1 {

    public static void main(String[] args) {
        System.out.println("tess");
        Scanner in = new Scanner(System.in);
        Resep pelanggan = new Resep();
        System.out.println("==========SELAMAT DATANG DI SISTEM INFORMASI APOTEK==========");
        System.out.print("Masukkan Nama     : ");
        pelanggan.setNama(in.next());
        System.out.print("Masukkan Alamat   : ");
        pelanggan.setAlamat(in.next());
        System.out.println("1. BODREX           Rp. 10000");
        System.out.println("2. PARACETAMOL      Rp. 20000");
        System.out.println("3. KONIDIN          Rp. 30000");
        System.out.println("4. PONSTAN          Rp. 40000");
        System.out.println("5. OSKADON          Rp. 50000");
        System.out.print("Masukkan Jumlah Obat yang dibeli : ");
        pelanggan.Data(in.nextInt());
        for (int i = 0; i < pelanggan.jumlah; i++) {
            System.out.print("Masukkan Nama Obat : ");
            pelanggan.pilihObat(in.next());
        }
        System.out.println("");
        pelanggan.Data();

    }

}
