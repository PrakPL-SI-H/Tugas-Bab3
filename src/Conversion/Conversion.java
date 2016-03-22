package Conversion;

public class Conversion {

    private String words[] = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas", "Seratus", "Nol"};

        public void overloadingMeth(int num) {
        if (num == 0) {
            System.out.println("In words        : " + words[13]);
        } else if (num <= 11) {
            System.out.println("In words        : " + words[num]);
        } else if (num <= 19) {
            System.out.println("In words        : " + words[num - 10] + " Belas");
        } else if (num < 100) {
            System.out.println("In words        : " + words[num / 10] + " Puluh " + words[num % 10]);
        } else if (num == 100) {
            System.out.println("In words        : " + words[12]);
        } else {
            System.out.println("Input out of range");
        }
    }

    public void overloadingMeth(String words) {
        for (int i = 0; i < this.words.length; i++) {
            if (words.equalsIgnoreCase(this.words[12])) {
                System.out.println("In number       : " + 100);
                break;
            } else if (words.equalsIgnoreCase(this.words[i])) {
                System.out.println("In number       : " + i);
            } else if (words.equalsIgnoreCase(this.words[i] + " Belas")) {
                System.out.println("In number       : " + (i + 10));
            } else if (words.equalsIgnoreCase(this.words[i] + " Puluh")) {
                System.out.println("In number       : " + (i * 10));
            }
            for (int j = 0; j < this.words.length; j++) {
                if (words.equalsIgnoreCase(this.words[i] + " Puluh " + this.words[j])) {
                    System.out.println("In number       : " + (i) + (j));
                }
            }
        }
    }
}
