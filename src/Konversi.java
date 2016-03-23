
public class Konversi {

    public String teks[] = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas", "Seratus"};

    public void overloadingMeth(int bil) {
        if (bil == 0) {
            System.out.println("Output teks: " + teks[0]);
        } else if (bil <= 11) {
            System.out.println("Output teks: " + teks[bil]);
        } else if (bil <= 19) {
            System.out.println("Output teks: " + teks[bil - 10] + " Belas");
        } else if (bil < 100) {
            System.out.println("Output teks: " + teks[bil / 10] + " Puluh " + teks[bil % 10]);
        } else if (bil == 100) {
            System.out.println("Output teks: " + teks[12]);
        } else {
            System.out.println("Maaf, input Anda melebihi range!");
        }
    }

    public void overloadingMeth(String teks) {
        for (int i = 0; i < this.teks.length; i++) {
            if (teks.equalsIgnoreCase(this.teks[12])) {
                System.out.println("Output bilangan: " + 100);
                break;
            } else if (teks.equalsIgnoreCase(this.teks[0])) {
                System.out.println("Output bilangan: " + 0);
                break;
            } else if (teks.equalsIgnoreCase(this.teks[i])) {
                System.out.println("Output bilangan: " + i);
            } else if (teks.equalsIgnoreCase(this.teks[i] + " Belas")) {
                System.out.println("Output bilangan: " + (i + 10));
            } else if (teks.equalsIgnoreCase(this.teks[i] + " Puluh")) {
                System.out.println("Output bilangan: " + (i * 10));
            }
            for (int j = 0; j < this.teks.length; j++) {
                if (teks.equalsIgnoreCase(this.teks[i] + " Puluh " + this.teks[j])) {
                    System.out.println("Output bilangan: " + (i) + (j));
                }
            }
        }
    }
}


