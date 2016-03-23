
import java.util.Scanner;

public class MainSoal1 {

    public static void main(String[] args) {
        int pilih = 0;
        do {
            Soal1.Menu();
            Scanner oke = new Scanner(System.in);
            System.out.print("Masukan pilihan anda : ");
            pilih = oke.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.print("Soal 1. \nInput teks :");
                    String string = oke.nextLine();
                    string = oke.nextLine();
                    Soal1.overloadingMeth(string);
                    break;
                }
                case 2: {
                    System.out.print("Soal 2. \nInput bilangan: ");
                    int angka = oke.nextInt();
                    Soal1.overloadingMeth(angka);
                    break;
                }
                case 3: {
                    System.out.println("Terima Kasih");
                    break;
                }
            }
        } while (pilih != 3);
    }
}

