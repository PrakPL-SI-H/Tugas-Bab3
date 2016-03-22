
public class Pembeli {
    public String nama;
    public String alamat;
    public static double banyakConvert;
    public static int jumlahConvert;
    
    Pembeli (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    Pembeli (int pilihan, int banyak){
        Obat a = new Obat ();
        
       switch (pilihan){
           case 1 : 
               System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%10s | \n", "1", "CALAMINT LOTION 100 ML", "Rp.  9.400");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
                    banyakConvert = (double) banyak;
                a.operasiHitung(banyakConvert);
                System.out.printf("%s %.0f \n", "Harga yang harus anda bayar\t\t: Rp. ", Obat.jumlah);
                jumlahConvert = (int) Obat.jumlah;
                Obat.operasiHitung(jumlahConvert);
                System.out.println("Total jumlah belanja anda\t\t: Rp. " + Obat.total);
               break;
           case 2 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "2", "CALCIDOL SIRUP 120 ML", "Rp. 34.900");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
                banyakConvert = (double) banyak;
                a.operasiHitung(banyakConvert);
                System.out.printf("%s %.0f \n", "Harga yang harus anda bayar\t\t: Rp. ", Obat.jumlah);
                jumlahConvert = (int) Obat.jumlah;
                Obat.operasiHitung(jumlahConvert);
                System.out.println("Total jumlah belanja anda\t\t: Rp. " + Obat.total);
               break;
           case 3 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "3", "CAPTOPRIL 50 MG", "Rp. 11.900");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
                    banyakConvert = (double) banyak;
                a.operasiHitung(banyakConvert);
                System.out.printf("%s %.0f \n", "Harga yang harus anda bayar\t\t: Rp. ", Obat.jumlah);
                jumlahConvert = (int) Obat.jumlah;
                Obat.operasiHitung(jumlahConvert);
                System.out.println("Total jumlah belanja anda\t\t: Rp. " + Obat.total);
               break;
           case 4 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "4", "CHLORAMPHECORT CREAM 10 G", "Rp. 18.350");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
                    banyakConvert = (double) banyak;
                a.operasiHitung(banyakConvert);
                System.out.printf("%s %.0f \n", "Harga yang harus anda bayar\t\t: Rp. ", Obat.jumlah);
                jumlahConvert = (int) Obat.jumlah;
                Obat.operasiHitung(jumlahConvert);
                System.out.println("Total jumlah belanja anda\t\t: Rp. " + Obat.total);
               break;
           case 5 : 
               System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "5", "SCABICID CREAM 10 G", "Rp. 38.500");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
                    banyakConvert = (double) banyak;
                a.operasiHitung(banyakConvert);
                System.out.printf("%s %.0f \n", "Harga yang harus anda bayar\t\t: Rp. ", Obat.jumlah);
                jumlahConvert = (int) Obat.jumlah;
                Obat.operasiHitung(jumlahConvert);
                System.out.println("Total jumlah belanja anda\t\t: Rp. " + Obat.total);
               break;
           default : 
               System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi");
       }
    
    }
}
