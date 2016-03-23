package apotek;
import java.util.Scanner;
public class Obat {
    public String obat[];
    public int harga;
    Obat() {
        this.obat = new String[9];
    }
    public String[] obat(int pilih) {
        if (pilih == 1) {
            obat[0] = "Antangin";
        } else if (pilih == 2) {
            obat[1] = "VitalongC";
        } else if (pilih == 3) {
            obat[2] = "EsterC";
        } else if (pilih == 4) {
            obat[3] = "TolakAngin";
        } else if (pilih == 5) {
            obat[4] = "Bodrek";
        } else if (pilih == 6) {
            obat[5] = "Inzana";
        } else if (pilih == 7) {
            obat[6] = "Termorex";
        } else if (pilih == 8) {
            obat[7] = "Paracetamol";
        } else if (pilih == 9) {
            obat[8] = "Mixagrip";
        }
        return obat;
    }
    public int harga(int pilihan) {
        if (pilihan == 1) {
            harga += 5000;
        } else if (pilihan == 2) {
            harga += 20000;
        } else if (pilihan == 3) {
            harga += 30000;
        } else if (pilihan == 4) {
            harga += 5000;
        } else if (pilihan == 5) {
            harga += 3000;
        } else if (pilihan == 6) {
            harga += 2000;
        } else if (pilihan == 7) {
            harga += 10000;
        } else if (pilihan == 8) {
            harga += 15000;
        } else if (pilihan == 9) {
            harga += 3000;
        }
        return harga;
    }
    public void display() {
        System.out.println("Jumlah harga yang harus dibayar : " + harga);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Identitas a = new Identitas();
        System.out.print("Nama              : ");
        a.nama = in.nextLine();
        System.out.print("Alamat            : ");
        a.alamat = in.nextLine();
        System.out.println("");
        System.out.println("==========APOTIK SEHAT SEGAR==========");
        System.out.println("Daftar Menu dan Obat : ");
        System.out.println("1. Antangin         harga   : 5000");
        System.out.println("2. Vitalong C       harga   : 20000");
        System.out.println("3. Ester C          harga   : 30000");
        System.out.println("4. Tolak Angin      harga   : 5000");
        System.out.println("5. Bodrek           harga   : 3000");
        System.out.println("6. Inzana           harga   : 2000");
        System.out.println("7. Termorex         harga   : 10000");
        System.out.println("8. Paracetamol      harga   : 15000");
        System.out.println("9. Mixagrip         harga   : 3000");
        System.out.println("10.Selesai ");
        System.out.println("11. keluar");
        System.out.println("=======================================");
        System.out.println("");
        System.out.println("Masukan daftar obat yang akan Anda beli : ");
        int pilihan = 0;
        while (pilihan != 11) {
            pilihan = in2.nextInt();
            if (pilihan == 11) {
                System.out.println("===============================================================");
                System.out.println("Terima Kasih telah memilih layanan kami. Semoga Lekas Sembuh");
                System.exit(0);
            }
            if (pilihan == 10) {
                System.out.println("===============================================================");
                a.display();
                a.obat.display();
                System.out.println("===============================================================");
                System.out.println("Anda telah selesai memilih obat. Silahkan tekan 11 untuk keluar");
            }
            a.obat.obat(pilihan);
            a.obat.harga(pilihan);
        }
    }
}
