package tugas;
public class Apotik {
 int total,terjual=0;
    String [][]daftarobat;
    String [][]penjualan;
    public void baru(String jual[][],String obat[][]){
    this.penjualan = new String[jual.length][jual.length];
    this.penjualan = jual;
    this.daftarobat = new String[obat.length][obat.length];
    this.daftarobat = obat;
}    
public void Obat(int nomor){
        int i = nomor -1;
        System.out.println("======================================");
        System.out.println("Nama Pembeli    : "+penjualan[i][0]);
        System.out.println("Alamat Pembeli  : "+penjualan[i][1]);
        System.out.println("======================================");
        System.out.println("Total Biaya Obat:Rp."+penjualan[i][2]);
        System.out.println("======================================");       
    }
public  void displayObat(){
        for(int i=0;i < daftarobat.length;i++){
            int nomor = i + 1;
            System.out.println(nomor+"."+daftarobat[i][0]+"\t"+ daftarobat[i][1]);
        }
    }
    public  void displayPenjualan(){
        int totalpenjualan=0;
        System.out.println("=======================================");
        System.out.println("nomor\t nama \t alamat \t total harga");
        for(int i =0;i < penjualan.length;i++){
            int nomor = i + 1;
        System.out.println(nomor+".\t"+ penjualan[i][0]+"\t"+ penjualan[i][1]+"\t Rp."+penjualan[i][2]);
        }
        for(int i = 0;i<penjualan.length;i++){
            int sementara = Integer.parseInt(penjualan[i][2]);
            totalpenjualan = totalpenjualan + sementara;
        }
        System.out.println("=======================================");
        System.out.println("Total Penjualan = Rp."+totalpenjualan);
    }
    public  void Obat(int pilihan,int jumlah){
        int nomor = pilihan - 1;
        int harga = Integer.parseInt(daftarobat[nomor][1]);
        int dibeli = harga*jumlah;
        total = total + dibeli;
    }
}