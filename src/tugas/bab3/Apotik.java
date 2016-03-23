package apotik.java;

import java.util.Scanner;

class Apotik {

    private int total;
    private String nm;
    private static int[] harga = new int[]{
        0, 5000, 5000, 6500, 7500, 8000};
    private static String[] nama = new String[]{
        "", "Obat Batuk", "Obat Maag", "Obat Pilek", "Obat Luka", "Obat Pusing"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotik i1 = new Apotik();
        String a = "y", lh = "";
        int ang, no = 0, total = 0;
        int[] hg = new int[harga.length];
        System.out.print("Masukkan Nama Anda : ");
        String nm = in.nextLine();
        i1.Data(nm);
        System.out.print("Masukkan Alamat Anda : ");
        String al = in.nextLine();
        System.out.println("Daftar Harga ");
        for (int i = 1; i < harga.length; i++) {
            System.out.println(i + ". " + nama[i] + " Dengan harga " + harga[i]);
        }
        do {
            System.out.print("Masukkan kode Obat : ");
            ang = in.nextInt();
            i1.Data(ang);
            System.out.print("Mau beli lagi? y/t ");
            lh = in.next();
        } while (a.equalsIgnoreCase(lh));
        i1.display();
    }

    public void Data(int a) {
        int no = 0;
        int[] array = new int[10];
        do {
            array[no] = harga[a];
        } while (no != 0);
        for (int i = 0; i <= no; i++) {
            total += array[i];
        }
    }

    public void Data(String a) {
        nm = a;
    }

    public void display() {
        System.out.println("Pelanggan " + nm);
        System.out.println("Total harga adalah " + total);
    }
}
