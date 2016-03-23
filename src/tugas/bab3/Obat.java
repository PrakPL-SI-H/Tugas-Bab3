package mainapotek;

public class Obat {
    public int kode[] = {1, 2, 3, 4, 5};
    public String obat[] = {"Obat 1", "Obat 2", "Obat 3", "Obat 4", "Obat 5"};
    public int uang[] = {3500, 5500, 3000, 4500, 2500};
    public int z[];
    
    void tampilkanObat(){
        System.out.println("DAFTAR OBAT");
        System.out.println("KODE  | DESKRIPSI\t| Harga");
        System.out.println(" 1    | Obat 1 \t\t|  3500");
        System.out.println(" 2    | Obat 2 \t\t|  5500");
        System.out.println(" 3    | Obat 3 \t\t|  3000");
        System.out.println(" 4    | Obat 4 \t\t|  4500");
        System.out.println(" 5    | Obat 5 \t\t|  2500");
    }
}
