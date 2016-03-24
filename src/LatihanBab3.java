import java.util.Scanner;

class Conversion{


 String Var[] = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh",
                 "Delapan","Sembilan","Sepuluh","Sebelas","Seratus","nol"};
 
 
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

}


public class LatihanBab3 {
    public static void main(String[] args) {
        System.out.println("tess");
        
        
    }
    
}

