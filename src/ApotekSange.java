package javaapplication10;

public class ApotekSange {

    String name;
    String address;
    int total = 0;
    String[] data = new String[7];
    final String[] medicine = {"Cotrimoxazole", "Dexamethazone", "Paracetamol", "Amoxcilin", "Promag", "Antasida Doen", "Tuzalos"};
    final int[] harga = {2500, 5000, 6000, 8000, 6000, 5500, 10000};

    public void tampilan() {
        System.out.println("");
        System.out.println("============== Daftar Nama dan Harga Obat ==============");
        System.out.println("Berikut pilihan obat yang tersedia :");
        System.out.println("");
        for (int i = 0; i < medicine.length; i++) {
            System.out.println((i + 1) + ". Nama Obat   : " + medicine[i]);
            System.out.println("   Harga       : " + harga[i] + "\n");
            for (int j = 0; j < harga.length; j++) {
            }
        }
        System.out.println("========================================================");
    }

    public ApotekSange() {
        name = "";
        address = "";
        for (int i = 0; i < data.length; i++) {
            data[i] = "";
        }
    }

    public ApotekSange(String n, String a) {
        name = n;
        address = a;
    }

    public void isi(int index, int i) {
        data[i] = (i + 1) + ". Nama obat  : " + medicine[index] + "\n   Harga      : " + harga[index];
        total += harga[index];
    }

    public void tampilkanData() {
        System.out.println("\nDaftar obat yang telah anda beli : ");
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals("")) {
                break;
            }
            System.out.println(data[i]);
        }
        System.out.println("Jumlah biaya yang harus anda bayar sebesar : " + total);
    }
}
