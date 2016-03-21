public class ConvertHurufAngka {
       public int angka;
       public int huruf;
       public String[] arrayHuruf;
       
        public void OverloadingMeth(int angka) {
        String angkahuruf[] = new String[]{"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        if (angka <= 11 && angka >= 0) {
            System.out.println(angkahuruf[angka]);
        }
        if (angka >= 12 && angka <= 19) {
            System.out.println(angkahuruf[angka - 10] + " Belas");
        }
        if (angka > 0 && angka <= 99 && angka % 10 == 0) {
            System.out.println(angkahuruf[angka / 10] + " Puluh");
        }
        if (angka >= 21 && angka <= 99 && angka % 10 != 0) {
            System.out.println(angkahuruf[angka / 10] + " Puluh " + angkahuruf[angka % 10]);
        }
        if (angka == 100) {
            System.out.println("Seratus");
        }
        if (angka > 100) {
            System.out.println("Maaf, nilai yang anda masukkan melebihi range yang diberikan.");
        }
    }
}
