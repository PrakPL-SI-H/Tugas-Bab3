import java.util.Scanner;
public class MainKonversi {
	public static void main(String[] args) {
		Konversi Angka = new Konversi();
                Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
		int satuan = in.nextInt();
		System.out.println("Dibaca = "+ Angka.angka(satuan));
                
	}
	
}
