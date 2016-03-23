package PrakPemLan;

public class Mengubah {

    private int bentukbil, i, j;
    String[] teksAngka = {" nol ", " satu ", " dua ", " tiga ", 
        " empat ", " lima ", " enam ", " tujuh ",
        " delapan ", " sembilan ", " sepuluh ", " sebelas ", 
        " seratus "};

    public void overloadingMeth(int bil) {
        bentukbil = bil;
        if (bentukbil <= 11) {
            i = bentukbil;
            System.out.println(teksAngka[i]);
        } else if (bentukbil > 10 && bentukbil < 20) {
            i = (bentukbil) % 10;
            System.out.println(teksAngka[i] + " belas ");
        } else if (bentukbil >= 20 && bentukbil < 100) {
            i = (bentukbil) / 10;
            j = (bentukbil) % 10;
            if (j != 0) {
                System.out.println(teksAngka[i] + " puluh " + teksAngka[j]);
            } else if (j == 0) {
                System.out.println(teksAngka[i] + " puluh ");
            }
        } else if (bentukbil == 100) {
            System.out.println(teksAngka[12]);
        }
    }

    public int overloadingMeth(String tls) {
        String[] teksBil = tls.split("_");
        int x = 0;
        for (int i = 0; i < teksBil.length; i++) {
            switch (teksBil[i]) {
                case "nol":
                    x = 0;
                    break;
                case "satu":
                    x += 1;
                    break;
                case "dua":
                    x += 2;
                    break;
                case "tiga":
                    x += 3;
                    break;
                case "empat":
                    x += 4;
                    break;
                case "lima":
                    x += 5;
                    break;
                case "enam":
                    x += 6;
                    break;
                case "tujuh":
                    x += 7;
                    break;
                case "delapan":
                    x += 8;
                    break;
                case "sembilan":
                    x += 9;
                    break;
                case "sepuluh":
                    x += 10;
                    break;
                case "puluh":
                    x *= 10;
                    break;
                case "sebelas":
                    x += 11;
                    break;
                case "belas":
                    x += 10;
                    break;
                case "seratus":
                    x = 100;
                    break;
            }
        }
        return x;
    }
}