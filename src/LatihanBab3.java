class Konversi{
    String bilangan[] = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh",
                    "Delapan","Sembilan","Sepuluh","Sebelas","Seratus","nol"};
    public void OverloadingMeth ( String A ){
        for (int i =0 ; i<bilangan.length ; i++){
       if (A.equalsIgnoreCase(bilangan[12])){
           System.out.println("Output Konversi : "+100); 
           break;
       }
       else if (A.equalsIgnoreCase(bilangan[i])){
           System.out.println("Output Konversi : "+i);
       }
       else if (A.equalsIgnoreCase(bilangan[i] +" Belas")){
           System.out.println("Output Konversi : "+(i+10)); 
       }
       else if (A.equalsIgnoreCase(bilangan[i] +" Puluh")){
           System.out.println("Output Konversi : "+(i*10));   
       }
       for (int j = 0 ; j<bilangan.length ; j++){
           if (A.equalsIgnoreCase(bilangan[i] + " Puluh " + bilangan[j])){
               System.out.println("Output Konversi : "+(i)+(j));
           }
       }
      } 
    }
    public void OverloadingMeth ( int A ){
        if (A == 0){
             System.out.println("Output Konversi : "+bilangan[13]);
         }
         else if (A == 100){
             System.out.println("Output Konversi : "+100);
         }
         else if ( A < 12){
             System.out.println("Output Konversi : "+bilangan[A]);
         }
         else if ( A >=12 && A <=19){
             System.out.println("Output Konversi : "+(bilangan[A%10])+" Belas");
         } 
         else if ( A>=20 && A<100){
             System.out.println("Output Konversi : "+(bilangan[A/10])+" Puluh "+(bilangan[A%10]));
         }
         else{
             System.out.println("Masukkan Range Antara 0-100!!");
         }   
    }   
}
public class LatihanBab3 {
    public static void main(String[] args) {
        System.out.println("tess");
        
        
    }
    
}
