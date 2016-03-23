package BAB3;

public class ubahKataAngka {

    String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    String hasil = " ";

    String overloadingMeth(int satuan) {
        String hasil = " ";
        if (satuan < 12) {
            hasil = hasil + huruf[satuan];
        } else if (satuan < 20) {
            hasil = hasil + overloadingMeth(satuan - 10) + " Belas";
        } else if (satuan < 100) {
            hasil = hasil + overloadingMeth(satuan / 10) + " Puluh " + overloadingMeth(satuan % 10);
        } else if (satuan == 100) {
            hasil = hasil + "Seratus";
        }
        return hasil;
    }

