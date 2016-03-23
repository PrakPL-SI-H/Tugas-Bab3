package tugas.bab3;

public class RubahHurufAngka {

    public int angka = 0;
    public String hasil = "";
    public String kata[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam",
        "tujuh", "delapan", "sembilan", "sepuluh", "sebelas", "seratus"};

    public int overloadingMeth(String angka) {
        if (angka.equalsIgnoreCase("nol")) {
            this.angka = 0;
        } else if (angka.equalsIgnoreCase("satu")) {
            this.angka = 1;
        } else if (angka.equalsIgnoreCase("dua")) {
            this.angka = 2;
        } else if (angka.equalsIgnoreCase("tiga")) {
            this.angka = 3;
        } else if (angka.equalsIgnoreCase("empat")) {
            this.angka = 4;
        } else if (angka.equalsIgnoreCase("lima")) {
            this.angka = 5;
        } else if (angka.equalsIgnoreCase("enam")) {
            this.angka = 6;
        } else if (angka.equalsIgnoreCase("tujuh")) {
            this.angka = 7;
        } else if (angka.equalsIgnoreCase("delapan")) {
            this.angka = 8;
        } else if (angka.equalsIgnoreCase("sembilan")) {
            this.angka = 9;
        } else if (angka.equalsIgnoreCase("sepuluh")) {
            this.angka = 10;
        } else if (angka.equalsIgnoreCase("sebelas")) {
            this.angka = 11;
        } else if (angka.equalsIgnoreCase("belas")) {
            this.angka = 1;
        } else if (angka.equalsIgnoreCase("seratus")) {
            this.angka = 100;
        }
        return this.angka;
    }

    public String overloadingMeth(int angka) {
        if (angka >= 0 && angka <= 100) {
            if (angka < 12) {
                hasil = kata[angka];
            } else if (angka < 20) {
                hasil = hasil + overloadingMeth(angka - 10) + " belas";
            } else if (angka % 10 == 0) {
                hasil = overloadingMeth(angka / 10) + " puluh";
            } else if (angka < 100) {
                hasil = overloadingMeth(angka / 10) + " puluh " + overloadingMeth(angka % 10);
            } else if (angka == 100) {
                hasil = kata[12];
            }
        } else {
            System.out.println("Masukkan antara 0-100");   
        }
        return hasil;
    }

    public void display() {
        System.out.println("Output: " + hasil);
    }
}
