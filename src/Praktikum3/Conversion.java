package Praktikum3;

public class Conversion {

    String words[] = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
        "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas", "Seratus", "Nol"};

    public void words2Number(String words) {
        for (int i = 0; i < this.words.length; i++) {
            for (int j = 0; j < this.words.length; j++) {
                if (words.equalsIgnoreCase(this.words[i] + " Puluh " + this.words[j])) {
                    System.out.println("In words : " + (i) + (j));
                }
            }

            if (words.equalsIgnoreCase(this.words[13])) {
                System.out.println("In words        : " + this.words[12]);
            } else if (words.equalsIgnoreCase(this.words[i])) {
                System.out.println("In words        : " + i);
            } else if (words.equalsIgnoreCase(this.words[i] + "Belas")) {
                System.out.println("In words        : " + (i + 10));
            } else if (words.equalsIgnoreCase(this.words[i] + "Puluh")) {
                System.out.println("In words        : " + (i * 10));
            } else if (words.equalsIgnoreCase(this.words[i])) {

            }
        }
    }
    
    
}
