public class Soal2 {

    public static void Menu() {
        System.out.println("====================\n"
                           + "     MATEMATIKA\n"
                           + "====================");
        System.out.println("1.Penjumlahan\n"
                + "2.pengurangan\n"
                + "3.Perkalian\n"
                + "4.Pembagian\n"
                + "5.Penyerderhanaan Pecahan\n"
                + "6.Exit...\n");
    }
    public static int FPB(int a, int b) {
        if (a > b) {
            if (a % b == 0) {
                return b;
            } else {
                return FPB(b, a % b);
            }
        } else {
            if (b % a == 0) {
                return a;
            } else {
                return FPB(a, b % a);
            }
        }
    }

    public void Sederhana(int a, int b) {
        if ((b / FPB(a, b) == 1)) {
            System.out.println("Hasil Penyederhanaan\t: " + (a
/ FPB(a, b)));
        } else {
            System.out.println("Hasil Penyederhanaan\t: " + (a / FPB(a, b)) + "/" + (b / FPB(a, b)));
        }
   }
    public static double Penjumlahan(double a, double b) {
        return a + b;
    }
    public static double Pengurangan(double a, double b) {
        return a - b;
    }
    public double Perkalian(double a, double b) {
        return a * b;
    }
    public double Pembagian(double a, double b) {
        return a / b;
    }
}


