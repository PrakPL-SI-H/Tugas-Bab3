package overloadmain;

public class overloadingMeth {

    String[] teks = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    String[] bilangan = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    int belas, b, c;

    public void overloadingMeth(int a) {
        if (a < 12) {
            System.out.println(teks[a]);
        } else if (a >= 12 && a <= 19) {
            belas = a % 10;
            System.out.println(teks[belas] + " belas");
        } else if (a >= 20 && a <= 99) {
            b = a % 10;
            c = a / 10;
            System.out.println(teks[c] + " puluh " + teks[b]);
        } else if (a == 100) {
            System.out.println(" seratus");
        } else {
            System.out.println("Bilangan yang Anda masukkan lebih dari 100");
        }
    }

    public static String overloadingMeth(String h) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
        String angka[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] bil = h.split(" ");
        String value = "";
        for (int i = 0; i < bil.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (bil.length == 3) {
                    if (bil[i].indexOf(huruf[j]) >= 0) {
                        value = value + angka[j];
                    }
                } else if (bil.length == 2) {
                    if (bil.length == 2 && bil[1].equalsIgnoreCase("puluh") && bil[i].equalsIgnoreCase(huruf[j])) {
                        value = angka[j] + "0";
                    } else if (bil.length == 2 && bil[1].equalsIgnoreCase("belas") && bil[0].equalsIgnoreCase(huruf[j])) {
                        value = "1" + angka[j];
                    }
                } else {
                    if (bil[0].equalsIgnoreCase("sebelas")) {
                    } else if (bil[0].equalsIgnoreCase("seratus")) {
                        value = "100";
                    } else if (bil[0].equalsIgnoreCase(huruf[j])) {
                        value = angka[j];
                    } else {
                        value = "11";
                    }
                }
            }
        }
        return value;
    }

}
