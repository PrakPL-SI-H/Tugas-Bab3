import java.util.Scanner;
public class MainKonversi {
	public static void main(String[] args) {
		Konversi Angka = new Konversi();
                String s;
                int a;
                Scanner in = new Scanner(System.in);
             do{
                System.out.println("Menu");
                System.out.println("1.Konversi Angka ke Huruf");
                System.out.println("2.Konversi Huruf ke Angka");
                System.out.print("Masuk pilihan = ");
                a = in.nextInt();
                switch(a){
                case 1:
                    System.out.print("Masukkan angka anda : ");
                    Angka.overloadingMeth(in.nextInt());
                    System.out.println(Angka.getHasilHuruf());
                    break;
                case 2:
                    System.out.print("Masukkan huruf anda : ");
                    Angka.overLoadingMeth(in.nextLine());
                    Angka.overLoadingMeth(in.nextLine());
                    System.out.println(Angka.getHasilAngka());
                    break;
                }
                System.out.print("Ingin konversi lagi? (y/n) : ");
                s = in.next();
           }while(a  != 0 && !s.equalsIgnoreCase("n"));
            System.out.println("Terima Kasih Sudah Mencoba");
        }
}