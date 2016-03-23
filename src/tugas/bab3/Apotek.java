package tugas.bab3;

public class Apotek {

    public String namaobat[];
    public double harga[];
    public int jumlahobat;
    public int pilihanobat[];
    public double total;

    public Apotek(int z) {
        namaobat = null;
        harga = null;
    }

    public Apotek() {
        String a[] = {null, "1. Dexanta", "2. Ibuprofen", "3. Vicks Herbal",
            "4. Vitamin C", "5. Albothyl"};
        namaobat = a;
        double b[] = {0, 2500, 5000, 8900, 4800, 36000};
        harga = b;

    }

    public void masuk(int a, int pil) {
        pilihanobat[a] = pil;
    }

    public void setJumlahObat() {
        pilihanobat = new int[jumlahobat];
        
    }

    public double getTotal(int a) {
            total = total + harga[pilihanobat[a]];
        return total;
    }

    public void tampilObat() {
        for (int i = 1; i < namaobat.length; i++) {
            System.out.println(namaobat[i] + "\t" + harga[i]);
        }
    }
}
