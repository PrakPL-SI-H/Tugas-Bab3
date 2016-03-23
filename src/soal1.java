package Bab3;
import java.util.Scanner;
public class soal1 {
    static String[] huruf = {"","Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    public static void overloadingMeth(int a) {
        if (a == 0) {
            System.out.println("Nol");
        } else if (a < 12) {
            System.out.println(huruf[a]);
        } else if (a >= 12 && a <= 19) {
            int belas = a % 10;
            System.out.println(huruf[belas] + " Belas");
        } else if (a >= 20 && a <= 99) {
            int x = a / 10;
            int y = a % 10;
            System.out.println(huruf[x] + " Puluh " + huruf[y]);
        } else if (a == 100) {
            System.out.println("Seratus");
        } else {
            System.out.println("Angka yang Anda masukkan melebihi range");
        }
    }
    public static String overloadingMeth(String a) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String angka[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] no = a.split(" ");
        String hasil = "";
        for (int b = 0; b < no.length; b++) {
            for (int c = 0; c < huruf.length; c++) {
                if (no.length == 3) {
                    if (no[b].indexOf(huruf[c]) >= 0) {
                        hasil = hasil + angka[c];
                    }
                } else if (no.length == 2) {
                    if (no.length == 2 && no[1].equalsIgnoreCase("puluh") && no[b].equalsIgnoreCase(huruf[c])) {
                        hasil = angka[c] + "0";
                    } else if (no.length == 2 && no[1].equalsIgnoreCase("belas") && no[0].equalsIgnoreCase(huruf[c])) {
                        hasil = "1" + angka[c];
                    }
                } else {
                    if (no[0].equalsIgnoreCase("sebelas")) {
                        hasil = "11";
                    } else if (no[0].equalsIgnoreCase(huruf[c])) {
                        hasil = angka[c];
                    } else if (no[0].equalsIgnoreCase("seratus")) {
                        hasil = "100";
                    }
                }
            }
        }
        return hasil;
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mengubah angka menjadi huruf");
        System.out.println("----------------------------");
        System.out.print("Input angka (1-100) : ");
        int angka = in.nextInt();
        System.out.print("Huruf : ");
        overloadingMeth(angka);
        System.out.println(" ");
        System.out.println("Mengubah huruf menjadi angka");
        System.out.println("----------------------------");
        in.nextLine();
        System.out.print("Input angka dalam huruf (Satu-Seratus) : ");
        String huruf = in.nextLine();
        String hasil = overloadingMeth(huruf);
        System.out.println("Angka : " + hasil);
        
    }
}

