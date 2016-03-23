package tugas;
public class overload {

    private static String[] huruf = {"", "SATU", "DUA", "TIGA", "EMPAT", "LIMA", "ENAM",
                                           "TUJUH", "DELAPAN", "SEMBILAN", "SEPULUH", "SEBELAS"};
    private static String hasilHuruf;

    private static String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static String hasilAngka;

    public static String getHasilHuruf() {
        return hasilHuruf;
    }

    public static String overloadingMeth(int angka) {
        hasilHuruf = "";
        if (angka < 12) {
            hasilHuruf = hasilHuruf + huruf[angka];
        } else if (angka < 20) {
            hasilHuruf = hasilHuruf + huruf[angka - 10] + " BELAS";
        } else if (angka <= 99) {
            hasilHuruf = hasilHuruf + huruf[angka / 10] + " PULUH " + huruf[angka % 10];
        } else if (angka == 100) {
            hasilHuruf = "SERATUS";
        } else if (angka > 100) {
            System.err.println("Nilai yang harus dimasukkan 0-100");
        }
        return hasilHuruf;
    }

    public String getHasilAngka() {
        return hasilAngka;
    }

    public String overloadingMeth(String huruf) {
        for (int a = 0; a < this.huruf.length; a++) {
            for (int b = 0; b < 10; b++) {
                if (huruf.equalsIgnoreCase(this.huruf[a])) {
                    hasilAngka = angka[a];
                } else if (huruf.equalsIgnoreCase(this.huruf[a])) {
                    hasilAngka = angka[a];
                } else if (huruf.equalsIgnoreCase(this.huruf[a] + " BELAS")) {
                    hasilAngka = angka[1] + angka[a];
                } else if (huruf.equalsIgnoreCase(this.huruf[a] + " PULUH")) {
                    hasilAngka = angka[a] + angka[0];
                } else if (huruf.equalsIgnoreCase(this.huruf[a] + " PULUH " + this.huruf[b])) {
                    hasilAngka = angka[a] + angka[b];
                } else if (huruf.equalsIgnoreCase("SERATUS")) {
                    hasilAngka = angka[1] + angka[0] + angka[0];
                }
            }
        }
        return hasilAngka;
    }
}
