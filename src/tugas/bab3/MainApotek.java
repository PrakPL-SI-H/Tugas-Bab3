package tugas.bab3;

import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UserApotek user = new UserApotek();
        Apotek apotek = new Apotek();

        do {
            System.out.println("\n==========SELAMAT DATANG DI APOTEK ATIKAHFN==========\n");
            System.out.println("1. Masukkan nama");
            System.out.println("2. Masukkan alamat");
            System.out.println("3. Daftar Obat dan Harga");
            System.out.println("4. Cetak Strip");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan: ");
            int pil = in.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan nama anda: ");
                    in.nextLine();
                    user.namaUser(in.nextLine());
                    break;
                case 2:
                    System.out.print("Masukkan alamat anda: ");
                    in.nextLine();
                    user.alamatUser(in.nextLine());
                    break;
                case 3:
                    apotek.tampilObat();
                    System.out.print("Masukkan jumlah obat yang ingin dibeli: ");
                    apotek.jumlahobat = in.nextInt();
                    apotek.setJumlahObat();
                    for (int i = 0; i < apotek.jumlahobat; i++) {
                        System.out.print("Masukkan no obat ke " + (i + 1) + " : ");
                        apotek.masuk(i, in.nextInt());
                    }
                    System.out.println("Data telah tersimpan..");
                    break;
                case 4:
                    
                    System.out.println("\n===APOTEK ATIKAHFN===\n");
                    System.out.println("Nama        : " + user.nama);
                    System.out.println("Alamat      : " + user.alamat);
                    System.out.println("Data Obat   : ");
                    for (int i = 0; i < apotek.jumlahobat; i++) {
                        System.out.println(apotek.namaobat[apotek.pilihanobat[i]] + "\tRp. " + apotek.harga[apotek.pilihanobat[i]]);
                        apotek.getTotal(i);
                    }
                    System.out.println("Total Pembelian: Rp." + apotek.total);
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    System.exit(0);
            }

        } while (true);
    }
}
