package bab3;

public class Apotek {
    String nama; 
    String alamat;
    int total = 0;
    String[] data = new String[6];
    final String[] obat = {"Paracetamol", "Enteng Jodoh", "Pegel Miskin", "Lancar Skripsi", "Bintang Kejora", "Tolak Jomblo"};
    final int[] harga = {5000, 3500, 3000, 9000, 2500, 7500};
    public void tampilan() {
        System.out.println("");
        
        for (int i = 0; i < obat.length; i++) {
            System.out.println((i + 1) + ". Nama Obat   : " + obat[i]);
            System.out.println("\tHarga       : " + harga[i] + "\n");
            for (int j = 0; j < harga.length; j++) {
            }
        }
       
    }
    public Apotek() {
        nama = "";
        alamat = "";
        for (int i = 0; i < data.length; i++) {
            data[i] = "";
        }
    }
    public Apotek(String n, String a) {
        nama = n;
        alamat = a;
    }
    public void isi(int index, int i) {
        data[i] = (i + 1) + ". Nama obat  : " + obat[index] + "\n   Harga      : " + harga[index];
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