package tugas;
import java.util.Scanner;
public class MainApotik {
    public static void menu() {
        System.out.println("=============APOTEK SETIA=============");
        System.out.println("1.Daftar Obat");
        System.out.println("2.Beli Obat");
        System.out.println("3.Cetak Struk");
        System.out.println("4.Lihat Data Penjualan");
        System.out.println("5.Keluar");
        System.out.print("Masukkan nomor : ");
    }
    public static void main(String[] args) {
        String jual[][] = new String[10][3];
        String obat[][] = {{"Diapet", "2000"},
        {"Promag", "2500"},
        {"komix jahe", "2500"},
        {"Panadol", "3000"},
        {"Paracetamol", "3500"},
        {"Paramex", "3000"},
        {"Tolak Angin", "10000"},
        {"Antimo", "5000"},
        {"Bye Bye Fever", "12000"},
        {"Salonpas", "7500"}};//baru

        Scanner in = new Scanner(System.in);
        Apotik a = new Apotik();
        for (int i = 0; i < jual.length; i++) {
            jual[i][0] = "Kosong";
            jual[i][1] = "Kosong";
            jual[i][2] = "0";
        }
        a.baru(jual, obat);
        boolean ulang = true;
        while (ulang) {
            menu();
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    a.displayObat();
                    break;

                case 2:
                    System.out.print("Masukkan nama pembeli : ");
                    jual[a.terjual][0] = in.nextLine();
                    jual[a.terjual][0] = in.nextLine();
                    System.out.print("Masukkan alamat pembeli : ");
                    jual[a.terjual][1] = in.nextLine();

                    while (ulang) {
                        a.displayObat();
                        System.out.print("Masukkan nomor obat yang akan dibeli : ");
                        int pilih = in.nextInt();
                        System.out.print("Masukkan jumlah yang akan dibeli : ");
                        int jum = in.nextInt();
                        a.Obat(pilih, jum);
                        System.out.print("Anda akan menambah obat(Y/N)? ");
                        String x = in.next();
                        if (x.equalsIgnoreCase("Y")) {
                            ulang = true;
                        } else if (x.equalsIgnoreCase("N")) {
                            jual[a.terjual][2] = String.valueOf(a.total);
                            a.total = 0;
                            ulang = false;
                        } else {
                            ulang = true;
                        }
                    }
                    ulang = true;
                    a.terjual = a.terjual + 1;
                    break;

                case 3:
                    for (int i = 0; i < jual.length; i++) {
                        int nomor = i + 1;
                        System.out.println(nomor + "." + jual[i][0]);
                    }
                    System.out.print("Pilih nomor penjualan : ");
                    int nom = in.nextInt();
                    a.Obat(nom);
                    ulang = true;
                    break;

                case 4:
                    a.displayPenjualan();
                    ulang = true;
                    break;

                case 5:
                    ulang = false;
                    System.exit(0);
                    break;
                default:
                    ulang = true;
                    break;
            }
        }
    }
}
