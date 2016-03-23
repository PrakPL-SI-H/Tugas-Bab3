package mainapotek;

public class apotek {

    String nama, alamat;
    int kode, n;
    private static int total = 0;

    public apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public apotek(int kode, int n) {
        this.kode = kode;
        this.n = n;
        if (kode == 1) {
            System.out.println("Ampicilin");
            System.out.println("8500  x " + n);
            jumlahTotal(8500, n);
        } else if (kode == 2) {
            System.out.println("Antalgin");
            System.out.println("5000  x " + n);
            jumlahTotal(5000, n);
        } else if (kode == 3) {
            System.out.println("Antimo Anak");
            System.out.println("2000  x " + n);
            jumlahTotal(2000, n);
        } else if (kode == 4) {
            System.out.println("Betadine");
            System.out.println("9000  x " + n);
            jumlahTotal(9000, n);
        } else if (kode == 5) {
            System.out.println("Bisolvion");
            System.out.println("7500  x " + n);
            jumlahTotal(7500, n);
        } else if (kode == 6) {
            System.out.println("Bodrex");
            System.out.println("5000  x " + n);
            jumlahTotal(5000, n);
        } else if (kode == 7) {
            System.out.println("Cefadroxil");
            System.out.println("9000  x " + n);
            jumlahTotal(9000, n);
        } else if (kode == 8) {
            System.out.println("Decolgen");
            System.out.println("2500  x " + n);
            jumlahTotal(2500, n);
        } else if (kode == 9) {
            System.out.println("GG");
            System.out.println("3000  x " + n);
            jumlahTotal(3000, n);
        } else if (kode == 10) {
            System.out.println("Paracetamol");
            System.out.println("5000  x " + n);
            jumlahTotal(5000, n);
        } else if (kode == 11) {
            System.out.println("Paramex");
            System.out.println("2500  x " + n);
            jumlahTotal(2500, n);
        } else if (kode == 12) {
            System.out.println("Rhinos");
            System.out.println("30000 X " + n);
            jumlahTotal(30000, n);
        } else {
            System.out.println("Pilihan Yang Anda Masukkan Salah");
        }
    }

    public static void jumlahTotal(int item, int jumlah) {
        total = total + (item * item);
        double a = Double.valueOf(item);
        double b = Double.valueOf(jumlah);
        System.out.println("=====================================================");
        System.out.println("Jumlah = " + jumlahTotal(a, b));
        System.out.println("=====================================================");

    }

    public static double jumlahTotal(double harga, double jlh) {
        double hasil = harga * jlh;
        return hasil;
    }

    public void tampilkan() {
        System.out.println("Nama              : " + nama);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Total             : Rp " + total + ",-");
    }

}
