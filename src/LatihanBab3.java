/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author irwin deriyan
 */class Resep {

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


public class LatihanBab1 {
    public static void main(String[] args) {
        System.out.println("tess");
        
        
    }
    
}
