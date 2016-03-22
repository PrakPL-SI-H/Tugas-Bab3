import java.util.Scanner;
public class ConvertHurufAngkaDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner (System.in);

        ConvertHurufAngka ang = new ConvertHurufAngka();
        ConvertHurufAngka hur = new ConvertHurufAngka();
        System.out.print("Masukkan angka yang ingin di convert jadi huruf (0-100) : ");
        int angka = in.nextInt();
        System.out.print("Hasil Convert\t: ");
        ang.OverloadingMeth(angka);
        System.out.print("Masukkan angka dalam bentuk huruf : ");
        String huruf = input.nextLine();
        hur.OverloadingMeth(huruf);
    }

}
