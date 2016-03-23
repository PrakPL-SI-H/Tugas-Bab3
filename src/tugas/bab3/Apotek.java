//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package mainapotek;

public class Apotek {

    public String alamat, nama;
    private int harga = 0;
    public int jumlah;
    
    Obat list = new Obat();

    public void setData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setData(int a, int b) {
        for (int i = 0; i < 5; i++) {
            if (a == list.kode[i]) {
                jumlah = list.uang[i] * b;
                list.total[i] = jumlah;
                harga = harga + jumlah;
            }
        }
    }

    public void beli() {
        for (int i = 0; i < 5; i++) {
            if (list.total[i] != 0) {
                System.out.println(list.kode[i] + "     |  " + list.obat[i]
                        + "     |  " + list.total[i]);
            }
        }
    }

    public int getHarga() {
        return harga;
    }
}
