package mainapotek;

public class Apotek {
    String Kode;
    String Nama;
    double harga;
    
    public Apotek(){
    }
    
    public Apotek(String x,String y,double z){
        Kode = x;
        Nama = y;
        harga = z;
    }
    
    public void display(){
        System.out.printf("%7s%19s%-24s%s%s\n",Kode," ",Nama,"Rp.",harga);
    }
}
