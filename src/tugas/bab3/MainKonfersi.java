
package mainkonfersi;

import java.util.Scanner;

public class MainKonfersi {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Konfersi angka = new Konfersi();
        System.out.println("Program perubah angka");
        System.out.println("Pilihan :");
        System.out.println("1. Angka menjadi kata");
        System.out.println("2. Kata menjadi angka");
        System.out.print("Masukkan pilihan anda : ");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.print("Masukkan angka yang ingin anda rubah : ");
                int y = input.nextInt();
                System.out.println("Maka hasilnya adalah : " + angka.overloadingMeth(y));
                break;
            case 2:
                System.out.print("Masukkan kata yang ingin anda rubah : ");
                input.nextLine();
                String z = input.nextLine();
                System.out.println("Maka hasilnya adalah : " + angka.overloadingMeth(z));
                break;
            default:
                System.out.println("Angka yang anda masukkan tidak valid.");
        }
    }
}

