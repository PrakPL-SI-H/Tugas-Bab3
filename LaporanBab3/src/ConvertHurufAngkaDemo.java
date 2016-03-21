
import java.util.Scanner;


public class ConvertHurufAngkaDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        ConvertHurufAngka ang = new ConvertHurufAngka();
        ConvertHurufAngka hur = new ConvertHurufAngka();
        System.out.println("Masukkan angka : ");
        int angka = in.nextInt();
        System.out.println("Hasil Convert : ");
        ang.OverloadingMeth(angka);
    }
    
}
