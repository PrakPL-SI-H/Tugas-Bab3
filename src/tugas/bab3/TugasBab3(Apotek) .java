package tugas.bab3;
import java.util.Scanner;
class MainApotek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Apotek apotek = new Apotek();
        System.out.println("Selamat Datang di Apotek Ini");
        System.out.print("Masukkan Nama Anda : ");
        apotek.nama=input.next();
        System.out.print("Masukkan Alamat Anda : ");
        apotek.alamat=input.next();
        int pilih;
        do {
        System.out.println("Menu");
        System.out.println("1. Daftar Obat");
        System.out.println("2. Pilihan Obat");
        System.out.println("3. Total harga");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1 : 
                apotek.obat();
                System.out.println();
                break;
            case 2 : 
            System.out.print("Masukkan jumlah obat = ");
             int jumlah =input.nextInt();
             for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama Obat : ");
            apotek.obat(input.next());
             } System.out.println(); 
             break;
            case 3 : 
                apotek.totalHarga();
                System.out.println();
                break;
            case 4 : 
                System.out.println("Terimakasih..");
                System.exit(0);
                break;
            default :
                System.out.println("Angka yang anda masukkan kurang tepat");
        }    
        }while (pilih !=4);
    }
}
public class Apotek {
    String nama, alamat;
    int harga;
    public Apotek(){
    }
    public Apotek(String n, String a){
        nama=n;
        alamat=a;
    }
    void obat() {
        System.out.println("Jenis Obat            Harga");
        System.out.println("Parasetamol        Rp 10.000,-");
        System.out.println("Promag             Rp 5.000,-");
        System.out.println("Panadol            Rp 15.000,-");
        System.out.println("Salonpas           Rp 10.000,-");
        System.out.println("CTM                Rp 25.000,-");
        System.out.println("Neozep             Rp 20.000,-");
    }
        int obat(String n) {
        if (n.equalsIgnoreCase("Parasetamol")) {
            harga = harga+10000;
        } else if (n.equalsIgnoreCase("Promag")) {
            harga = harga+ 5000;
        } else if (n.equalsIgnoreCase("Panadol")) {
            harga = harga + 15000;
        } else if (n.equalsIgnoreCase("Salonpas")) {
            harga = harga + 10000;
        } else if (n.equalsIgnoreCase("CTM")) {
            harga = harga + 25000;
        } else if (n.equalsIgnoreCase("Neozep")) {
            harga = harga + 20000;
        } else {
            System.out.println("Silahkan memilih obat yang terdapat pada pilihan.");   }
        return harga;    }
    void totalHarga (){
        System.out.println("Nama   = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Jumlah biaya yang anda bayarkan adalah : Rp  " + harga+",-");
    }
}
