package tugas.bab3;

import java.util.Scanner;

class Apotek {
    public String nama;
     public String alamat;
     public String obat[];
     public int harga[];
     public String beliObat;
     public int jumlah, hargaTotal;
     public Apotek(String[] obat, int[] harga){
         this.obat = obat;
         this.harga = harga;
     }
     public Apotek(String nama, String alamat){
         this.nama = nama;
         this.alamat = alamat;
     }
     public void daftarObat(int i){
         System.out.print(obat[i]+"  "+harga[i]);
     }
     public void daftarObat(String pilih, int jumlah){
         
             
         
     }
     
}






public class TugasBab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        String[] daftar = {"ObatA","ObatB","ObatC"};
        int Harga[] ={10000,12000,13000};
        System.out.print("Masukkan Nama   : ");
            String nama = in.next();
        System.out.print("Masukkan Alamat : ");
            String alamat = in.next();
        Apotek user = new Apotek(nama, alamat);
        Apotek obat = new Apotek(daftar, Harga);
        System.out.println("=Menu Sistem Informasi Apotek=");
        System.out.println("1. Daftar Obat");
        System.out.println("2. Pilihan Obat");
        System.out.println("3. Kuitansi Obat");
        System.out.println("4. Exit");
        System.out.print("Masukan Pilihan : ");
            pilihan = in.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("=====Daftar Obat=====");
                    for (int i = 0; i < daftar.length; i++) {
                       obat.daftarObat(i);
                       System.out.println();
                    }
                    break;
                case 2:
                    
            }
    }
    
}
