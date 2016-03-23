import java.util.Scanner;
public class MainApotik {
public static void main(String[] args) {
    Daftar obat = new Daftar();
    int i;
    Scanner ini = new Scanner(System.in);
    System.out.println("======= Biodata pasien ========");
    System.out.print("Nama   = ");
    obat.Nama = ini.nextLine();
    System.out.print("Alamat = ");
    obat.Alamat = ini.nextLine();
    System.out.println("===============================");
    do{
    System.out.println("=======-- Apotik Java --=======");
    System.out.println("1. Pilih Obat");
    System.out.println("2. Total Harga");
    System.out.println("9. keluar");
    System.out.println("===============================");
    System.out.print("Masukkan Urutan = ");
    i = ini.nextInt();
    switch (i){
        case 1 : obat.pilih();break;
        case 2 : obat.totalHarga();break;
    }
}while(i    !=9);
    System.out.println("==================================");
    System.out.println("Terima kasih , Semoga lekas sembuh");
    System.out.println("==================================");
}
}