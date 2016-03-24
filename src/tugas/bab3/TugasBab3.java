package tugas.bab3;
import java.util.Scanner;
    //inisialisasi atribute untuk di gunakan dalam program 
    class SIApotik{
        public String nama, alamat, NamaObat;
        public int jumlah, total;
        public String obat[];
        public int harga[];
    //Constructor untuk obar[], dan harga[]    
    public SIApotik (String[] obat, int[] harga){
        this.obat = obat;
        this.harga = harga;
    }    
    public SIApotik (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    //method untuk menampilkan data obat
    public void DataObat(int i){
        System.out.print(obat[i]+": "+harga[i]);
    }
    //method untuk menampilkan daftar obat
    public void daftarObat(String pilih, int jumlah){
        if (pilih.equalsIgnoreCase("Decolgen")){
        NamaObat = pilih;
        this.jumlah = jumlah;
        total = harga[0]*jumlah;
        }else
        if (pilih.equalsIgnoreCase("Panadol")){
        NamaObat = pilih;
        this.jumlah = jumlah;
        total = harga[1]*jumlah;
        }else 
        if (pilih.equalsIgnoreCase("Aspirin")){
        NamaObat = pilih;
        this.jumlah = jumlah;
        total = harga[2]*jumlah;
        }else{
        System.out.println("Obat Tidak Di temukan");
            }   
         }
     public void List(){
         System.out.println("====LIST PEMBELIAN OBBAT====");
         System.out.println("Nama Obat   : "+NamaObat);
         System.out.println("Jumlah       : "+jumlah);
         System.out.println("Total Harga  : "+total);    
     }    
    }
public class TugasBab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        String[] daftar = {"Decolgen","Panadol","Aspirin"};
        int Harga[] ={10000,8000,11000};
        System.out.print("Masukkan Nama   : ");
        String nama = in.next();
        System.out.print("Masukkan Alamat : ");
        String alamat = in.next();
        SIApotik user = new SIApotik(nama, alamat);
        SIApotik obat = new SIApotik(daftar, Harga);
        do{
        System.out.println("-----======000000======-----");    
        System.out.println("Menu Sistem Informasi Apotek");
        System.out.println("============================");
        System.out.println("1. Daftar Obat"              );
        System.out.println("2. Pilihan Obat"             );
        System.out.println("3. Struk Pembelian Obat"            );
        System.out.println("4. Exit"                     );
        System.out.println("============================");
        System.out.print("Masukan Pilihan : "            );
            pilihan = in.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("---==Daftar Obat==---");
                    for (int i = 0; i < daftar.length; i++) {
                    obat.DataObat(i);
                    System.out.println();
                    }break;
                case 2:
                    System.out.println("---==Pilihan Obat==---");
                    System.out.print("Masukkan Obat   : ");
                    String pilih = in.next();
                    System.out.print("Masukkan Jumlah : ");
                    int jumlah = in.nextInt();
                    obat.daftarObat(pilih, jumlah);break; 
                case 3:
                    System.out.println("---==Struk Pembelian Obat==---");
                    obat.List();break;
                case 4: 
                    System.out.println("Keluar dari Program");break;
                default:
                    System.out.println("Masukan tidak valid");
            }
        }while(pilihan!=4);
    }       
}
