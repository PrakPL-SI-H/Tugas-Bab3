public class OverloadingMeth {
    String[] word = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    String[] number = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public void overloadingMeth(int num) {
        if (num == 0) {
            System.out.println("Nol");
        } else if (num < 12) {
            System.out.println(word[num]);
        } else if (num >= 12 && num <= 19) {
            int belas = num % 10;
            System.out.println(word[belas] + " belas");
        } else if (num >= 20 && num <= 99) {
            int x = num % 10;
            int y = num / 10;
            System.out.println(word[y] + " puluh" + word[x]);
        } else if (num == 100) {
            System.out.println("Seratus");
        } else {
            System.out.println("Angka yang Anda Masukkan Melebihi 100");
        }
    }
    public static String overloadingMeth(String huruff) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
        String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] no = huruff.split(" ");
        String hasil = "";
        for (int i = 0; i < no.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (no.length == 3) {
                    if (no[i].indexOf(huruf[j]) >= 0) {
                        hasil = hasil + num[j];
                    }
                } else if (no.length == 2) {
                    if (no.length == 2 && no[1].equalsIgnoreCase("puluh") && no[i].equalsIgnoreCase(huruf[j])) {
                        hasil = num[j] + "0";
                    } else if (no.length == 2 && no[1].equalsIgnoreCase("belas") && no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = "1" + num[j];
                    }
                } else {
                    if (no[0].equalsIgnoreCase("sebelas")) {
                        hasil = "11";
                    } else if (no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = num[j];
                    } else if (no[0].equalsIgnoreCase("seratus")) {
                        hasil = "100";
                    }
                }
            }
        }
        return hasil;
    }