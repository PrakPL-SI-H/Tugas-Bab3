package pratikum3;

public class GantiAngka {

    static String Bil[] = {" ", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    static String Angka[] = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    public static void overloadingMeth(int a) {
        int b;
        if (a < 12) {
            System.out.println(Bil[a]);
        } else if (a < 20) {
            b = a % 10;
            System.out.println(Bil[b] + " belas");
        } else if (a < 100) {
            b = a % 10;
            int c = a / 10;
            System.out.println(Bil[c] + " puluh " + Bil[b]);
        } else if (a == 100) {
            System.out.println("Seratus");
        } else {
            System.out.println("Input Maksimaladalah 100");
        }
    }
}
