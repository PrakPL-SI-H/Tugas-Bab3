package tugas.bab3;

import java.util.Scanner;

public class MainRubahHurufAngka {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        RubahHurufAngka rubah = new RubahHurufAngka();
        while (true) {
            System.out.println("\n======Konversi======\n");
            System.out.println("1. Konversi Huruf Ke Angka\n" + "2. Konversi Angka Ke Huruf\n"+"3. Exit");
            System.out.print("Masukan pilihan: ");
            int pil = in.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("Masukan teks yang dikonvert: ");
                    in.nextLine();
                    String t = in.nextLine();
                    String spasi[] = t.split(" ");
                    if (spasi.length == 1) {
                        System.out.println("Output: " + rubah.overloadingMeth(spasi[0]));
                    } else if (spasi.length == 2 && spasi[1].equalsIgnoreCase("belas")) {
                        System.out.println("Output: " + rubah.overloadingMeth(spasi[1]) + rubah.overloadingMeth(spasi[0]));
                    } else if (spasi.length == 2 && spasi[1].equalsIgnoreCase("puluh")) {
                        System.out.println("Output: " + rubah.overloadingMeth(spasi[0]) + 0);
                    } else if (spasi.length == 3) {
                        System.out.println("Output : " + rubah.overloadingMeth(spasi[0]) + rubah.overloadingMeth(spasi[2]));
                    }
                    break;
                case 2:
                    System.out.println("Masukkan angka yang dikonversi: ");
                    int s = in.nextInt();
                    rubah.overloadingMeth(s);
                    rubah.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Masukkan data yang benar");
            }
        }
    }
}
