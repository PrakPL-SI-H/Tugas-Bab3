package mainapotek;

import java.util.Scanner;

public class DataApotek {
    private String nama, alamat;
    Apotek [] obat = new Apotek [6];
    private int no=0,DH=0;
    Scanner s = new Scanner(System.in);
    
    public DataApotek(){
    }
    
    public void DataApotek(String nama, String alamat){
        this.nama= nama;
        this.alamat= alamat;
    }
    
    public void daftar(){
        int pilih;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("|   No    Kode    Nama Obat         Harga    |");
            System.out.println("|   1.    KO123   Obat Gata         Rp. 5000 |");
            System.out.println("|   2.    KO990   Obat Sakit Kepala Rp. 3500 |");
            System.out.println("|   3.    KO784   Obat Sakit Gigi   Rp. 3000 |");
            System.out.println("|   4.    KO226   Obat Demam        RP. 2800 |");
            System.out.println("|   5.    KO888   Obat Batuk        Rp. 4900 |");
            System.out.println("|   6.    KO992   Obat Flu          Rp. 2500 |");
            System.out.println("----------------------------------------------");
            System.out.println("|   0.    Keluar                             |");
            System.out.print("Masukkan pilihan anda : ");
            pilih = s.nextInt();
            switch (pilih){
                case 1;
            }
        } 
        
        
    }
}
