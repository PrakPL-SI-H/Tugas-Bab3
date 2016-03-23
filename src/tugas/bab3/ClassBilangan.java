//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package hurufbilangan;

public class ClassBilangan {

    public String rubah(int b) {
        String a[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String huruf;
        if (b < 12) {
            huruf = ("" + a[b]);
        } else if (b < 20) {
            huruf = (rubah(b - 10) + " belas ");
        } else if (b < 100) {
            huruf = (rubah(b / 10) + " puluh " + rubah(b % 10));
        } else {
            huruf = "seratus";
        }
        return huruf;
    }

    public int rubah(String a) {
        String split[] = a.split(" ");
        int angka = 0;
        for (String isi : split) {
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
            } else {
                angka = 100;
            }
        }
        return angka;
    }
}
