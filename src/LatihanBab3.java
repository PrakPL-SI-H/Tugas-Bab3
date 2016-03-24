import java.util.Scanner;
//Class Conversion untuk mengkoversi dari string ke int maupun sebaliknya
class Conversion{
//inisialisasi isi dari array var
 String Var[] = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh",
                 "Delapan","Sembilan","Sepuluh","Sebelas","Seratus","nol"};
 //overoading method untuk konversi dari tipe data int ke tipe data string
 public void NrOverload ( int X ){
        if (X == 0){
        System.out.println("Hasil Konversi : "+Var[13]);
        }else 
        if (X == 100){
        System.out.println("Hasil Konversi : "+100);
        }else
        if ( X < 12){
        System.out.println("Hasil Konversi : "+Var[X]);
        }else 
        if ( X >=12 && X <=19){
        System.out.println("Hasil Konversi : "+(Var[X%10])+" Belas");
        }else
        if ( X>=20 && X<100){
        System.out.println("Hasil Konversi : "+(Var[X/10])+" Puluh "+(Var[X%10]));
        }else{ System.out.println("Masukkan Bilangan Antara 0-100!");
        }   
    }   
    //overloading method untuk konversi dari tipe ddata string ke intejer
    public void NrOverload ( String X ){
       for (int i =0 ; i<Var.length ; i++){
       if (X.equals(Var[12])){
       System.out.println("Hasil Konversi : "+100); 
       break;
       }else 
       if (X.equalsIgnoreCase(Var[i])){
       System.out.println("Hasil Konversi : "+i);
       }else 
       if (X.equalsIgnoreCase(Var[i] +" Belas")){
       System.out.println("Hasil Konversi : "+(i+10)); 
       }else
       if (X.equalsIgnoreCase(Var[i] +" Puluh")){
       System.out.println("Hasil Konversi : "+(i*10));   
       }
       for (int j = 0 ; j<Var.length ; j++){
       if (X.equals(Var[i] + " Puluh " + Var[j])){
       System.out.println("Hasil Konversi : "+(i)+(j));
           }
       }
      }    
    }
}
//Main Class
public class LatihanBab3 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        Conversion Konversi = new Conversion();
            System.out.print("Konversi String to Int (0-100): ");
                 Konversi.NrOverload(in.next());
            System.out.print("Konversi int to String (0-100): ");
                 Konversi.NrOverload(in.nextInt());
    }
}

