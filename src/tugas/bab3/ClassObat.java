package pl_praktikum_lap3;

public class ClassObat {

    String name, address, obat;

    int harga, jum;

    public ClassObat() {
    }

    public ClassObat(String x, String y) {
        name = x;
        address = y;
    }

    public void setName(String x) {
        name = x;
        name = x;
    }

    public void Data(int x) {
        jum = x;
    }

    public void setaddress(String x) {
        address = x;
    }

    public int pilihObat(String a) {
        obat = a;
        if (obat.equals("BODREX")) {
            harga += 10000;
        } else if (obat.equals("PARACETAMOL")) {
            harga += 20000;
        } else if (obat.equals("INSAGRIN")) {
            harga += 30000;
        } else if (obat.equals("CALADINE")) {
            harga += 40000;
        } else if (obat.equals("OBH")) {
            harga += 50000;
        } else if (obat.equals("PANADOL")) {
            harga += 70000;
        } else {
            System.out.println("Obat tidak tersedia");
        }
        return harga;
    }

    public void Data() {
        System.out.println("==========DATA PEMBELIAN==========");
        System.out.println("Penerima                        : " + name);
        System.out.println("Alamat Anda                     : " + address);
        System.out.println("Harga Yang Harus Dibayar        : " + harga);
    }

}
