package overloadmain;

import java.util.Scanner;
import static overloadmain.overloadingMeth.overloadingMeth;

public class OverloadMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        overloadingMeth overl = new overloadingMeth();
        System.out.println("Bilangan --> Teks");
        System.out.print("Masukkan bilangan : ");
        int angka = in.nextInt();
        System.out.print("Huruf : ");
        overl.overloadingMeth(angka);
        System.out.println(" ");
        System.out.println("Teks --> Bilangan");
        System.out.print("Masukkan bilangan dalam bentuk teks : ");
        String teks = in.next();
        System.out.println("Angka : " + overloadingMeth(teks));
    }
}


