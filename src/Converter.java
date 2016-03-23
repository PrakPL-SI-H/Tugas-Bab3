package Converter;

public class Converter {

    public int g;
    public String b = "";

    public String OverloadingMeth(int angka) {
        String[] bilangan = {"", "satu", "dua", "tiga",
            "Empat", "lima", "enam", "tujuh",
            "delapan", "sembilan", "sepuluh", "sebelas"};
        if (angka < 12) {
            b = bilangan[angka];
        } else if (angka < 20) {
            b = OverloadingMeth(angka - 10) + " belas ";
        } else if (angka < 100) {
            b = OverloadingMeth(angka / 10) + " puluh " + OverloadingMeth(angka % 10);
        } else if (angka == 100) {
            b = " seratus ";
        } else {
            b = " ";
        }
        return b;
    }

    public String OverloadingMeth(String tulis) {
        String[] bilangan = {"nol", "satu", "dua", "tiga",
            "empat", "lima", "enam", "tujuh",
            "delapan", "sembilan", "sepuluh", "sebelas"};
        for (int a = 0; a < bilangan.length; a++) {
            for (int t = 0; t < bilangan.length; t++) {
                if (tulis.equalsIgnoreCase(bilangan[a])) {
                    g = a;
                    b = Integer.toString(g);
                } else if (tulis.equalsIgnoreCase("seratus")) {
                    g = 100;
                    b = Integer.toString(g);
                } else if (tulis.equalsIgnoreCase(bilangan[a] + " puluh " + bilangan[t])) {
                    g = a;
                    b = Integer.toString(g);
                    g = t;
                    b = b + Integer.toString(g);
                } else if (tulis.equalsIgnoreCase(bilangan[a] + " puluh")) {
                    g = a;
                    b = Integer.toString(g);
                    g = 0;
                    b = b + Integer.toString(g);
                } else if (tulis.equalsIgnoreCase(bilangan[a] + " belas")) {
                    g = 1;
                    b = Integer.toString(g);
                    g = a;
                    b = b + Integer.toString(g);
                }
            }
        }
        return b;
    }
}
