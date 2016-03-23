package Apotek;

public class Apotek {

    public String nama;
    public String alamat;
    private static int total = 0;

    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void obat(int menu, int banyak) {
        
        if (menu == 1) {
            System.out.println("Ademsari 2000 x " + banyak);
            HitungTotal(2000, banyak);
        } else if (menu == 2) {
            System.out.println("Amoxcilin 2500 x " + banyak);
            HitungTotal(2500, banyak);
        } else if (menu == 3) {
            System.out.println("Antangin 5000 x " + banyak);
            HitungTotal(5000, banyak);
        } else if (menu == 4) {
            System.out.println("Cap Kaki Tiga 500ml 15500 x " + banyak);
            HitungTotal(15500, banyak);
        } else if (menu == 5) {
            System.out.println("Minyak Kayu Putih 10000 x " + banyak);
            HitungTotal(10000, banyak);
        } else if (menu == 6) {
            System.out.println("Fresh Care 11000 x " + banyak);
            HitungTotal(11000, banyak);
        } else if (menu == 7) {
            System.out.println("Cefadroxil 7500 x " + banyak);
            HitungTotal(7500, banyak);
        } else if (menu == 8) {
            System.out.println("Tolak Angin 9000 x " + banyak);
            HitungTotal(9000, banyak);
        } else if (menu == 9) {
            System.out.println("Cap Badak 13000 x " + banyak);
            HitungTotal(13000, banyak);
        } else if (menu == 10) {
            System.out.println("Bodrex  4500 x " + banyak);
            HitungTotal(4500, banyak);
        } else {
            System.out.println("Sold Out");
        }
    }

    public static void HitungTotal(int x, int y) {
        total = total + (x * y);
        double p = x;
        double q = y;
        System.out.println("Jumlah Harga Barang = " + HitungTotal(p, q));
        System.out.println("========================================");
    }
    
    
    public static double HitungTotal(double p, double q) {
        double c = p * q;
        return c;
    }

    public void displaymessage() {
        System.out.println("========================================");
        System.out.println("            DATA PEMBELI OBAT           ");
        System.out.println("Pembeli Atas Nama  : " + nama);
        System.out.println("Beralamat Di       : " + alamat);
        System.out.println("Total Yang Harus Dibayarkan : Rp " + total + ",-");
        System.out.println("========================================");
    }
}
