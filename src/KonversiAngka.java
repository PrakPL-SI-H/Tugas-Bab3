package javaapplication10;

public class KonversiAngka {

    private final String[] huruf = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    private String nHuruf;

    private final String[] nomor = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private String nNomor;

    public String ambilHasilHuruf() {
        return nHuruf;
    }

    public String ambilHasilNomor() {
        return nNomor;
    }

    public String overloadingMeth(int nomor) {
        nHuruf = "";
        if (nomor < 12) {
            nHuruf += huruf[nomor];
        } else if (nomor < 20) {
            nHuruf += huruf[nomor - 10] + " Belas";
        } else if (nomor < 100) {
            nHuruf += huruf[nomor / 10] + " Puluh " + huruf[nomor % 10];
        } else if (nomor == 100) {
            nHuruf = "Seratus";
        } else if (nomor == 0) {
            nHuruf = "Nol";
        } else if (nomor > 100) {
            System.out.println("Range untuk input adalah 1-100");
        }
        return nHuruf;
    }

    public String overLoadingMeth(String huruf) {
        for (int i = 0; i < this.huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nNomor = nomor[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nNomor = nomor[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " belas")) {
                    nNomor = nomor[1] + nomor[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh")) {
                    nNomor = nomor[i] + nomor[0];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh " + this.huruf[j])) {
                    nNomor = nomor[i] + nomor[j];
                } else if (huruf.equalsIgnoreCase("Seratus")) {
                    nNomor = nomor[1] + nomor[0] + nomor[0];
                }
            }
        }
        return nNomor;
    }

    public static void display() {
        System.out.println("====== Aplikasi konversi angka dan huruf ======");
        System.out.println("1. Konversi angka ke bentuk huruf : ");
        System.out.println("2. Konversi huruf ke bentuk angka : ");
        System.out.print("Masukkan pilihan : ");
    }
}
