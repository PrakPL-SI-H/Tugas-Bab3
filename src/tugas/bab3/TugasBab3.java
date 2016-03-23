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
           if (pilih.equalsIgnoreCase("ObatA")){
             beliObat = pilih;
             this.jumlah = jumlah;
             hargaTotal = harga[0]*jumlah;
         }
            else if (pilih.equalsIgnoreCase("ObatB")){
             beliObat = pilih;
             this.jumlah = jumlah;
             hargaTotal = harga[1]*jumlah;
         }
            else if (pilih.equalsIgnoreCase("ObatA")){
             beliObat = pilih;
             this.jumlah = jumlah;
             hargaTotal = harga[2]*jumlah;
         }
            else{
               System.out.println("Obat Tidak Di temukan");
            }   
         } 
     public void showObat(){
         System.out.println("Obat yang anda beli : "+beliObat);
         System.out.println("dengan Jumlah       : "+jumlah);
         System.out.println("Total Harga adalah  : "+hargaTotal);    
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
        do{
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
                    System.out.println("=====Pilihan Obat=====");
                    System.out.print("Masukkan Obat   : ");
                    String pilih = in.next();
                    System.out.print("Masukkan Jumlah : ");
                    int jumlah = in.nextInt();
                    obat.daftarObat(pilih, jumlah);  
                    break; 
                case 3:
                    System.out.println("=====Kuitansi Obat=====");
                    obat.showObat();
                    break;
                case 4: 
                    System.out.println("Terimakasih");
                default:
                    System.out.println("Pilihan Tidak Tersedia !!");
            }
        }while(pilihan!=4);
    }   
}
