
public class Pembeli {
    public String nama;
    public String alamat;
    
    Pembeli (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    Pembeli (int pilihan, int banyak){
       switch (pilihan){
           case 1 : 
               System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%10s | \n", "1", "CALAMINT LOTION 100 ML", "Rp.  9.400");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
               break;
           case 2 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "2", "CALCIDOL SIRUP 120 ML", "Rp. 34.900");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
               break;
           case 3 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "3", "CAPTOPRIL 50 MG", "Rp. 11.900");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
               break;
           case 4 : 
                System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "4", "CHLORAMPHECORT CREAM 10 G", "Rp. 18.350");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
               break;
           case 5 : 
               System.out.printf("|%-5s |%-30s |%-10s | \n", "No", "Nama Obat", "Harga");
                System.out.printf("|%-5s |%-30s |%5s | \n", "5", "SCABICID CREAM 10 G", "Rp. 38.500");
                System.out.println("Banyaknya obat yang akan anda beli\t: " + banyak);
               break;
           default : 
               System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi");
       }
    
    }
}
