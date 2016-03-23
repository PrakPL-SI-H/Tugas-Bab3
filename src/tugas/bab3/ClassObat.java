package program_Laporan;
import java.util.Scanner;

public class ClassObat {
     Scanner in = new Scanner(System.in);
     int totalObat1,totalObat2,totalObat3,totalObat4;
      public void Obat1(int jumlah){
         
       System.out.println("jumlah=" +jumlah);
         totalObat1=(jumlah*10000);
        System.out.println("Harganya adalah ="+totalObat1);
        
   }
     public void Obat2(int jumlah2){
       
       System.out.println("jumlah=" +jumlah2);
          totalObat2=(jumlah2*20000);
        System.out.println("Harganya adalah ="+totalObat2);
         
   }
     
       public void totalAll(int jumlahsemua){
          
         int TotalSemua = totalObat1+totalObat2+totalObat3+totalObat4;
           System.out.println("total harganya adalah ="+TotalSemua); 
           
       }

}

