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