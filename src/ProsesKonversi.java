package bab3konversiangka;

public class ProsesKonversi {

    String valueword;
    String valuenum;

    public void outputword() {
        System.out.println("Maka Hasil Konversinya : " + valueword);

    }

    public void outputnum() {
        System.out.println("Maka Hasil Konversinya : " + valuenum);

    }
    String[] normalword = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    public String overloadingMeth(int angka) {
        int x;
        x = angka % 10;
        valueword = "";
        if (angka == 0) {
            valueword = "Nol";

        } else if (angka == 100) {
            valueword = "Seratus";
        } else if (x == 0) {
            valueword += normalword[angka / 10] + " Puluh";

        } else if (angka < 12) {
            valueword += normalword[angka];
        } else if (angka < 20) {

            valueword += normalword[angka - 10] + " Belas";
        } else if (angka < 100) {
            valueword += normalword[angka / 10] + " Puluh " + normalword[angka % 10];
        } else if (angka > 100) {
            System.out.println("MASUKAN ERROR,ANGKA TIDAK BOLEH LEBIH DARI 100");
        }
        return valueword;
    }
}
