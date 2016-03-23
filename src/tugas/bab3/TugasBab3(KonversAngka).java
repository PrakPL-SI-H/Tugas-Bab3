package tugas.bab3;
	public class GantiAngka {
    String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    String jadiAngka;
    String[] huruf = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    String jadiHuruf;
    public String overloadingMeth(int a) {
        if (a == 100) {
            jadiHuruf = "Seratus";
        } else if (a < 12) {
            jadiHuruf = huruf[a];
        } else if (a < 20) {
            jadiHuruf = huruf[a - 10] + " belas";
        } else if (a < 100) {
            jadiHuruf = huruf[a / 10] + " puluh " + huruf[a % 10];
        } else if (a == 0) {
            jadiHuruf = "Nol";
        } else if (a > 100) {
            System.out.println("Angka tidak boleh lebih dari 100.");
        }
        return jadiHuruf;
    }
    public String overloadingMeth(String h) {
        for (int i = 0; i < this.huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (h.equalsIgnoreCase("seratus")) {
                    jadiAngka = angka[1] + angka[0] + angka[0];
                } else if (h.equalsIgnoreCase(this.huruf[i] + " belas")) {
                    jadiAngka = angka[1] + angka[i];
                } else if (h.equalsIgnoreCase(this.huruf[i] + " puluh")) {
                    jadiAngka = angka[i] + angka[0];
                } else if (h.equalsIgnoreCase(this.huruf[i] + " puluh " + this.huruf[j])) {
                    jadiAngka = angka[i] + angka[j];
                } else if (h.equalsIgnoreCase(this.huruf[i])) {
                    jadiAngka = angka[i];
                }
            }
        }
        return jadiAngka;
    }
}
class MainAngka {
    public static void main(String[] args) {
        GantiAngka angka = new GantiAngka();
        angka.overloadingMeth("Tiga puluh");
        System.out.println(angka.jadiAngka);
        angka.overloadingMeth(54);
        System.out.println(angka.jadiHuruf);
    }
}

