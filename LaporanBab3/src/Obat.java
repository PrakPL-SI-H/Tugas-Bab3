
public class Obat {
    public static double jumlah;
    public static int total;
    
     public void displayMessage() {
        System.out.println("=====================================================");
        System.out.println("\t DAFTAR OBAT DAN HARGA APOTIK FORZA");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
        System.out.println("=====================================================");
        System.out.printf("|%-5s |%-30s |%10s | \n", "1", "CALATIRE 100 ML", "Rp.  9.400");
        System.out.printf("|%-5s |%-30s |%5s | \n", "2", "CALAIS SIRUP 120 ML", "Rp. 34.900");
        System.out.printf("|%-5s |%-30s |%5s | \n", "3", "CAPTOPRIL 50 MG", "Rp. 11.900");
        System.out.printf("|%-5s |%-30s |%5s | \n", "4", "CHLORAMPHECORT CREAM 10 G", "Rp. 18.350");
        System.out.printf("|%-5s |%-30s |%5s | \n", "5", "SCABID CREAM 10 G", "Rp. 38.500");
        System.out.println("=====================================================");
    }
     public void operasiHitung (double banyakConvert){
         if (ApotekDemo.pilihan == 1) {
            jumlah = banyakConvert* 9400;
        } else if (ApotekDemo.pilihan == 2) {
            jumlah = banyakConvert * 34900;
        } else if (ApotekDemo.pilihan == 3) {
            jumlah = banyakConvert * 11900;
        } else if (ApotekDemo.pilihan == 4) {
            jumlah = banyakConvert * 18350;
        } else if (ApotekDemo.pilihan == 5) {
            jumlah = banyakConvert * 38500;
        }
     }
     public static void operasiHitung (int jumlahConvert){
         total = total + jumlahConvert;
     }

}
