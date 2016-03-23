package Praktikum;
public class AngkaHuruf {
    private String[] tulis = {" ", "Satu", "Dua", "Tiga", "Empat", "Lima","Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    private int ang;
    private String[] ka = new String[3];
    private String kal;

    public AngkaHuruf(int a) {
        ang = a;
    }

    public void ubahAng() {
        if (ang <= 11) {
            System.out.println(tulis[ang]);
        } else if (ang < 20) {
            System.out.println(tulis[ang - 10] + " Belas");
        } else if (ang < 100) {
            System.out.println(tulis[ang / 10] + " Puluh " + tulis[ang % 10]);
        } else if (ang == 100) {
            System.out.println("Seratus");
        } else {
            System.out.println("Angka yang anda inputkan melebihi limit");
        }
    }

    public AngkaHuruf() {
        kal = "";
    }

    public String ubahKal(String k) {

        String h;

        switch (k) {
            case "nol":
                h = "0";
                break;

            case "satu":
                h = "1";
                break;

            case "dua":
                h = "2";
                break;

            case "tiga":
                h = "3";
                break;

            case "empat":
                h = "4";
                break;

            case "lima":
                h = "5";
                break;

            case "enam":
                h = "6";
                break;

            case "tujuh":
                h = "7";
                break;

            case "delapan":
                h = "8";
                break;

            case "sembilan":
                h = "9";
                break;

            case "sepuluh":
                h = "10";
                break;

            case "sebelas":
                h = "11";
                break;

            case "seratus":
                h = "100";
                break;

            default:
                this.ka = k.split(" ");
                if (ka.length == 2) {
                    if (ka[1].equalsIgnoreCase("belas")) {
                        h = "1" + ubahKal(ka[0]);
                    } else {
                        h = ubahKal(ka[0]) + "0";
                    }
                } else{
                    h = ubahKal(ka[0]) + ubahKal(ka[2]);
                }
        }

        return h;

    }

}