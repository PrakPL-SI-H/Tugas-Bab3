
import java.util.Scanner;

public class ApotekDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat = in.nextLine();
        Pembeli pasien = new Pembeli (nama,alamat);
        Obat pasien1 = new Obat();
        pasien1.displayMessage();
}
}
