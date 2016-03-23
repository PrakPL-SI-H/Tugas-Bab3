package prakproglan;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apotek obat = new Apotek();
        System.out.println("===========APOTEK WARASHO==========");
        System.out.println("===================================");
        System.out.print("Nama\t: ");
        obat.setNama(in.nextLine());
        System.out.print("Alamat\t: ");
        obat.setAlamat(in.nextLine());

    }
}
