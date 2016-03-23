
public class Obat {
    public String obat[];
    public int harga;
    Obat() {
        this.obat = new String[2];
    }
    public String[] obat(int pilih) {
        if (pilih == 1) {
            obat[0] = "generic";
        } else if (pilih == 2) {
            obat[1] = "abal";
        }
        return obat;
    }
    public int harga(int pilihan) {
        if (pilihan == 1) {
            harga += 10000;
        } else if (pilihan == 2) {
            harga += 20000;
        }
        return harga;
    }
    public void display() {
        for (int i = 0; i < obat.length; i++) {
            System.out.println("Obat " + (i + 1) + " : " + obat[i]);
        }
        System.out.println("Harga : " + harga);
    }
    
}
