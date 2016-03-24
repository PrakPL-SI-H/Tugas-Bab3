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
    //method untuk menampilkan data obat
    public void DataObat(int i){
         System.out.print(obat[i]+": "+harga[i]);
    }
    }


    



public class TugasBab3 {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
