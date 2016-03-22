package pratikum3;

public class Apotek {
        private String nama, alamat;
        private static int total;
        private static int a, b, c, d, e;

        public Apotek() {
            nama = "";
            alamat = "";
        }

        public Apotek(String a, String b) {
            nama = a;
            alamat = b;
        }

        public static void setHarga(int a1, int b1, int c1, int d1, int e1) {
            a = a1;
            b = b1;
            c = c1;
            d = d1;
            e = e1;
        }
    }
