package Praktikum;
import java.util.Scanner;
public class MainAngkaHuruf {
    
    public static void main(String[] args) {
       Scanner puta = new Scanner(System.in);

        System.out.println("   PROGRAM KONVERSI ANGKA-KALIMAT/KALIMAT-ANGKA   ");
        int p;
        do {
            System.out.print("0.Keluar"
                    + "\n1.Angka-Kalimat"
                    + "\n2.Kalimat-Angka"
                    + "\nPilihan :");
            p = puta.nextInt();
            if (p==0){
                System.out.print("Terima kasih telah menggunakan layanan kami");
                break;}
            System.out.println();
            
            if (p == 1) {
                System.out.print("Masukkan angka  = ");

                int ang = puta.nextInt();
                AngkaHuruf one = new AngkaHuruf(ang);
                one.ubahAng();
            } else {
                System.out.print("Masukkan bilangan   = ");
                String k = puta.nextLine();
                String kal = puta.nextLine();
                AngkaHuruf two = new AngkaHuruf();
                System.out.println(two.ubahKal(kal));
            }
            System.out.println("\n-------------------------------------------------------");
        } while (p==1 || p==2);
    }
}