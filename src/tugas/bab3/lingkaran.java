package tugas.bab3;

public class lingkaran {

    int alas, tinggi;
    public String alas2;
    public String tinggi2;
    public lingkaran(int alas) {
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public lingkaran(String alas, String tinggi){
        alas2 = alas;
        tinggi2 = tinggi;
    }
  
    public void ubahStringKeInt(){
        String temp = alas2;
        int a = Integer.parseInt(temp);
        System.out.println("Alas    : "+a);
        
        String temp2 = tinggi2;
        int b = Integer.parseInt(temp2);
        System.out.println("Tinggi  : "+b);
    }
    
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}

class LIngkaranMain {

    public static void main(String[] args) {
        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();
        
        lingkaran Lstring = new lingkaran("5","11");
        Lstring.ubahStringKeInt();  
    }
}


