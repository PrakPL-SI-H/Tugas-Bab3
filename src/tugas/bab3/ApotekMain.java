package BAB3;

import java.util.Scanner;

public class ApotekMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, alamat, pilihan;
        Apotek data = new Apotek();
        System.out.println("========================================================");
        System.out.println("                      SELAMAT DATANG");
        System.out.println("                    APOTEK KIMIA FARMA     ");
        System.out.println("========================================================");
        System.out.print("NAMA   : ");
        nama = in.next();
        System.out.print("ALAMAT : ");
        alamat = in.next();
        data.listObat();
