package PrakPemLan;

public class SistemApotek {

    int obat[];
    int jlh;
    int total = 0;
    int ttlobat;
    String nama, alamat;

    public void Nama(String nama) {
        this.nama = nama;
    }

    public void Alamat(String alamat) {
        this.alamat = alamat;
    }

    public void JlhObat(int totalObat) {
        this.ttlobat = totalObat;
        obat = new int[totalObat];
    }

    public void NoObat(int nomorobat) {
        int index = 0;
        for (int i = 0; i < ttlobat; i++) {
            if (obat[i] == 0) {
                break;
            }
            index++;
        }
        obat[index] = nomorobat;
    }

    public void total() {
        for (int i = 0; i < ttlobat; i++) {
            if (obat[i] == 1) {
                jlh = 2500;
            } else if (obat[i] == 2) {
                jlh = 8500;
            } else if (obat[i] == 3) {
                jlh = 3000;
            } else if (obat[i] == 4) {
                jlh = 7000;
            } else if (obat[i] == 5) {
                jlh = 10000;
            }
        }
        total += jlh;
        System.out.println("Harga sementara : " + this.total);
    }

    public void PrintInfo() {
        System.out.println("Nama pembeli\t\t: " + nama);
        System.out.println("Alamat pembeli\t\t: " + alamat);
        System.out.println("Total pembayaran\t: " + "Rp. "+ total);
    }
}