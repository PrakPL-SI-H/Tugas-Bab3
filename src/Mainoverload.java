package tugas;
import java.util.Scanner;
public class Mainoverload {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        overload konversiAngka = new overload();
        System.out.println("KONVERSI ANGKA KE HURUF");
        System.out.print("Masukkan Angka  : ");
        konversiAngka.overloadingMeth(input.nextInt());
        System.out.println("Hurufnya adalah : "+ konversiAngka.getHasilHuruf());
        
        System.out.println("\nKONVERSI HURUF KE ANGKA");
        System.out.print("Masukkan Huruf  : ");
        konversiAngka.overloadingMeth(input.nextLine());
        konversiAngka.overloadingMeth(input.nextLine());
        System.out.println("Angkanya adalah : "+ konversiAngka.getHasilAngka());
    }
}
