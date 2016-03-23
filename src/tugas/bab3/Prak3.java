package prak3;
import java.util.Scanner;
public class Prak3 {
public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        OverloadingMeth o = new OverloadingMeth();
        System.out.print("Input angka (1-100) : ");
        int angka = in.nextInt();
        System.out.print("Huruf : ");
        o.overloadingMeth(angka);
        System.out.println(" ");
        System.out.print("Input angka dalam huruf (Satu-Seratus) : ");
        String hur = in2.nextLine();
        System.out.println("Angka : "+o.overloadingMeth(hur));
    }
}	

