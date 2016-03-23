package program_Laporan;

public class Konversi {

    private final String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private String nilaiAngka;

    private final String[] huruf = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    private String nilaiHuruf;

    public String getHasilAngka() {
        return nilaiAngka;
    }
  public String overloadingMeth(int angka) {
        nilaiHuruf = "";
        if (angka < 12) {
            nilaiHuruf += huruf[angka];
        } else if (angka < 20) {
            nilaiHuruf += huruf[angka - 10] + " Belas";
        } else if (angka < 100) {
            nilaiHuruf += huruf[angka / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka == 100) {
            nilaiHuruf = "Seratus";
        } else if (angka == 0) {
            nilaiHuruf = "Nol";
        } else if (angka > 100) {
            System.err.println("Angka tidak boleh lebih dari 100,dan angka anda melebihi 100 ");
        }
        return nilaiHuruf;
    }
}