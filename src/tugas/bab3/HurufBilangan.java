//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package hurufbilangan;

import java.util.Scanner;

public class HurufBilangan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClassBilangan angka = new ClassBilangan();
        int pilih,a;
        String b;
        do {
            System.out.println("");
            System.out.println("=====PERUBAH ANGKA DAN HURUF=====");
            System.out.println("MENU");
            System.out.println("1. Ubah angka jadi teks (1-100)");
            System.out.println("2. Ubah teks jadi angka (1-100)");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            pilih = in.nextInt();
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan angka : ");
                    a = in.nextInt();
                    System.out.println("Teks : " + angka.rubah(a));
                    break;
                case 2:
                    System.out.print("Masukkan teks : ");
                    b = in.nextLine();
                    b = in.nextLine();
                    System.out.println("Angka : " + angka.rubah(b));
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.print("Pilihan anda tidak ada");
                    break;
            }
        } while (pilih != 0);
    }
}
