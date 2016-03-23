package tugas.bab3;

public class UserApotek {

    public String nama;
    public String alamat;

    public UserApotek() {
        nama = "";
        alamat = "";
    }

    public String namaUser(String nama) {
        this.nama = nama;
        System.out.println("Nama telah tersimpan...");
        return this.nama;
    }

    public String alamatUser(String alamat) {
        this.alamat = alamat;
        System.out.println("Alamat telah tersimpan...");
        return this.alamat;
    }

}

