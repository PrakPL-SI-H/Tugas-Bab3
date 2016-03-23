package tugas.bab3;

import java.util.Scanner;

public class MainRubahHurufAngka {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        RubahHurufAngka rubah = new RubahHurufAngka();
        System.out.println("Konversi");
        System.out.println("1.Konversi Huruf Ke Angka\n" + "2. Konversi Angka Ke Huruf");
        System.out.println("Masukan pilihan: ");
        int pil = in.nextInt();

        switch (pil) {
            case 1:
                System.out.println("Masukan teks yang dikonvert: ");
                String t = in.nextLine();
                String spasi[] = t.split(" ");
                if (spasi.length == 1) {
                    System.out.println("Output: " + rubah.overloadingMeth(spasi[0]));
                } else if (spasi.length == 2) {
                    System.out.println("Output: " + rubah.overloadingMeth(spasi[0]));
                }
        }
    }
}
