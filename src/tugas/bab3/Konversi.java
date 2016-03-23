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
   public String overLoadingMeth(String huruf) {
        for (int i = 0; i < this.huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nilaiAngka = angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i])) {
                    nilaiAngka = angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " belas")) {
                    nilaiAngka = angka[1] + angka[i];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh")) {
                    nilaiAngka = angka[i] + angka[0];
                } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh " + this.huruf[j])) {
                    nilaiAngka = angka[i] + angka[j];
                } else if (huruf.equalsIgnoreCase("Seratus")) {
                    nilaiAngka = angka[1] + angka[0] + angka[0];
                }
            }
        }
        return nilaiAngka;
    }

    public String getHasilHuruf() {
        return nilaiHuruf;
    }

    public static void menu() {
        System.out.println("==========||||||||||==========||||||||||==========||||||||||==========||||||||||==========");
        System.out.println(" ===================------ PROGRAM KONVERSI DARI ANGKA KE HURUF ------==================== ");
        System.out.println(" ===================------ PROGRAM KONVERSI DARI HURUF KE ANGKA ------==================== ");
        
        System.out.println("1. Konversi dari bentuk angka ke bentuk huruf : ");
        System.out.println("2. Konversi dari bentuk huruf ke bentuk angka : ");
        System.out.println("3. Keluar ");
        System.out.print("Masukkan pilihan anda : ");
    }
}
