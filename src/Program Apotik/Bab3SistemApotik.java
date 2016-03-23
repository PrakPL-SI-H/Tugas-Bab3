package bab3sistemapotik;

import java.util.Scanner;

/**
 *
 * @author Istighfarin Bahtiar AMry
 * @NIM 155150401111129
 * @Kelas SI-H
 */
public class Bab3SistemApotik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String lagi;
        String loop;
        int beliObat[];
        int jumObat[];
        String daftar[] = {"ObatH5N1", "ObatH222", "Obat5W1H", "ObatK2K3", "ObatXXXX"};
        int price[] = {10000, 20000, 30000, 40000, 50000};

        System.out.println("    Masukkan Identitas Diri");
        System.out.print("Nama Anda   : ");
        String nama = in.nextLine();
        System.out.print("Alamat Anda : ");
        String alamat = in.nextLine();
        System.out.println();

        DataApotik user = new DataApotik(nama, alamat); //overloading construktor
        DataApotik list = new DataApotik(daftar, price);
        

}
}