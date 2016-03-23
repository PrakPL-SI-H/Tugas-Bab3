
import java.util.Scanner;

public class MainApotik {
    public static void main(String[] args) {
        Daftar obat = new Daftar();
        int i;
        Scanner ini = new Scanner(System.in);
        System.out.println("Nama   = ");
        obat.Nama = ini.nextLine();
        System.out.println("Alamat = ");
        obat.Alamat = ini.nextLine();
        do{
        System.out.println("Menu");
        System.out.println("1.Pilih Obat");
        System.out.println("2.Total Harga");
        System.out.println("9.keluar");
        System.out.println("Masukkan Urutan = ");
        i = ini.nextInt();
        switch (i){
            case 1 : 
            case 2 : 
        }
    }while(i    !=0);
        System.out.println("");
        
   }
}
