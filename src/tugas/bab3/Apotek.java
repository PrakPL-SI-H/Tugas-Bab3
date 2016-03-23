package mainapotek;
public class Apotek {

    String nama, alamat;
    int menu, banyak;
    private static int total = 0;

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Apotek(int a, int b) {
        this.menu = a;
        this.banyak = b;
        if (menu == 1) {
            System.out.println("Paracetamol 5000 x " + banyak);
            HitungTotal(5000, banyak);
        } else if (menu == 2) {
            System.out.println("Decolgen 2000 x " + banyak);
            HitungTotal(2000, banyak);
        } else if (menu == 3) {
            System.out.println("Combantrin 25000 x " + banyak);
            HitungTotal(25000, banyak);
        } else if (menu == 4) {
            System.out.println("Antalgin 4500 x " + banyak);
            HitungTotal(4500, banyak);
        } else if (menu == 5) {
            System.out.println("Amoxilin 10000 x " + banyak);
            HitungTotal(10000, banyak);
        } else if (menu == 6) {
            System.out.println("Inzana 3000 x " + banyak);
            HitungTotal(3000, banyak);
        } else if (menu == 7) {
            System.out.println("Tolak Angin 7500 x " + banyak);
            HitungTotal(7500, banyak);
        } else if (menu == 8) {
            System.out.println("Bodrex  5500 x " + banyak);
            HitungTotal(5500, banyak);
        } else if (menu == 9) {
            System.out.println("Betadine 13000 x " + banyak);
            HitungTotal(13000, banyak);
        } else if (menu == 10) {
            System.out.println("Minyak Kayu Putih 9000 x " + banyak);
            HitungTotal(9000, banyak);
        } else {
            System.out.println("Pilihan Anda Tidak Ditemukan");
        }
    }

    public static void HitungTotal(int x, int y) {
        total = total + (x * y);
        double p = Double.valueOf(x);
        double q = Double.valueOf(y);
        System.out.println("Jumlah = " + HitungTotal(p, q));
        System.out.println("**************************************************");
    }

    public static double HitungTotal(double a, double b) {
        double c = a * b;
        return c;
    }
}