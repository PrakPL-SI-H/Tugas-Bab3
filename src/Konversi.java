package bab3;

public class Konversi {
    static int a, b;
    public static void ubah(int x) {
        if (x < 10) {
            a = x % 10;
            ubahAngka(a);
        } else if (x > 20) {
            a = x % 10;
            b = x / 10;
            ubahAngka(b);
            System.out.print("Puluh ");
            ubahAngka(a);
        } else if (x > 10 && x < 20) {
            a = x % 10;
            ubahAngka(a);
            System.out.println("Belas");
        }
    }
    public static void ubahAngka(int x) {
        switch (x) {
            case 1:
                System.out.print("Satu ");
                break;
            case 2:
                System.out.print("Dua ");
                break;
            case 3:
                System.out.print("Tiga ");
                break;
            case 4:
                System.out.print("Empat ");
                break;
            case 5:
                System.out.print("Lima ");
                break;
            case 6:
                System.out.print("Enam ");
                break;
            case 7:
                System.out.print("Tujuh ");
                break;
            case 8:
                System.out.print("Delapan ");
                break;
            case 9:
                System.out.print("Sembilan ");
                break;
        }
    }
    public int overloadingMeth (String kata) {
        int spasi = 0, indexA = 0;
        String kata1 = " ", kata2 = " ";
        int angka1 = 0, angka2 = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == ' ') {
                spasi++;
            }
        }
        if (spasi == 2) {
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == ' ') {
                    indexA = i;
                    break;
                }
            }
            kata1 = kata.substring(0, indexA); 
            kata2 = kata.substring(indexA + 7); 
         }else if (spasi == 1) {
            for (int i = 0; i < kata.length(); i++) {
                if (kata.charAt(i) == ' ') {
                    indexA = i;
                    break;
                }
            }
            kata1 = kata.substring(0, indexA);
            kata2 = kata.substring(indexA + 1);
        } else if (spasi == 0) {
            kata1 = "";
            kata2 = kata;          }
        if (kata1.equalsIgnoreCase("dua")) {
            angka1 = 20;
        } else if (kata1.equalsIgnoreCase("tiga")) {
            angka1 = 30;
        } else if (kata1.equalsIgnoreCase("empat")) {
            angka1 = 40;
        } else if (kata1.equalsIgnoreCase("lima")) {
            angka1 = 50;
        } else if (kata1.equalsIgnoreCase("enam")) {
            angka1 = 60;
        } else if (kata1.equalsIgnoreCase("tujuh")) {
            angka1 = 70;
        } else if (kata1.equalsIgnoreCase("delapan")) {
            angka1 = 80;
        } else if (kata1.equalsIgnoreCase("sembilan")) {
            angka1 = 90;
        }
        if (kata2.equalsIgnoreCase("satu")) {
            angka2 = 1;
        } else if (kata2.equalsIgnoreCase("dua")) {
            angka2 = 2;
        } else if (kata2.equalsIgnoreCase("tiga")) {
            angka2 = 3;
        } else if (kata2.equalsIgnoreCase("empat")) {
            angka2 = 4;
        } else if (kata2.equalsIgnoreCase("lima")) {
            angka2 = 5;
        } else if (kata2.equalsIgnoreCase("enam")) {
            angka2 = 6;
        } else if (kata2.equalsIgnoreCase("tujuh")) {
            angka2 = 7;
        } else if (kata2.equalsIgnoreCase("delapan")) {
            angka2 = 8;
        } else if (kata2.equalsIgnoreCase("sembilan")) {
            angka2 = 9;
        } else if (kata2.equalsIgnoreCase("belas")) {
            angka1 = (angka1 / 10) + 10;
        } else if (kata2.equalsIgnoreCase("sepuluh")) {
            angka1 = 10;
        } else if (kata2.equalsIgnoreCase("sebelas")) {
            angka1 = 11;
        } else if (kata2.equalsIgnoreCase("nol")) {
            angka1 = 0;
        } else if (kata2.equalsIgnoreCase("seratus")) {
            angka1 = 100;
        }
        return angka1 + angka2;
    }
}