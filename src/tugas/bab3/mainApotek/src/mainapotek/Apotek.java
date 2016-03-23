package mainapotek;
public class Apotek {
    String Kode;
    String Nama;
    double harga;
    
    public Apotek(){
    }
    public Apotek(String a,String b,double c){
        Kode = a;
        Nama = b;
        harga = c;
    }
    public void display(){
        System.out.printf("%7s%19s%-24s%s%s\n",Kode," ",Nama,"Rp.",harga);
    }
}
