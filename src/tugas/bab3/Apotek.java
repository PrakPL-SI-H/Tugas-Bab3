package Praktikum;
import java.util.Scanner;
public class Apotek {
    
    private String nama, alamat;
    private String []namaobat = new String [20];
    private int [] jumlahbarang = new int[20];
    private int []hargaobat = new int [20];
    private int[]hrgtotal = new int [20];
    private int jumbel,total;
    
    public Apotek ()
    {
        nama="Pembeli";
        alamat="Tidak diketahui";
    }
    
    public Apotek (String n, String a)
    {
        nama = n;
        alamat = a;
    }
    
    public void daftar ()
    {
        System.out.println("Daftar Obat\n--------------------------------------------");
        System.out.println("No.     Nama Barang         Harga\n"
                + "1.       Panadol             Rp. 9000\n"
                + "2.       Mylanta             Rp. 12000\n"
                + "3.       Ultraflu            Rp. 7800\n"
                + "4.       Neo Reumacyl        Rp. 9500\n"
                + "5.       Cetrazadine         Rp. 4500\n"
                + "6.       Feminax             Rp. 5600\n"
                + "7        Komix               Rp. 6300\n"
                + "8.       Tolak Angin         Rp. 3200\n"
                + "9.       Enervonc            Rp. 5000\n"
                + "10.      Polisylane          Rp. 16500\n");
    }
    
    public void daftar (int n)
    {
        Scanner put = new Scanner(System.in);
        jumbel = n;
        System.out.println("\n ===================================");
        for (int i = 1; i <= jumbel; i++) {
            System.out.print("\n Nama Obat ke-" + i + " : ");
            namaobat[i] = put.next();
            System.out.print(" Jumlah Barang   : ");
            jumlahbarang[i] = put.nextInt();
            System.out.print(" Harga Barang    :Rp ");
            hargaobat[i] = put.nextInt();
            hrgtotal[i] = jumlahbarang[i] * hargaobat[i];
            total = hrgtotal[i] + total;
        }
    }
    
    public void tampil ()
    {   System.out.println("Nama    = "+nama+"\nAlamat  = "+alamat +"\n");
        System.out.println("\n\n                Daftar Barang Pembelian");
        System.out.println(" ==========================================================");
        System.out.println(" ||   Nama Barang    || Jumlah ||   Harga   ||   Total    ||");
        System.out.println(" ==========================================================");
        for (int i = 1; i <= jumbel; i++) {
            System.out.printf(" || %-16s ||  %3d   || Rp %6d || Rp %7d ||\n", namaobat[i], jumlahbarang[i], hargaobat[i], hrgtotal[i]);
        }
        System.out.println(" ==========================================================");


        System.out.println("Total yang harus anda bayar = Rp. "+total);
    }

}