package prakproglan;
import java.util.Scanner;
public class MainBilanganTeks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BilanganTeks bete = new BilanganTeks();
        System.out.println("Pilihan Ubah : ");
        System.out.println("1. Mengubah Bilangan Menjadi Teks");
        System.out.println("2. Mengubah Teks Menjadi Bilangan");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1 :
                System.out.println("=================================");
                System.out.println("Mengubah Bilangan Menjadi Teks");
                System.out.print("Masukkan Bilangan : ");
                bete.overloadingMeth(in.nextInt());
                System.out.println("Output : "+bete.getAngBil());
                System.out.println("=================================");
                break;
            case 2 :
                System.out.println("=================================");
                System.out.println("Mengubah Teks Menjadi Bilangan");
                System.out.print("Masukkan Teks : ");
                bete.overloadingMeth(in.next());
                bete.overloadingMeth(in.next());
                System.out.println("Output : "+bete.getBilAng());
                System.out.println("=================================");
                break;
        }
    }
}
