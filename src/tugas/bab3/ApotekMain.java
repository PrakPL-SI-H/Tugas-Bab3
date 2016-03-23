package program_Laporan;

import java.util.Scanner;


public class ApotekMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ClassObat drug=new ClassObat();
       
        int jumlah,jumlah2,jumlah3,jumlah4,jumlahsemua = 0;
        int harga ;
        int total;
        int TotalSemua = 0;
        String answer;
        System.out.println("===|||SELAMAT DATANG DI APOTEK SIANIDAFARMA|||===");
        System.out.println();
        System.out.println("gudangnya obat masalah duniawi");
        
        System.out.println("silahkan menginputkan nama anda:" );
        String nama=in.next();
        in.next();
        System.out.println("Silahkan menginputkan alamat anda: ") ;
        String alamat=in.next();
        in.next();
        do{
        System.out.println("=============DAFTAR OBAT DI APOTEK SIANIDAFARMA================");
        System.out.println("1. Chefalogrin(Obat pusing tugas) ");
        System.out.println("2. Hypertaskosin(Obat darah tinggi kebanyakan tugas) ");
        System.out.println("3. Ampegrin(Obat sesak kena revisi)");
        System.out.println("4. Eynofarmin(obat mata pedas kebanyakan ngoding)");
        System.out.println("5.Saya ingin melihat harga total pembelian saya");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        int pilih = in.nextInt();
       switch (pilih){
            case 1:
          System.out.println("====Chefalogrin(Obat pusing tugas)====");
        System.out.println("Harga per botol adalah 10000 rupiah");
         System.out.println("Masukkan berapa botol yang akan anda beli");   
         
         
         System.out.println("Banyak obat(botol)   = ");
          
         jumlah = in.nextInt();
          drug.Obat1(jumlah);
               break;
                
            case 2:
                System.out.println("====Hypertaskosin(Obat darah tinggi kebanyakan tugas)====");
        System.out.println("Harga per botol adalah 20000 rupiah");
         System.out.println("Masukkan berapa botol yang akan anda beli");
                
                System.out.println("Banyak obat(botol)   = ");
               
         jumlah2 = in.nextInt();
         drug.Obat2(jumlah2);
                break;
            case 3:
                 System.out.println("====Ampegrin(Obat sesak kena revisi)====");
        System.out.println("Harga per botol adalah 25000 rupiah");
         System.out.println("Masukkan berapa botol yang akan anda beli");
         
    
               
                System.out.println("Banyak obat(botol)   = ");
                
         jumlah3 = in.nextInt();
           drug.Obat3(jumlah3);
                break;
           
            default:
                System.out.println("Mohon Maaf, Pilihan anda Tidak Ditemukan");      
        }
        
        System.out.print("Melanjutkan Pembelian obat? (Y/N) ");
        answer = in.next();
    }while(answer.equalsIgnoreCase("Y"));
        
}
}

