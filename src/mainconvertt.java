import java.util.Scanner;
    public class mainconvertt {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Scanner in2 = new Scanner(System.in);
            boolean loop = true;
            while(loop){
                convert angka = new convert();
                angka.menu();
               int pilih = in.nextInt();
               switch(pilih){
                   case 1: System.out.print("Masukkan Angka: ");
                           int x = in.nextInt();
                           angka.overloadingMeth(x);break;
                   case 2: System.out.print("Masukkan String Angka: ");
                         String s = in2.nextLine();
                           angka.overloadingMeth(s);break;
                   case 3: loop = false;break;
		default: System.out.println("Maaf Pilihan anda tidak terdapat pada menu");break;
               }
           }
        }
    }