package mainapotek;

public class Apotek {

    public String alamat, nama;
    private int harga = 0;
    public int jumlah[];

    Obat list = new Obat();

    public void setData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setData(int a, int b) {
        for (int i = 0; i < 5; i++) {
            if (a == list.kode[i]) {
                jumlah[i] = list.uang[i] * b;
                harga = harga + jumlah[i];
            }
        }
    }

    public void beli() {
        for (int i = 0; i < 5; i++) {
            if (jumlah[i] != 0) {
                System.out.println(list.kode[i] + "     |  " + list.obat[i]
                        + "       |  " + jumlah[i]);
            }
        }
    }

    public int getHarga() {
        return harga;
    }
}
