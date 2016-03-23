package apotek;

public class Identitas {

    public String nama;
    public String alamat;
    Obat obat = new Obat();

    Identitas() {
    }

    Identitas(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void display() {
        System.out.println("Nama                            : " + nama);
        System.out.println("Alamat                          : " + alamat);
    }
}

