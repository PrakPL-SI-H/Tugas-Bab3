package mainapotek;

public class Apotek {

    public String alamat, nama;
    public String kode;
    private int harga = 0;
    public int jumlah;

    Obat list = new Obat();
    
    public void setData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setData(String kode, int j) {
        this.kode = kode;
        for(int i=0;i<5;i++){
            
        }
        
    }

    public int getHarga() {
        return harga;
    }
}
