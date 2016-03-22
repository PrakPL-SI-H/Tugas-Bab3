
public class UbahInput {

    String angka[];
    String huruf[];
    private String hrf[] = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
    private String bil[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void ubahAngka(int bil) {
        String x;
        if (bil > 9) {
            x = String.valueOf(bil);
            String angka[] = x.split("");
            huruf = new String[angka.length];
            for (int i = 0; i < angka.length; i++) {
                for (int j = 0; j < hrf.length; j++) {
                    String a = String.valueOf(j);
                    if (angka[i].equals(a)) {
                        huruf[i] = hrf[j];
                    }
                }
            }
        } else {
            x = String.valueOf(bil);
            huruf = new String[1];
            for (int i = 0; i < hrf.length; i++) {
                String a = String.valueOf(i);
                if (x.equals(a)) {
                    huruf[0] = hrf[i];
                }
            }
        }
        if (x.equals("11")) {
            huruf[0] = "Sebelas";
            huruf[1] = "";
        } else if (x.equals("10")) {
            huruf[0] = "Sepuluh";
            huruf[1] = "";
        } else if (angka.length == 2 && angka[0].equals("1")) {
            huruf[0] = huruf[1];
            huruf[1] = "Belas";
        } else if (angka.length == 2 && angka[1].equals("0")) {
            huruf[1] = "Puluh";
        } else if (angka.length == 2) {
            huruf[0] = huruf[1] + " Puluh";
        } else if (x.equals("100")) {
            huruf[0] = "Seratus";
            huruf[1] = "";
            huruf[2] = "";
        }
    }

    public void ubahHuruf(String hrf) {
        String huruf[] = hrf.split(" ");
        if (huruf.length > 1) {
            angka = new String[huruf.length];
            for (int i = 0; i < huruf.length; i++) {
                for (int j = 0; j < bil.length; j++) {
                    if (huruf[i].equalsIgnoreCase(this.hrf[j])) {
                        angka[i] = bil[j];
                    } else if (huruf[i].equalsIgnoreCase("puluh")) {
                        angka[i] = "";
                    } 
                }
            }
        } else {
            angka = new String[1];
            for (int i = 0; i < bil.length; i++) {
                if (hrf.equalsIgnoreCase(this.hrf[i])) {
                    angka[0] = bil[i];
                }
            }
        }

        
        if (hrf.equalsIgnoreCase("sebelas")) {
            angka[0] = "11";
        } else if (hrf.equals("sepuluh")) {
            angka[0] = "10";
        } else if (hrf.equals("seratus")) {
            angka[0] = "100";
        } 
    }

}
