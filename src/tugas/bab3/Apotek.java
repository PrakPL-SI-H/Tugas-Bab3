package prakproglan;
public class Apotek {
    
        String nama;
        String alamat;
        String obat;
        int harga;
        int total;
        int jumlahObat1, jumlahObat2, jumlahObat3, jumlahObat4, jumlahObat5;
        
        public void setNama(String n){
            nama=n;
        }
        public void setAlamat(String a){
            alamat=a;
        }
        
        public void obat1(int jumlah){
            System.out.println("Jumlah Obat : "+jumlah);
            jumlahObat1 = jumlah*3000;
            System.out.println("Harganya : "+jumlahObat1);
        }
        public void obat2(int jumlah){
            System.out.println("Jumlah Obat : "+jumlah);
            jumlahObat2 = jumlah*35000;
            System.out.println("Harganya : "+jumlahObat2);
        }
        public void obat3(int jumlah){
            System.out.println("Jumlah Obat : "+jumlah);
            jumlahObat2 = jumlah*25000;
            System.out.println("Harganya : "+jumlahObat2);
        }
        public void obat4(int jumlah){
            System.out.println("Jumlah Obat : "+jumlah);
            jumlahObat2 = jumlah*5000;
            System.out.println("Harganya : "+jumlahObat2);
        }
        public void obat5(int jumlah){
            System.out.println("Jumlah Obat : "+jumlah);
            jumlahObat2 = jumlah*10000;
            System.out.println("Harganya : "+jumlahObat2);
        }
}