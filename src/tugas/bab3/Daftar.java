
import java.util.Scanner;

public class Daftar {

private int harga;
private int tmb;
private int jumlah;
public int total;
public String Alamat;
public String Nama;
public int pilih;

Scanner in = new Scanner(System.in);
public void menu(){
    System.out.println("Menu");
    System.out.println("No Nama Obat            Harga ");
    System.out.println("1. Obat Sakit Kepala   Rp 5000");
    System.out.println("2. Obat Sakit Gigi     Rp 6000");
    System.out.println("3. Obat Sakit Flu      Rp 7000");
    System.out.println("4. Obat Sakit Panas    Rp 6500");
    System.out.println("5. Obat Sakit Pusing   Rp 5000");
    System.out.println("6. Obat Pegel Linu     Rp 10000");
}
    public String Alamat(){
    return Alamat;
}
    public String Nama(){
    return Alamat;
}
public void pilihan(int pilih){
    if ( pilih == 1){
        System.out.println("Obat yang dibeli = Obat Sakit Kepala");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 5000 * tmb;
        total = harga ;
        total++ ;
    }else if (pilih == 2){
        System.out.println("Obat yang dibeli = Obat Sakit Gigi");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 6000 * tmb;
        total = harga ;
        total++ ;
    }else if (pilih == 3){
        System.out.println("Obat yang dibeli = Obat Sakit Flu");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 7000 * tmb;
        jumlah = total;
        total++ ;
        }else if (pilih == 4){
        System.out.println("Obat yang dibeli = Obat Sakit Panas");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 6500 * tmb;
        total = harga ;
        total++ ;
        }else if (pilih == 5){
        System.out.println("Obat yang dibeli = Obat Sakit Pusing");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 5000 * tmb;
        total = harga ;
        total++ ;
        }else if (pilih == 6){
        System.out.println("Obat yang dibeli = Obat Sakit Linu");
        System.out.println("Berapa Obat yang dibeli =");
        tmb = in.nextInt();
        jumlah = 10000 * tmb;
        total = harga ;
        total++ ;
        }else{
        System.out.println("Yang anda pilih tidak tersedia !!!");
        }
} 

}

