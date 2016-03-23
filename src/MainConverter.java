package Converter;

import java.util.Scanner;

public class MainConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Converter a1 = new Converter();
        System.out.println("=================================================");
        System.out.println("         Program Konverter range (0 - 100)       ");
        System.out.println("=================================================");
        System.out.print("Masukan bilangan (huruf)  = ");
        String b = in.nextLine();
        System.out.println("Data bilangan    (angka)  = " + a1.OverloadingMeth(b));
        System.out.println("=================================================");
        System.out.print("Masukan bilangan (angka)  = ");
        int a = in.nextInt();
        System.out.println("Data bilangan    (huruf)  = " + a1.OverloadingMeth(a));
        System.out.println("=================================================");
        System.out.println("   Terima Kasih Telah Mencoba Program Konverter  ");
    }
}
