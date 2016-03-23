package prakproglan;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        int beli1,beli2,beli3,beli4,beli5,total=0;
        Scanner in = new Scanner(System.in);
        Apotek obat = new Apotek();
        System.out.println("===========APOTEK WARASHO==========");
        System.out.println("===================================");
        System.out.print("Nama\t: ");
        obat.setNama(in.nextLine());
        System.out.print("Alamat\t: ");
        obat.setAlamat(in.nextLine());
        System.out.println("===================================");
        System.out.println("          MENU DAFTAR OBAT         ");
        System.out.println("===================================");
        System.out.println("1. PANADOL");
        System.out.println("2. OBH");
        System.out.println("3. BISOLFON");
        System.out.println("4. PARACETAMOL");
        System.out.println("5. SUPLEMEN VIT. C");
        System.out.println("6. Keluar");
        System.out.print("Obat Yang Akan Anda Beli : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1 :
                System.out.println("PANADOL");
                System.out.println("Harga Obat per Set : Rp 3000");
                System.out.print("Berapa Banyak yang Akan Anda Beli : ");
                beli1 = in.nextInt();
                obat.obat1(beli1);
                break;
            case 2 :
                System.out.println("OBH");
                System.out.println("Harga Obat per Botol : Rp 35000");
                System.out.print("Berapa Banyak yang Akan Anda Beli : ");
                beli2 = in.nextInt();
                obat.obat2(beli2);
                break;
            case 3 :
                System.out.println("BISOLFON");
                System.out.println("Harga Obat per Botol : Rp 25000");
                System.out.print("Berapa Banyak yang Akan Anda Beli : ");
                beli3 = in.nextInt();
                obat.obat3(beli3);
                break;
            case 4 :
                System.out.println("PARACETAMOL");                
                System.out.println("Harga Obat per Set : Rp 5000");
                System.out.print("Berapa Banyak yang Akan Anda Beli : ");
                beli4 = in.nextInt();
                obat.obat4(beli4);
                break;
            case 5 : 
                System.out.println("SUPLEMEN VIT. C");                
                System.out.println("Harga Obat per Set : Rp 10000");
                System.out.print("Berapa Banyak yang Akan Anda Beli : ");
                beli5 = in.nextInt();
                obat.obat5(beli5);
                break;
            case 6 :
                System.out.println("Terima Kasih Telah Mengunjungi Kami");
                System.out.println("==============WARASHO==============");
                break;
            default :
                System.out.println("Pilihan Tidak Tersedia");
                break;           
        }
    }
}
