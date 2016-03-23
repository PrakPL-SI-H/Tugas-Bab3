package Praktikum3;

public class Konversi {

    int angka, hasila;
    String bilangan, hasilb;

    public Konversi() {
    }

    //bilangan berupa string
    public Konversi(String x) {
        bilangan = x;
    }
    //bilangan satuan sampai sebelas
    String[] bilangansatuan = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    String[] bilanganspuluhan = {"", "sepuluh", "dua puluh ", "tiga puluh ", "empat puluh ", "lima puluh ", "enam puluh ", "tujuh puluh ", "delapan puluh ", "sembilan puluh "};

    //angka berupa integer
    public Konversi(int y) {
        angka = y;
    }
    
    //angka satuan 1-11
    int[] satuan = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    
    public void overloadingMethod(String b) {
        if (b.equalsIgnoreCase("seratus")) {
            hasila = 100;
        } else {
            for (int i = 0; i < bilangansatuan.length; i++) {
                for (int j = 0; j < bilangansatuan.length; j++) {
                    if (b.equalsIgnoreCase(bilangansatuan[i])) {
                        hasila = i;
                    } else if (b.equalsIgnoreCase(bilangansatuan[i] + " puluh")) {
                        hasila = i * 10;
                    } else if (b.equalsIgnoreCase(bilangansatuan[i] + " belas")) {
                        hasila = i + 10;
                    } else if (b.equalsIgnoreCase(bilangansatuan[i] + " puluh " + bilangansatuan[j])) {
                        hasila = i * 10 + j;
                    }
                }
            }
        }
        System.out.println("Hasilnya = " + hasila);
    }

    public void overloadingMethod(int a) {
        int satuan, puluhan;
        satuan = a % 10;
        puluhan = (a % 100) / 10;
        if (a == 100) {
            hasilb = "seratus";
            System.out.println("Bilangannya adalah : "+hasilb);
        } else {
            if (puluhan == 1) {
                if (satuan == 1) {
                    System.out.println("Bilangannya adalah : "+bilangansatuan[11]);
                } else {
                    System.out.println("Bilangannya adalah : " + bilangansatuan[satuan] + " belas");
                }
            } else {
                System.out.println("Bilangannya adalah : " + bilangansatuan[puluhan] + " puluh " + bilangansatuan[satuan]);
            }
        }
    }

    public void showBilangan(int a) {
        overloadingMethod(a);
    }

    public void showAngka(String b) {
        overloadingMethod(b);
    }
}
