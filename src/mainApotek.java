import java.util.Scanner;
    public class mainApotek {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Scanner in2 = new Scanner(System.in);
            char opsi;
            do{
                System.out.print("Apakah anda ingin membeli obat<Y/T>? ");
                opsi = in.next().charAt(0);
               if (opsi == 'T') break;
               else{
                   System.out.print("Nama : ");
                   String nama = in2.nextLine();
                   System.out.print("Alamat : ");
                   String alamat = in2.nextLine();
                   apotek user = new apotek(nama, alamat);
                   user.lihatDaftar();
                   user.beliObat();
                   user.tampilPesanan();
               }
           }while(opsi == 'Y');
       }
   }


