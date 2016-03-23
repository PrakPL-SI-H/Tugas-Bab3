package hurufbilangan;

public class ClassBilangan {
    public String rubah(int b) {
        String a[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String huruf = null;
        if (b < 12) {
            huruf = ("" + a[b]);
        } else if (b < 20) {
            huruf = (rubah(b - 10) + " belas ");
        } else if (b < 100) {
            huruf = (rubah(b / 10) + " puluh " + rubah(b % 10));
        }
        return huruf;
    }
}
