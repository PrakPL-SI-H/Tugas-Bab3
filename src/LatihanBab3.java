import java.util.Scanner;
public class Apotek {
String nama,alamat;
int pilihan;
int hargaobat [] = {0,5000,2500,7000,21000,6000};
String namaobat [] = {"","A ","B","C","D","E"};
public Apotek(String x, String y){
Apotek(x,y);
}
public Apotek(int x){
Apotek(x);
}
public void Apotek(String x,String y){
}
public void Apotek(){
System.out.println();
System.out.println("=Apotek=")
+ "Selamat datang..Silahkan pilih obat yg kamu butuhkan!\n"
+ "1. A                 Rp. 5000\n"
+ "2. B                 Rp. 2500\n"
+ "3. C                 Rp. 7000\n"
+ "4. D                 Rp. 21000\n"
+ "5. E                 Rp. 6000\n");
}

public void Apotek(int x){
this.pilihan = x;
switch (this.pilihan){
case 1 : System.out.println("Kamu membeli obat "+namaobat[this.pilihan]+" dengan harga "+hargaobat[this.pilihan]);
System.out.println("Obat berhasil dibeli");
break;
case 2 : System.out.println("Kamu membeli obat "+namaobat[this.pilihan]+" dengan harga "+hargaobat[this.pilihan]);
System.out.println("Obat berhasil dibeli");
break;
case 3 : System.out.println("Kamu membeli obat "+namaobat[this.pilihan]+" dengan harga "+hargaobat[this.pilihan]);
System.out.println("Obat berhasil dibeli");
break;
case 4 : System.out.println("Kamu membeli obat "+namaobat[this.pilihan]+" dengan harga "+hargaobat[this.pilihan]);
System.out.println("Obat berhasil dibeli");
break;
case 5 : System.out.println("Kamu membeli obat "+namaobat[this.pilihan]+" dengan harga "+hargaobat[this.pilihan]);
System.out.println("Obat berhasil dibeli");
break;
default :System.out.println("Tidak ditemukan");break;
}
}
}