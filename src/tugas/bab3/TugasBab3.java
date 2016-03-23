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
         System.out.println(obat[i]+"  "+harga[i]);
     }
     public void daftarObat(String pilih, int jumlah){
         
             
         
     }
     
}






public class TugasBab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] daftar = {"ObatA","ObatB","ObatC"};
        int Harga[] ={10000,12000,13000};
        System.out.print("Masukkan Nama   : ");
        String nama = in.next();
        System.out.print("Masukkan Alamat : ");
        String alamat = in.next();
        Apotek user = new Apotek(nama, alamat);
        Apotek obat = new Apotek(daftar, Harga);
    }
    
}
