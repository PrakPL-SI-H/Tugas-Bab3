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