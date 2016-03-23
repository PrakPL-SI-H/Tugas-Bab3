   public class convert {
        String angka[] ={"nol","satu","dua","tiga","empat","lima","enam","tujuh",
"delapan","sembilan", "sepuluh", "sebelas"};
       public void menu(){
           System.out.println("=======MENU KONVERSI=======");
          System.out.println("1. Konversi Angka ke String");
          System.out.println("2. Konversi String ke Angka");
         System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda : ");
        }
       public void overloadingMeth(int x){
           if (x>=0 && x<12){
               System.out.println("Hasil : "+ angka[x]+"\n");
           }
           else if (x>11 && x<20){
               System.out.println("Hasil : "+ angka[x%10]+"belas\n");
           } 
           else if (x>=20 && x<100){
               if (x%10 == 0){
                   System.out.println("Hasil : "+ angka[x/10]+"puluh\n");
              }
               else{
		System.out.println("Hasil : "+angka[x/10]+" puluh "+ angka[x%10]+"\n");
               }
           }
           else if (x==100){
               System.out.println("Hasil : seratus\n");
           }
           else{
               System.out.println("Maaf, angka harus antara 1-100\n");
           }
       }
       public void overloadingMeth(String s){
           for (int i=0; i<=11; i++){
               for (int j=1; j<10;j++){
                   if(s.equalsIgnoreCase(angka[i]+" puluh"+angka[j])){
                       System.out.println("Hasil :"+(i*10+j)+"\n");
               }
               }
               if(s.equalsIgnoreCase(angka[i])){
                   System.out.println("Hasil : "+i+"\n");
               }
               else if(s.equalsIgnoreCase(angka[i]+" belas ")){
                   System.out.println("Hasil : "+(i+10)+"\n");
               }
               else if(s.equalsIgnoreCase(angka[i]+" puluh ")){
                   System.out.println("Hasil : "+(i*10)+"\n");
               }
 





       }
   
       }
   }