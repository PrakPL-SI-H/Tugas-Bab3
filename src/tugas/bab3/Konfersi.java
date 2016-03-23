
package mainkonfersi;

public class Konfersi {
public String overloadingMeth(int x) {
        String a[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String huruf = null;
        if (x < 12) {
            huruf = ("" + a[x]);
        } else if (x < 20) {
            huruf = (overloadingMeth(x - 10) + " belas ");
        } else if (x < 100) {
            huruf = (overloadingMeth(x / 10) + " puluh " + overloadingMeth(x % 10));
        }
        return huruf;
    }
    public int overloadingMeth(String x) {
        String cek[] = x.split("\\s+");
        int angka = 0;
        for (String isi : cek) {
            if (isi.equalsIgnoreCase("satu")) {
                angka += 1;
            } else if (isi.equalsIgnoreCase("dua")) {
                angka += 2;
            } else if (isi.equalsIgnoreCase("tiga")) {
                angka += 3;
            } else if (isi.equalsIgnoreCase("empat")) {
                angka += 4;
            } else if (isi.equalsIgnoreCase("lima")) {
                angka += 5;
            } else if (isi.equalsIgnoreCase("enam")) {
                angka += 6;
            } else if (isi.equalsIgnoreCase("tujuh")) {
                angka += 7;
            } else if (isi.equalsIgnoreCase("delapan")) {
                angka += 8;
            } else if (isi.equalsIgnoreCase("sembilan")) {
                angka += 9;
            } else if (isi.equalsIgnoreCase("puluh")) {
                angka *= 10;
            } else if (isi.equalsIgnoreCase("sebelas")) {
                angka += 11;
            } else if (isi.equalsIgnoreCase("belas")) {
                angka += 10;
            } else if (isi.equalsIgnoreCase("sepuluh")) {
                angka += 10;
            }
        }
        return angka;
    }
}
