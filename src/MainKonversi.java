
import java.util.Scanner;

public class MainKonversi {

    public static void main(String[] args) {
        Konversi ubah = new Konversi();
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("------------------------------------");
            System.out.println("Konversi Bilangan<>Teks");
            System.out.println("1. Bilangan >> Teks[0-100]");
            System.out.println("2. Teks >> Bilangan[nol s/d seratus]");
            System.out.println("9. Keluar");
            System.out.print("Input menu: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Input bilangan[0 - 100]: ");
                    ubah.overloadingMeth(in.nextInt());
                    break;
                case 2:
                    String t = in.nextLine();
                    System.out.print("Input teks[nol s/d seratus]: ");
                    ubah.overloadingMeth(in.nextLine());
                    break;
            }
        } while (pilih != 9);
    }
}
