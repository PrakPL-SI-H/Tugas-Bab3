import java.util.Scanner;
    public class apotek {
        Scanner in = new Scanner(System.in);
      Scanner in2 = new Scanner(System.in);
        String nama, alamat;
        String namaObat[] = { "Amoxylin", "Analgesik","Antialergi", "Antidot", "Antiinfeksi", "Antiseptik", "Parasetamol", "Vitamin"};
        int hargaObat[] = {5000, 3500, 2500, 4000, 3000, 2500,1500, 1000};
        int pesanan[] = new int[8], jumlah[] = new int[8];
        int total=0;
        public apotek(String nama, String alamat){
           this.nama = nama;
           this.alamat = alamat;
       }
       public void lihatDaftar(){
           System.out.println("============DAFTAROBAT=============");
           System.out.println("NAMA OBAT\tHARGA OBAT");
           for (int i=0; i<=7; i++){
               System.out.println((i+1)+". "+namaObat[i]+"\tRp."+hargaObat[i]);
           }
       System.out.println("====================================");
       }
       public void beliObat(){
           char opsi;
           int i=0;
           do{
               System.out.print("Obat yang ingin anda beli(Nomor): ");
               int pilih = in.nextInt();
               pesanan[i] = pilih;
               System.out.print("Sebanyak: ");
               jumlah[i] = in.nextInt();
               beliObat(hargaObat[pilih-1], jumlah[i]);
               System.out.print("Apa Anda butuh obat lain <Y/T>?");
               opsi = in.next().charAt(0);
               i++;
           }while (opsi =='Y');
       }
       public void beliObat(int harga, int jumlah){
           total = total + harga*jumlah;
       }
       public void tampilPesanan(){
      System.out.println("=============TERIMAKASIH=============");
           System.out.println("Nama: "+nama);
           System.out.println("Alamat: "+alamat);
 

		System.out.println("=============PESANAN ANDA============");
           for (int i=0; i<=8; i++){
               if (pesanan[i] == 0) break;
		System.out.printf("%d. %s \tRp.%d Sebanyak %d buah seharga Rp.%d\n",(i+1),namaObat[pesanan[i]-1],hargaObat[pesanan[i]-1],jumlah[i],hargaObat[pesanan[i]-1]*jumlah[i]);
           }
      System.out.println("=====================================");
           System.out.println("Total tagihan: Rp."+total+",-\n");
       }
   }

