public class Soal1 {

  public static void overloadingMeth(int angka) {

        int digit1, digit2;
        String str1[] = {"", "", "dua puluh", "tiga puluh", "empat puluh", "lima puluh",
            "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh", "seratus"};
        String str2[] = {" ", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh",
            "delapan", "sembilan", "sepuluh", "sebelas",
            "dua belas", "tiga belas", "empat belas", "lima belas",
            "enam belas", "tujuh belas", "delapan belas", "sembilan belas"};
        

            if ((angka < 1) || (angka > 100)) {
            System.err.println("Kesalahan pada input");
        } else if ((angka >= 1) && (angka <= 19)) {
System.out.println("======================================");
            System.out.println("Input\t: overloadingMeth(" +
angka + ")");
            System.out.println("Output\t: " + str2[angka]);
System.out.println("======================================");
        } else if ((angka >= 20) && (angka <= 100)) {
            digit1 = angka / 10;
            digit2 = angka % 10; System.out.println("======================================");
            System.out.println("Input\t: overloadingMeth(" + str1[digit1] + " " + str2[digit2] + ")");
            System.out.println("Output\t: " + str1[digit1] + " " + str2[digit2]);
System.out.println("======================================");
        }
    }
public static void overloadingMeth(String teks) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
        String angka[] = {"0", "1", "2", "3", "4", "5", "6",
"7", "8", "9"};
        String[] kata = teks.split(" ");
        String hasil = "";
        for (int x = 0; x < kata.length; x++) {
            for (int y = 0; y < huruf.length; y++) {
                if (kata.length == 3) {
                    if (kata[x].indexOf(huruf[y]) >= 0) {
                        hasil = hasil + angka[y];
                    }
                } else if (kata.length == 2) {
                    if (kata.length == 2
                            &&
kata[1].equalsIgnoreCase("puluh")
                            &&
kata[x].equalsIgnoreCase(huruf[y])) {
                        hasil = angka[y] + "0";
                    } else if (kata.length == 2
                            &&
kata[x].equalsIgnoreCase("belas")
                            &&
kata[0].equalsIgnoreCase(huruf[y])) {
                        hasil = "1" + angka[y];
                    }
                } else {
                    if (kata[0].equalsIgnoreCase("sebelas")) {
                        hasil = "11";
                    } else if
(kata[0].equalsIgnoreCase(huruf[y])) {
                        hasil = angka[y];
                    } else if
(kata[0].equalsIgnoreCase("seratus")) {
                        hasil = "100";
                    } else if
(kata[0].equalsIgnoreCase("sepuluh")) {
                        hasil = "10";
                    }
                }
            }
        }
System.out.println("======================================");
        System.out.println("Input\t: overloadingMeth(" + teks +
")");
        System.out.println("Output\t: " + hasil);
System.out.println("======================================");
    }
     public static void Menu() {
        System.out.println("====================\n"
                + "     Welcome\n"
                + "====================");
        System.out.println("1.Mengubah input angka menjadi teks\n"
                + "2.Mengubah input teks menjadi angka\n"
                + "3.Exit...\n");
   }
}

